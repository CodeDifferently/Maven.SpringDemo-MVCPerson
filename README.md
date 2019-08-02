## How to use
* **Purpose** - To demonstrate use of a very basic MVC Spring project


#### Part 1 - Running the Program
1. Begin by _cloning_ this project into your `~/dev` directory.
2. Navigate to the newly _cloned_ project.
3. Open the project in IntelliJ from the `pom.xml`
    * When prompted, select `Open As Project`
4. Run the `MainApplication` to begin exposing _endpoints_ for a client to make _requests_ to.
 



<hr>

#### Part 2 - Viewing All `PersonRepository` Contents
* From Postman, make a _get_ request to `localhost:8080/person/readAll`.
    * An empty list should return





<hr>

#### Part 3 - Creating a `Person`
* From Postman, make a _post_ request to `localhost:8080/person/create` using the `JSON` body displayed below.
    * to make a _post_ request, ensure
        1. the _request-type_ has been set to `POST`
        2. the _request-body_ has been populated from the `Body` tab of the interface
        3. the _request-data_ has been set to `JSON (application/json)`
* From Postman, make a _get_ request to `localhost:8080/person/readAll` to verify that the person has been added.

```JSON
{
  "id": 1,
  "firstName": "John",
  "lastName": "Smith",
  "age": 30
}
```








<hr>

#### Part 4 - Updating a `Person`
* From Postman, make a _put_ request to `localhost:8080/person/update` using the `JSON` body displayed below.
    * to make a _put_ request, ensure
        1. the _request-type_ has been set to `PUT`
        2. the _request-body_ has been populated from the `Body` tab of the interface
        3. the _request-data_ has been set to `JSON (application/json)`
* From Postman, make a _get_ request to `localhost:8080/person/readAll` to verify that the person has been modified.


```JSON
{
  "id": 1,
  "firstName": "Johnson",
  "lastName": "Smithson",
  "age": 30
}
```








<hr>

#### Part 5 - Reading a `Person` by ID
* From Postman, make a _get_ request to `localhost:8080/person/read/1`.
    * ensure that a single object is returned rather than a list. 
    * ensure that the field-values of the returned `Person` object corresponds to the values set in `Part 4`.










<hr>

#### Part 6 - Deleting a `Person`
* From Postman, make a _delete_ request to `localhost:8080/person/delete/1`
* From Postman, make a _get_ request to `localhost:8080/person/read/1`.
    * ensure that the object has been deleted
* The following response should be visible.

```JSON
{
    "timestamp": "2019-08-02T18:42:59.829+0000",
    "status": 500,
    "error": "Internal Server Error",
    "message": "No value present",
    "path": "/person/read/1"
}
```