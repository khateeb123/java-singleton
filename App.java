public class App {

    public static void main(String[] args) {
        
        System.out.println("hello go");

        // Car mycar =  new Car();
        Car mycar3 =  Car.create();
        Car mycar4 =  Car.create();

        // String[] myarr = {"khateeb","maira","saira","sora"};
        // for (String string : myarr) {
        //     System.out.println("string");
        // }

           String[] myarr = {"khateeb", "maira", "saira", "sora"};
        for (String string : myarr) {
            System.out.println(string); // print the variable, not a literal string
        }

    }

}