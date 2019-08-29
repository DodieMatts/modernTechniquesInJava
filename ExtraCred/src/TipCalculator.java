import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;




public class TipCalculator extends Application {
    // Declaring private fields
    private Label rLabel;
    private TextField field;
    private Button calcTip;
    private Label amountToTip;
    private Label totalWithTip;

    @SuppressWarnings("unchecked")
    public void start(Stage primaryStage) {
        rLabel = new Label ("Restaurant Charge");
        field = new TextField();
        calcTip = new Button("Calculate Tip");
        amountToTip = new Label("Ammount to Tip");
        totalWithTip = new Label();

        calcTip.setOnAction(new ButtonHandler());

        VBox box = new VBox(10);
        box.getChildren().add(rLabel);
        box.getChildren().add(field);
        box.getChildren().add(calcTip);
        box.getChildren().add(amountToTip);
        box.getChildren().add(totalWithTip);
        box.setAlignment(Pos.CENTER);
        box.setPadding(new Insets(10,10,10,10));
        Scene scene = new Scene(box, 250, 250);

        primaryStage.setTitle("TipCalculator");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

//Button handler for calculating the tip
    private class ButtonHandler implements EventHandler {

        @Override
        public void handle(javafx.event.Event event) {
            final double tipPercent = 20;
            String userInput;
            double tip;
            double totalAmount;

            userInput = field.getText().trim();
            tip = (double) Math.round(Double.parseDouble(userInput)*tipPercent)/100.0;
            totalAmount = tip + Double.parseDouble(userInput);
            totalWithTip.setText("$"+totalAmount);

        }
    }

    public static void main(String args[]){
        launch(args);

    }
}