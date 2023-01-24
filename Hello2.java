public class Hello2 {
    public static void main(String[] args) {
        System.out.println("vanilla"+" icecream");
        System.out.print("vanilla");
        System.out.println(" icecream");
        System.out.println("chocolate" + " and" + " vanilla" + " icecream");
        System.out.println("Our Solar System has " + 8 + " planets.");
        System.out.println("The distance between campuses is " + String.format("%.5g", 5.5*1.609) + "km");
        System.out.printf("The distance between campuses is %.5fkm", 5.5*1.609);
    }
}
