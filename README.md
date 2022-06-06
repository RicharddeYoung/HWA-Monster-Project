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
* [GitHub](https://github.com/) - Repository


## Installation

* **MySQL Workbench**:
  1. Click [here](https://dev.mysql.com/downloads/windows/installer/8.0.html/) to download the installer.
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

* **Java**:
  1. Download the latest stable version of Java [here](https://www.oracle.com/java/technologies/javase/jdk14-archive-downloads.html).
  2. Double click the executable "jdk-14.0.1_window-x64_bin.exe"/"jdk-8u221-windows-x64.exe". The following window will appear. Click **Next"".  
  ![image](https://user-images.githubusercontent.com/103578351/172070129-d148a981-e00a-477a-855e-1e1d2bfcc5db.png)  
  3. Then click **Next** again.  
  ![image](https://user-images.githubusercontent.com/103578351/172070434-3e4d6126-832d-4613-9c59-c30b7e23b4d9.png)  
  4. Click **Next** again.  
  ![image](https://user-images.githubusercontent.com/103578351/172070531-78dc2038-73c0-46b5-9607-a645d8cb6120.png)  
  5. Click **Close**.  
  ![image](https://user-images.githubusercontent.com/103578351/172070668-9190465b-4efe-4f82-b1bb-c719278835cf.png)  
  6. The JDK will now be installed in C://Program Files/Java
  7. Next we need to set the environment variables for the JDK. Search in the Start Menu for 'env' and click the option to _edit system environment variables_.  
  ![image](https://user-images.githubusercontent.com/103578351/172071128-ea95d06d-a6d9-4dac-a9cb-ce81fde7b1d8.png)  
  8. Click _Environment Variables_. This should open another window.  
  ![image](https://user-images.githubusercontent.com/103578351/172071472-5bd84c45-c9f1-493a-be1e-4f96300fae23.png)  
  9. In the bottom _System variables_ window, select **New**.  
  ![image](https://user-images.githubusercontent.com/103578351/172071601-89f380e4-5f3d-42d1-b866-133e6ea774fb.png)  
  10. In the pop-up window, create the JAVA_HOME cariable and give it a value corresponding to the JDK folder.  
  ![image](https://user-images.githubusercontent.com/103578351/172071637-c8ca107b-5b1c-4ac1-9854-396425048e26.png)  
  11. Click **OK**.  
  ![image](https://user-images.githubusercontent.com/103578351/172071649-87df771d-3e26-4009-89cb-6e142848bcd6.png)  
  12. Next, edit the **Path** variable to include a reference to the /bin (binary files) folder in JAVA_HOME by selecting the **Path** variable under _System variables_ and click **Edit...**  
  ![image](https://user-images.githubusercontent.com/103578351/172072141-cf8904d9-efaf-4666-93b1-33c6e415ec07.png)  
  13. The path of the Java /bin folder needs to be appended, referencing the JAVA_HOME variable: %JAVA_HOME%\bin
  14. Once complete, the **Path** variable should resemble the image below (note the semi-colon after %JAVA_HOME%\bin).  
  ![image](https://user-images.githubusercontent.com/103578351/172072479-3b53df87-f099-4162-b5fe-bc6652f69387.png)  
  15. Test this by opening **command prompt**, type **java** and hit enter.
      If the OS runs, the file called Java.exe should show the following output:  
  ![image](https://user-images.githubusercontent.com/103578351/172072634-a0e64c4f-6cab-4b8c-b0ef-5110c444bda8.png)  
  16. It's possible to check which Java version is on your system by typing "java -version" into your **command prompt**.

* **Maven**:
  1. Navigate to the _Environment Variables_ menu.
  2. Set two variables; _M2_HOME_ and _MAVEN_HOME_ - both of which should point to the path of your Maven install folder.
  3. The _Path_ variable must be edited in the same way as JAVA_HOME (above).

* **JUnit**:
  1. Add the following dependency to the Maven project's _pom.xml_:
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>

* **GitHub**:
  1. Visit [GitHub.com](https://github.com/).
  2. Enter your email address into the box on the landing-page and hit the **Sign up for GitHub** button.
  3. On the next page, hit the **Continue** button.
  4. Create a password for your account and hit the **Continue** button
  5. Enter your desired username for your GitHub account and hit the **Continue** button.
  6. Decide if you want to receive product updates and hit the **Continue** button.
  7. Solve the _captcha_ and hit the **Create account** button.
  8. Once you've completed that, you will receive a confirmation code in your email inbox which you can use to activate your account.
  9. GitHub account created.

* **Git Bash**:
  1. Visit the [Git Bash dowload](https://git-scm.com/downloads/) page.
  2. Select your relevant OS.  
  ![image](https://user-images.githubusercontent.com/103578351/172117680-e1f53192-43ed-4501-af8c-79fa46f81d58.png)  
  3. The download should begin automatically.
  4. Run the installer once it has finished downloading and a window resembling this should open. Click **Next**.  
  ![image](https://user-images.githubusercontent.com/103578351/172117901-3c38b4ed-6aea-4cbd-9a07-8751637b6531.png)  
  5. Leave the install location as default and click **Next**.  
  ![image](https://user-images.githubusercontent.com/103578351/172118044-e55feaea-9d56-47a0-8399-c2c54e722b3f.png)  
  6. Select the components shown here and click **Next**.  
  ![image](https://user-images.githubusercontent.com/103578351/172118127-e2c39ce5-7ecf-473f-b894-47e7445352c4.png)  
  7. The start menu folder should be "Git", then click **Next**.  
  ![image](https://user-images.githubusercontent.com/103578351/172118245-fdff5238-8d1f-4e76-8e70-6e572250d71c.png)  
  8. Change the default editor to one you are familiar with, such as Notepad.
  9. Select _Override the defauly branch name for new repositories_ and make sure the name is "**main**", then click **Next**.  
  ![image](https://user-images.githubusercontent.com/103578351/172118541-81d60327-4a63-46e4-9bbc-e1dd66495927.png)  
  10. Adjust where Git can be run from, selecting _Use Git and optional Unix tolls from the Command Prompt_ allows you to use both **Git Bash** and command prompt for version control, or you can leave it as the default if you'd rather only use **Git Bash**. Then click **Next**.
  11. Select _Use bundled OpenSSH_ and click **Next**.
  12. Select _Use the OpenSSL library_ then click **Next**.  
  ![image](https://user-images.githubusercontent.com/103578351/172119126-e88f31cb-34a7-486a-b3f0-3cd3d7f3c65b.png)  
  13. Select _Checkout Windows-style, commit Unix-style line endings_, then click **Next**.
  14. Select _Use MinTTY (the default terminal of MSYS2)_ then click **Next**.
  15. Select _Default (fast-forward or merge)_ then click **Next**.  
  ![image](https://user-images.githubusercontent.com/103578351/172119496-e52f3a37-645b-407a-9d9c-05f7f646e743.png)  
  16. Select _Git Credential Manager Core_, then click **Next**.
  17. Tick _Enable file system caching_ and then click **Next**.
  18. Tick _Enable experimental built-in file system monitor_ and then click **Next**.
  19. Let Git install.  
  ![image](https://user-images.githubusercontent.com/103578351/172119764-e179f8ff-c5ae-4bda-bc5d-5178d16d36c2.png)  
  20. Launch Git Bash and click _Finish_.  
  ![image](https://user-images.githubusercontent.com/103578351/172119863-ca07ab44-2585-46cc-99b9-63e3973d486f.png)  
  21. If a window that looks like this opens, you've successfully installed Git Bash!  
  ![image](https://user-images.githubusercontent.com/103578351/172120005-4f373324-58b3-4ecc-a260-2706577e0053.png)  



## Building

In order to build a new working version of this programme, you must first enter the repository folder downloaded from GitHub (above) and moved into the target folder. From there, open git Bash into the folder and type `mvn clean package`. Once that is complete, type `java -jar hwamonstermaker-0.0.1-SNAPSHOT.jar`.


## Running the tests

Once you have the code open within your preffered IDE, you need to select the top level of the src/test/java and launch as JUnit Test to begin testing.
![image](https://user-images.githubusercontent.com/103578351/172025693-d46b387b-881d-4b6d-8625-75b86923e45b.png)



### Unit Tests 

The unit tests are designed to test the core files of the programme, as well as the most basic methods for each class. This includes the CRUD and Controller tests. The tests are run with set results expected and are only able to pass when the test return matches the expected results for each test.
In this case, we are testing the create, read, update and delete functions of the application, with several different variations on the read method to cover different search criteria, including:  
Read All  
![image](https://user-images.githubusercontent.com/103578351/172120494-9f27b612-07c2-4e1e-bde2-b144ea7d72be.png)  
Read By Family  
![image](https://user-images.githubusercontent.com/103578351/172120548-8e9d8757-171f-49b4-b737-e1f3d11fdc78.png)  
Read By Diet  
![image](https://user-images.githubusercontent.com/103578351/172120589-f7824bf6-7459-4f81-93ec-c9b9d7ce4df8.png)  
Read By Origin  
![image](https://user-images.githubusercontent.com/103578351/172120628-f1af0e99-01e2-48ec-9c8d-f2661d7a39ee.png)  
Read By Flight  
![image](https://user-images.githubusercontent.com/103578351/172120679-8bfdfabc-a037-4bbe-ba18-8760a8e474d1.png)  
Read By Swim  
![image](https://user-images.githubusercontent.com/103578351/172120729-1bcc777e-2757-4fc9-b5e0-1da831161598.png)  
Read By Family and Diet  
![image](https://user-images.githubusercontent.com/103578351/172120774-c8054c20-9380-4a3d-a880-b6a25ef250f2.png)  
Read By Family and Origin  
![image](https://user-images.githubusercontent.com/103578351/172120802-4de0f953-69d0-49a4-80fa-077a0235bcf8.png)  
Read By Diet and Origin  
![image](https://user-images.githubusercontent.com/103578351/172120847-fc7fe5f9-62f1-41d0-a4e5-5de916c96345.png)  


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
