# Java Simple Calculator

In this example, the calculator GUI is built using JavaFX. It provides text fields to input two numbers and buttons to perform addition, subtraction, multiplication, and division. The result is displayed in a label.

To run this code, you'll need to set up a JavaFX project in your development environment and add the necessary JavaFX dependencies. You can then run the program using the main method.

Output:

<img width="587" alt="image" src="https://github.com/m-nikolova89/Java_Calculator/assets/127231957/77155e29-aa0f-41b5-b14f-d5be4e585b05">




If you encounter the "JavaFX runtime components are missing" error, it means that your Java runtime environment does not include JavaFX by default. Starting from Java 11, JavaFX is no longer bundled with the standard JDK distributions.

To resolve this issue, you can follow these steps:

Make sure you have Java 11 or a higher version installed on your system. You can check your Java version by running java -version in your command prompt or terminal.

Download the JavaFX SDK from the official OpenJFX website: https://openjfx.io. Make sure to choose the correct version that matches your Java version and operating system.

Extract the downloaded JavaFX SDK to a directory on your computer.

In your IntelliJ IDEA project, go to the project structure settings by pressing Ctrl+Shift+Alt+S (or by navigating to File -> Project Structure).

In the Project Structure dialog, select "Libraries" from the left sidebar.

Click the + button to add a new library.

Select "Java" from the dropdown and navigate to the lib directory inside the extracted JavaFX SDK folder.

Select all the JAR files inside the lib directory and click "OK" to add them as library dependencies.

Click "Apply" and then "OK" to save the changes.

Now, you need to configure the runtime for your JavaFX application. Go to the Run/Debug configurations in IntelliJ IDEA.

Create a new "Application" configuration by clicking the + button and selecting "Application".

In the "Main class" field, enter the class that contains the main method of your JavaFX application.

Under the "VM options" field, add the following line, replacing /path/to/javafx-sdk/lib with the actual path to the lib directory of your JavaFX SDK:


Copy code
--module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml
Click "Apply" and then "OK" to save the configuration.

Now, you should be able to run your JavaFX application without encountering the missing JavaFX runtime components error.

Make sure to adjust the paths and configurations according to your specific setup. With these steps, you should be able to resolve the JavaFX runtime components error and run your calculator successfully.
