import model.Country;

public class HashMapDemo {

    public static void printHashCode(){
        String a = "Géza";  // hashCode() --> 2342953
        String b = "Géza";  // hashCode() --> 2342953
        String c = "Geza";  // hashCode() --> 2216101
        System.out.println("a hashCode --> " + a.hashCode());
        System.out.println("b hashCode --> " + b.hashCode());
        System.out.println("c hashCode --> " + c.hashCode());
    }

    public static void checkHashCode(){
        Country india = new Country(1, "India", 15000);
        Country japan = new Country(2, "Japan", 12000);
        Country fakeIndia = new Country(1, "India", 15001);
        System.out.println("india.equals(japan) " + india.equals(japan));
        System.out.println("india.equals(fakeIndia) " + india.equals(fakeIndia));
    }

    public static void main(String[] args) {
//        printHashCode();
        checkHashCode();
    }
}
