public class Car {
    public static final String MAKE = "Toyota";
    public static int numCars = 0;
    
    private String chassisNo;
    private String model;
    
    public Car(String model) {
        numCars++;
        this.chassisNo = "ch" + numCars;
        this.model = model;
        System.out.println("Car manufactured");
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getChassisNo() {
        return chassisNo;
    }
    
    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }
    
    public void printCarDetails() {
        System.out.println("The car is manufactured by: " + MAKE);
        System.out.println("The model type is " + model);
        System.out.println("The chassis number is " + chassisNo);
    }
}
