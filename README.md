# HWA-Monster-Project

A Hobby Web Application that enables a user to create, read, update and delete entries to and from a specified database.

## Getting Started

This application can be found in the repository on GitHub - https://github.com/RicharddeYoung/HWA-Monster-Project.git

### Prerequisites

This project was written with:

* [MySQL Workbench](https://dev.mysql.com/downloads/workbench/) - Visual Database Design Tool
* [Eclipse](https://eclipse.org/downloads/) - Integrated Development Environment
* [Visual Studio Code](https://code.visualstudio.com/download) - JavaScript, HTML, CSS etc Development Environment
* [Maven](https://maven.apache.org/) & [JUnit](https://juit.org/) - Building and executing tests
* [git Bash](https://git-scm.com/) - Terminal for running programme once built


## Installation

* MySQL Workbench:
  1. [Download the installer](https://dev.mysql.com/downloads/windows/installer/8.0.html/).
  2. 


## Building

In order to build a working version of this programme, you must first enter the repository folder downloaded from GitHub (above) and moved into the target folder. From there, open git Bash into the folder and type `mvn clean package`. Once that is complete, type `java -jar hwamonstermaker-0.0.1-SNAPSHOT-jar-with-dependencies.jar`.


## Running the tests

Once you have the code open within your preffered IDE, you need to select the top level of the src/test/java and launch as Unit Test to begin testing.
![image](https://user-images.githubusercontent.com/103578351/172025693-d46b387b-881d-4b6d-8625-75b86923e45b.png)



### Unit Tests 

The unit tests are designed to test the core files of the programme, as well as the most basic methods for each class. This includes the CRUD and Controller tests. The tests are run with set results expected and are only able to pass when the test return matches the expected results for each test.
In this case, we are testing the create, read, update and delete functions of the application, with several different variations on the read method to cover different search criteria, including:  Read All
                      Read By Family
                      Read By Diet
                      Read By Origin
                      Read By Flight
                      Read By Swim
                      Read By Family and Diet
                      Read By Family and Origin
                      Read By Diet and Origin


## Built With

* [Git](https://git-scm.com/) - Version Control System
* [GitHub](https://github.com/) - Source Code Management
* [Jira](https://start.atlassian.com/) - Kanban Board
* [MySQLServer](https://dev.mysql.com/) - Database Management System
* [Visual Studio Code](https://code.visualstudio.com/download/) - Front-End programming Language Editor
* [Java](https://java.com/) - Back-End Programming Language
* [Maven](https://maven.apache.org/) - Build Tool
* [JUnit](https://junit.org/) - Unit Testing
* [Mockito](https://site.mockito.org/) - Mock Testing


## Authors

* **Richard de Young** - [RicharddeYoung](https://github.com/RicharddeYoung)


## Acknowledgments

* Thank you to Anoush and the rest of the cohort for invaluable help in fixing and streamlining parts of my code
