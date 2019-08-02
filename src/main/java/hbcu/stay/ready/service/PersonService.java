package hbcu.stay.ready.service;

import hbcu.stay.ready.domain.Person;
import hbcu.stay.ready.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }


    public Person create(Person person) {
        return repository.save(person);
    }

    public Person read(Long id) {
        return repository.findById(id).get();
    }


    public Iterable<Person> readAll() {
        return repository.findAll();
    }


    public Person update(Long id, Person newData) {
        Person dataToUpdate = read(id);
        Long newId = newData.getId();
        String newFirstName = newData.getFirstName();
        String newLastName = newData.getLastName();
        Integer newAge = newData.getAge();

        dataToUpdate.setId(newId);
        dataToUpdate.setFirstName(newFirstName);
        dataToUpdate.setLastName(newLastName);
        dataToUpdate.setAge(newAge);

        return repository.save(dataToUpdate);
    }


    public Person delete(Long id) {
        Person data = repository.findById(id).get();
        repository.delete(data);
        return data;
    }
}
