public class Car {
    private static Car instance;

    private Car(){

        System.out.println("Car object is created");
    }

    public static Car create(){

        if  (instance == null){
        return instance = new Car();

        }
      return instance;

    }


}
