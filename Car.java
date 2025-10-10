public class Car {
    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 5937;

    boolean isTheCaron = false;
    char condition = 'A';
    String nameofCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 23.4;

    int numberOfPeople = 1;


    public void printVariables(){
        System.out.println("This is the max Speed: " + maxSpeed);
        //System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCaron);
        //System.out.println(condition);
        //System.out.println(nameofCar);
        System.out.println(maxFuel);
        System.out.println(currentFuel);
        System.out.println(mpg);
        System.out.println(numberOfPeople);
    }

    public void getIn(){
        numberOfPeople++;
    }

    public void getOut(){
        numberOfPeople--;
    }

    public double howManyMilesOutOfGas(){
        return currentFuel * mpg;
    }


    // Custom Constructor
    public Car(int customMaxSpeed, int customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCaron = customIsTheCarOn;
    }

    public static void main(String[] args){
        System.out.println("Jerry's Car");
        System.out.println("Version 1");
        Car Jerry = new Car(500, 5000, true);
        Jerry.getIn();
        Jerry.printVariables();

        System.out.println(" ");

        System.out.println("Version 2");
        Jerry.getIn();
        Jerry.getIn();
        Jerry.getIn();
        Jerry.printVariables();

        System.out.println(" ");

        System.out.println("Version 3");
        Jerry.getOut();
        Jerry.printVariables();

        /*System.out.println(" ");

        System.out.println("Mou's Car");
        Car Mou = new Car(400, 350, true);
        Mou.printVariables();*/
    }
}
