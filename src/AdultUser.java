public class AdultUser implements LibraryUser{

    static int age;
    static String bookType;



    public AdultUser(){
        age=0;
        bookType="";
    }


    public static void setAge(int age) {
        AdultUser.age = age;
    }

    public static void setBookType(String bookType) {
        AdultUser.bookType = bookType;
    }

    @Override
    public void registerAccount(){
        if(this.age>=12){
            System.out.println("You have successfully registered under an Adult Account.");
        }
        else if(age<=11){
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }

    }

    @Override
    public void requestBook(){
        if(this.bookType=="Fiction"){
            System.out.println("Book Issued successfully, please return the book within 7 days.");
        }
        else if(this.bookType!="Fiction"){
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }
}
