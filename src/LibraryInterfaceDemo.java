public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        KidUser kid=new KidUser();
        kid.setAge(10);
        kid.registerAccount();

        kid.setAge(18);
        kid.registerAccount();

        kid.setBookType("Kids");
        kid.requestBook();

        kid.setBookType("Fiction");
        kid.requestBook();


        System.out.println("Now second Adultuser");

        AdultUser aid=new AdultUser();
        aid.setAge(5);
        aid.registerAccount();

        aid.setAge(23);
        aid.registerAccount();

        aid.setBookType("Kids");
        aid.requestBook();

        aid.setBookType("Fiction");
        aid.requestBook();


    }
}