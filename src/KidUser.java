public class KidUser implements LibraryUser{

    static int age;
    static String bookType;


    public KidUser(){
        age=0;
        bookType="";
    }


    public static void setAge(int age) {
        KidUser.age = age;
    }

    public static void setBookType(String bookType) {
        KidUser.bookType = bookType;
    }

    @Override
    public void registerAccount(){
        if(this.age<=11){
            System.out.println("You have successfully registered under a Kids Account");
        }
        else if(this.age>11){
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }

    }

    @Override
    public void requestBook(){
        if(this.bookType=="Kids"){
            System.out.println("Book Issued successfully, please return the book within 10 days.");
        }
        else if(this.bookType!="Kids"){
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}
