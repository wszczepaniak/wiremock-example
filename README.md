# wiremock-example
Rest Service Mock using Wiremock Example with SpringBoot application

## Prerequisites
This project uses springboot, junit, lombok, gradle.
* Recomended IDE : IntelliJ with enabled **gradle** functionality and **lombok plugin**, also enabled **annotation processing** is required.
* Java 8

## Running tests
You can run tests from commandline using
 * `gradlew test` - in windows commandline
 * `./gradlew test` - in PROPER consoles ;)

## The main dish

Java based usage of Wiremock resides in **_src/test/java/example/LocalControllerTest.java_**

## Wiremock standalone

You can run a standalone instance of Wiremock for use in several applications.
Standalone version is manageable in real-time (by json requests) or can be supported by the files inside __mappings__ and ____files__ directory

Example running command from the **_wiremock-standalone_** directory : 
`java -jar wiremock-standalone-2.5.1.jar --verbose --port 8090`

I prepared one request stub inside **_wiremock-standalone/mapping_** directory, you can check it out.

## Postman

For fluent work with REST requests I personally use _Postman_ application for Chrome browser.
I prepared simple postman collection, importable into postman, so you could directly start testing wiremock solution
Postman request collection resides in __postman-collection__ directory.



