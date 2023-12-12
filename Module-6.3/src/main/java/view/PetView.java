package view;

import controller.PetController;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

public class PetView {
    private Canvas canvas;
    private PetController controller;
    private Image petImage;

    public PetView(PetController controller, int width, int height) {
        this.controller = controller;
        this.canvas = new Canvas(width, height);
        this.petImage = new Image("pictures/pet_image.jpg"); // Ensure the image path is correct

        setupEventHandlers();
    }

    private void setupEventHandlers() {
        canvas.setOnMouseMoved(this::handleMouseMoved);
        canvas.setOnMouseExited(this::handleMouseExited);
    }

    private void handleMouseMoved(MouseEvent event) {
        controller.movePetTowards(event.getX(), event.getY());
    }

    private void handleMouseExited(MouseEvent event) {
        controller.stopPet();
    }

    public void drawPet(double x, double y) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.drawImage(petImage, x, y);
    }

    public Canvas getCanvas() {
        return canvas;
    }
}
