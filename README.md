:spring_boot_version: 2.3.5.RELEASE
:spring-boot: https://github.com/edaaa/vehicle
:project_id: vehicle


== What You Need

:java_version: 11

----
./mvnw spring-boot:run
----

The actuator exposes the following:

* http://localhost:8080/car/list
* http://localhost:8080/car/add
* http://localhost:8080/car/update

* http://localhost:8080/vehicle/list

* http://localhost:8080/truck/list
* http://localhost:8080/truck/add
* http://localhost:8080/truck/update


== The Postman

https://www.postman.com/collections/b699e618ddb90d2ff118

== Output Json 

{"info":{"_postman_id":"6c5dabf4-8e1c-4e08-ba28-17573297a6c6","name":"Car","schema":"https:\/\/schema.getpostman.com\/json\/collection\/v2.0.0\/collection.json"},
"item":[{"name":"cabrio","_postman_id":"3f7912ae-ac9f-4fdb-961a-8562669c9777","request":{"method":"GET","header":[],"url":"localhost:8080\/car\/cabrio"},"response":[]},
{"name":"sedan","_postman_id":"d145ebe0-6b87-4cde-83dc-315483451f83","request":{"method":"GET","header":[],"url":"localhost:8080\/car\/sedan"},"response":[]},
{"name":"hatchback","_postman_id":"09f4d565-406b-4eaa-9f38-2723c4633b7d","request":{"method":"GET","header":[],"url":"localhost:8080\/car\/hatchback"},"response":[]}]}