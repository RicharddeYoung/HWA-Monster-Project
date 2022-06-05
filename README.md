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

* **MySQL Workbench**:
<details>
  <summary>* **MySQL Workbench**</summary>
  1. [Download the installer](https://dev.mysql.com/downloads/windows/installer/8.0.html/).
  2. Run the installer.
  3. You should see a pop-up asking to allow the installer to run and make changes to your system. Accept this pop-up.
  4. Once the installer is running, a screen should appear asking you to hoose a **Setup Type**; choose **Custom** and click **Next**.
  ![image](https://user-images.githubusercontent.com/103578351/172066238-31fe3a71-73c4-4379-90e7-a5b8e2266822.png)
  5. The following software will need to be selected and installed:
    * The newest **MySQL Server** from **MySQL Servers**.
    * The newest **MySQL Workbench** from **Applications**.
    * The newest **Samples and Examples** from **Documentation**.
  ![image](https://user-images.githubusercontent.com/103578351/172066475-c2f200a0-3686-4cd0-ba63-7a4f8d37c926.png)
  6. Once selected, click **Next**.
  7. You should now me on the **Download** page; click **Execute**. It should take a few moments for it all to be downloaded to your machine.
  8. Once the downloads are complete, click **Next**.
  9. Once on the **Installation** page, click **Execute**. The installation should finish after a few minutes.
  10. Once complete, click **Next**.
  11. Once on the **Product Configuration** page, click **Next**.
  12. Once on the **Type and Networking** page, click **Next**.
  13. Once on the **Authentication Method** page, click **Next**.
  14. Once on the **Accounts and Roles** page, enter a password for the _root_ (admin) account into the two password fields. (Use something easy to remember, because if you forget the password you will need to reinstall MySQL) Then, click **Next**.
  ![image](https://user-images.githubusercontent.com/103578351/172067126-57e16355-9d06-407b-97f6-f5bdb6cb3336.png)
  15. You should now be on the **Windows Service** page. Click **Next**.
  16. Once on the **Apply Configuration** page, click **Execute**.
  17. Once complete, click **Finish**.
  18. You should now be on the **Product Configuration** page. Click **Next**.
  19. This should take you to the **Connect To Server** page, where you should enter the password and click **Check**.
  ![image](https://user-images.githubusercontent.com/103578351/172067247-aaaca218-71c0-4ec9-b488-26b112111e7b.png)
  20. If configuration is successful, click **Next**.
  21. Once on the **Apply Configuration** page, click **Execute**.
  22. Once complete, click **Finish**.
  23. You should have been returned to the **Product Configuration** page, so click **Next** again.
  24. You should now be on the **Installation Complete** page. Click **Finish** and this will open MySQL Workbench.
  25. To set up the environment variable, search in the Start Menu for 'env' and click the option to _edit system environment variables_.
  ![image](https://user-images.githubusercontent.com/103578351/172067433-095fab9d-a4cd-4dd1-a0ec-eec6ce6e3424.png)
    You should see the following window:
  ![image](https://user-images.githubusercontent.com/103578351/172067500-fb11b261-f93c-4e6f-94dd-91b8828e4666.png)
    Click _Environment varibles_. This should open another window:
  ![image](https://user-images.githubusercontent.com/103578351/172067535-f7da2aab-7d73-4929-9f38-93faa7ce1aac.png)
  26. In the bottom _System Variables_ panel of this window, click _New_, then in the window which opens, replicate the following setup:
  ![image](https://user-images.githubusercontent.com/103578351/172067593-b684eee5-f0cb-4838-960f-56b33e51d715.png)
    Click _OK_, then scroll in the bottom panel until you find the _Path_ variable. Select it and click _Edit_, then _New_ and add %MYSQL_HOME%\bin
  ![image](https://user-images.githubusercontent.com/103578351/172067663-64094648-ee35-4f2c-9be6-21ee7e6c2f77.png)
    Click _OK_ recursively until all system windows are closed.
</details>





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
