#Challenge Crowdar

## Table of Contents
1. [General Info](#general-info)
2. [Technologies](#technologies)
3. [Installation](#installation)

### General Info
***
The objective of the following project is to carry out functional tests for the saucedemo web application.
Automated functional testing with Cucumber, Junit, Java, maven, with a POM pattern.

Docker is necesary to run tests in the selenoid containers, and selenoid-ui to see the execution by VNC.
It has a Page object model.

### Screenshot

[comment]: <> (![Image text]&#40;https://www.united-internet.de/fileadmin/user_upload/Brands/Downloads/Logo_IONOS_by.jpg&#41;)

## Technologies
***
A list of technologies used within the project:

* Jdk1.8 o superior.
* Apache Maven 3.+.
* Docker 18.+

## Installation
***
A little intro about the installation.

```
$ git clone https://github.com/JuaanO/challengeCrowar.git
$ cd challengeCrowdar
$ docker-compose -f docker.yml up
$ mvn clean test
```

