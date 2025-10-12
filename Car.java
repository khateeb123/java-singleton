public class Car {
    private static Car instance;

    public Car(){

        System.out.println("Car object is created");
    }

    public static Car create(){
        return instance = new Car();
      

    }


}
