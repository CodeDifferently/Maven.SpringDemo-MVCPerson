package hbcu.stay.ready.controller;

import hbcu.stay.ready.domain.Person;
import hbcu.stay.ready.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    private PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Person> create(@RequestBody Person person) {
        return new ResponseEntity<>(
                service.create(person),
                HttpStatus.CREATED);
    }

    @GetMapping(value = "/read/{id}")
    public ResponseEntity<Person> read(@PathVariable Long id) {
        return new ResponseEntity<>(
                service.read(id),
                HttpStatus.OK);
    }


    @GetMapping(value = "/readAll")
    public ResponseEntity<Iterable<Person>> readAll() {
        return new ResponseEntity<>(
                service.readAll(),
                HttpStatus.OK);
    }


    @PutMapping(value = "/update")
    public ResponseEntity<Person> update(@PathVariable Long id, @RequestBody Person newData) {
        return new ResponseEntity<>(
                service.update(id, newData),
                HttpStatus.OK);
    }


    @DeleteMapping(value = "/delete")
    public ResponseEntity<Person> delete(@PathVariable Long id) {
        return new ResponseEntity<>(
                service.delete(id),
                HttpStatus.OK);
    }


}
