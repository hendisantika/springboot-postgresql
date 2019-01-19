# springboot-postgresql
Overview

In this project, We will show how Spring boot and spring data jpa can be used to integrate with postgresql.

#### Step 1 Download the code from github

`git clone https://github.com/hendisantika/springboot-postgresql.git`

#### Step 2 Build the project

`gradlew clean build`

#### Step 3 Launch the application

`java -jar java -jar build/libs/springboot-posgresql-0.0.1-SNAPSHOT.jar`

#### Step 4 Use Curl or Postman to test the REST apis created.

APIs for Postgresql usage

1. Bulk upload of the customers using below api. No need to pass any data.

    http://localhost:8080/bulkcreate

2. POST call to insert one customer based on the JSON data passed.

    http://localhost:8080/create
    JSON data
    ```
    {
        "firstName": "Aburame",
        "lastName": "Shino"
    }
    ```

3. GET call to retrive all customers.

    http://localhost:8080/findall

4. GET call to search customer by id. http://localhost:8080/search/{id}

5. GET call to search customer by first name. http://localhost:8080/searchbyfirstname/{firstname}
