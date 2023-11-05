// Module 2.1. Task 3.

package Module2.TaskSet1;

public class CoffeeMaker {
    private boolean isOn;
    private String coffeeType;
    private int coffeeAmount;
    public CoffeeMaker(String coffeeType, int coffeeAmount) {
        this.isOn = false;
        this.coffeeType = coffeeType;
        this.coffeeAmount = coffeeAmount;
    }
    public boolean isOn() {
        return isOn;
    }
    public void pressOnOff() {
        isOn = !isOn;
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String type) {
        if (isOn) {
            this.coffeeType = type;
        } else {
            System.out.println("Turn on the coffee maker");
        }
    }

    public void setCoffeeAmount(int amount) {
        if (isOn && amount >= 10 && amount <= 80) {
            this.coffeeAmount = amount;
        } else {
            System.out.println("You need to turn the coffee maker on to set the amount, and the amount should be between 10-80ml");
        }
    }

    public void brewCoffee() {
        if (isOn) {
            System.out.println("Brewing " + coffeeAmount + "ml of " + coffeeType + " coffee.");
        } else {
            System.out.println("The coffee maker is off. Please turn it on to brew coffee!");
        }
    }

    public static void main(String[] args) {

        for (int i=0; i < 12; i++) {
            int amount = 70 + i;
            if (amount > 80) {
                System.out.println("Cannot brew coffee with amount more than 80ml.");
                continue; // This skips the rest of this loop iteration.
            }

            CoffeeMaker newCup = new CoffeeMaker("normal", 70+i);
            newCup.pressOnOff();

            if (i % 3 == 1) {
                newCup.setCoffeeType("espresso");
            }

            newCup.brewCoffee();
        }
    }
}
