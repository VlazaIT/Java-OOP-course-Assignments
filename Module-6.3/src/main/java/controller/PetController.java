package controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.PetModel;
import view.PetView;

public class PetController extends Application {
    private PetModel petModel;
    private PetView petView;

    @Override
    public void start(Stage primaryStage) {
        petModel = new PetModel(200, 200); // Starting position
        petView = new PetView(this, 400, 400); // Window size

        Scene scene = new Scene(new StackPane(petView.getCanvas()), 400, 400);
        primaryStage.setTitle("Virtual Pet");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void movePetTowards(double x, double y) {
        // Movement logic, update petModel position, then update view
        petModel.moveTo(x, y); // Simple direct move, add more logic as needed
        petView.drawPet(petModel.getX(), petModel.getY());
    }

    public void stopPet() {
        // Logic to stop pet movement
        petView.drawPet(petModel.getX(), petModel.getY());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
