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

Ejecucion desde Jenkins
![Alt text](screenshots/screenshot1.png?raw=false "Ejecucion desde Jenkins")

Log de ejecucion de Jenkins
![Alt text](screenshots/screenshot2.png?raw=false "Ejecucion desde Jenkins")

Prueba de ejecucion con un error intencional, adjunta donde fue el problema
![Alt text](screenshots/screenshot3.png?raw=false "Ejecucion desde Jenkins")

Ejecucion sin problemas
![Alt text](screenshots/screenshot4.png?raw=false "Ejecucion desde Jenkins")

Consola de selenoid-UI muestra los browser abiertos en ejecucion(5 sesiones maximas concurrentes)
![Alt text](screenshots/screenshot5.png?raw=false "Ejecucion desde Jenkins")

Ejecucion desde Jenkins
![Alt text](screenshots/screenshot6.png?raw=false "Ejecucion desde Jenkins")

Reporte sin problemas
![Alt text](screenshots/screenshot7.png?raw=false "Ejecucion desde Jenkins")

Ejecucion desde Jenkins
![Alt text](screenshots/screenshot8.png?raw=false "Ejecucion desde Jenkins")

Test en ejecucion
![Alt text](screenshots/screenshot9.png?raw=false "Ejecucion desde Jenkins")

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

