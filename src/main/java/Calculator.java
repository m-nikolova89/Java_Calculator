import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {

    private TextField num1Field;
    private TextField num2Field;
    private Label resultLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Calculator");

        GridPane gridPane = createLayout();
        addUIControls(gridPane);

        Scene scene = new Scene(gridPane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane createLayout() {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        return gridPane;
    }

    private void addUIControls(GridPane gridPane) {
        Label num1Label = new Label("Number 1:");
        gridPane.add(num1Label, 0, 0);

        num1Field = new TextField();
        gridPane.add(num1Field, 1, 0);

        Label num2Label = new Label("Number 2:");
        gridPane.add(num2Label, 0, 1);

        num2Field = new TextField();
        gridPane.add(num2Field, 1, 1);

        Button addButton = new Button("Add");
        addButton.setOnAction(e -> performOperation(Operation.ADDITION));
        gridPane.add(addButton, 0, 2);

        Button subtractButton = new Button("Subtract");
        subtractButton.setOnAction(e -> performOperation(Operation.SUBTRACTION));
        gridPane.add(subtractButton, 1, 2);

        Button multiplyButton = new Button("Multiply");
        multiplyButton.setOnAction(e -> performOperation(Operation.MULTIPLICATION));
        gridPane.add(multiplyButton, 0, 3);

        Button divideButton = new Button("Divide");
        divideButton.setOnAction(e -> performOperation(Operation.DIVISION));
        gridPane.add(divideButton, 1, 3);

        resultLabel = new Label();
        gridPane.add(resultLabel, 0, 4, 2, 1);
    }

    private void performOperation(Operation operation) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0.0;

            switch (operation) {
                case ADDITION:
                    result = num1 + num2;
                    break;
                case SUBTRACTION:
                    result = num1 - num2;
                    break;
                case MULTIPLICATION:
                    result = num1 * num2;
                    break;
                case DIVISION:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        resultLabel.setText("Error: Division by zero");
                        return;
                    }
                    break;
            }

            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException e) {
            resultLabel.setText("Error: Invalid input");
        }
    }

    private enum Operation {
        ADDITION,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION
    }
}
