# TheScore-QA-Challenge
This repository contains my submission for TheScore QA Engineering Challenge. The project was developed in IntelliJ, programmed in Java uses Maven for the build. It uses Appium to interact with theScore app on a local Android emulator or Android device. 

The project consists of the foundations for a test automation suite for testing theScore app including a simple example test case testing the functionality of going to a team's page within the app.

Test specification documentation can be found at the following link:

https://github.com/kierangara/TheScore-QA-Challenge/blob/main/docs/TestSpec/TheScore_QA_Challenge_Test_Specification.pdf
# Prerequisites
- Java 11 or higher
- Maven
- Appium with UiAutomator2 driver
- Nodejs
- Android SDK
- A local emulator
# Installing Prerequisites
- Java 11 can be installed from the Oracle website https://www.oracle.com/java/technologies/downloads/#java11 .
You must set the JAVA_HOME environment variable to the location in which the SDK is saved and add the root of the SDK bin folder to the path environment variable per the in
- Maven can be downloaded from the Apache Maven website https://maven.apache.org/download.cgi . See website instructions for installation.
- Appium can be installed by entering the following command in the terminal:
```console
npm install -g appium
```
- The UiAutomator2 driver for Appium can be installed using the following command in the terminal:
```console
appium driver install uiautomator2
```
- Nodejs can be installed using the node version manager for windows, available at https://github.com/coreybutler/nvm-windows/releases
- The Android SDK can be installed from the Android website or by installing Android Studio through which you can also set up an Android Virtual Device (avd) for use as the local emulator. Ensure the ANDROID_HOME environment variable is set to the location of the SDK.

For more information on setting up these prerequisites see the following link: https://anivaz.medium.com/how-to-set-up-appium-with-android-studio-for-mobile-app-testing-a300b7910364

Note: appium-desktop is deprecated and does not need to be installed for use of this project.

# Set-Up
Use the following link to clone the repository to your local machine:

https://github.com/kierangara/TheScore-QA-Challenge.git

**Important**:
theScore APK file can be found in the cloned repository at src/test/resources. Before running the tests install the APK on your emulator and go through the entire welcome/setup process within the app. The tests are designed for devices that are not installing the application for the first time and have already undergone this process.

Also place theScore app on the home screen of your device to ensure it is detected by the tests (this issue is being looked into: see [#5](https://github.com/kierangara/TheScore-QA-Challenge/issues/5)).
# Running the Tests
- In the terminal navigate to the root directory of the project and run the Appium command to start the server: 

```console
appium
```

- Start your emulator.

- In a separate terminal navigate back to the root directory of the project and run the following maven command to build and run the test:

```console
mvn test
```

# Repository Structure
- docs/TestSpec contains the test specification documentation
- src/test/resources contains the resources needed for the tests such as theSource App APK
- src/test/java/org/example/ contains the test classes used for the automated tests. The TestCases directory contains the test case for the challenge which uses the page based classes in NavigationTools to navigate throughout the app and perform the tests. The classes in TestSetup are used to setup the Appium driver before the test and terminate it afterwards.
- pom.xml is the maven build file used to build the tests, containing the necessary dependencies
