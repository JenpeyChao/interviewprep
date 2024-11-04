public class car {

    private String color;
    private String make;
    private String model;
    private int year;

    public car(String color, String make, String model, int year) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.year = year;
    }


    public void start() {
        System.out.println(make + " " + model + " is starting.");
    }

    public String getColor() {
        return color;
    }
}