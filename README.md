PA 303.10.3 - Practice Assignment - Polymorphism and Interface
Lab Objective
After completing the hands-on practice assignment, you will be able to:
Implement interfaces in your program.
Apply polymorphism concept using the interface
Requirements
Scenario: A library needs to develop an online application for two types of users/roles: adults and children. Both of these users should be able to register an account. Any user under 12 years of age will be registered as a child, and they can borrow a “Kids” category book for 10 days, whereas an adult can borrow “Fiction” category books, which need to be returned within 7 days. 
Note: In the future, more users/roles might be added to the library where similar rules will be enforced. 
Develop interfaces and classes for the categories mentioned above.  
Problem Statement 1:
Create an interface LibraryUser with the following methods declared,

Method Name
registerAccount
requestBook


Create 2 classes “KidUser” and “AdultUser” which implement the LibraryUser interface.
 
 Both the classes should have two instance variables as specified below.

Instance variables 
Data type
age
int
bookType
String



The methods in the KidUser class should perform the following logic. 
registerAccount: If age <= 11, a message displaying “You have successfully registered under a Kids Account” should be displayed in the console. 
If (age > 11), a message displaying, “Sorry, age must be less than 12 to register as a kid.” should be displayed in the console. 
requestBook: If bookType is “Kids,” a message displaying “Book issued successfully, please return the book within 10 days” should be displayed in the console. 
Else, a message displaying, “Oops, you are allowed to take only kids books.” should be displayed in the console. 
The methods in the AdultUser class should perform the following logic. 

registerAccount : If age >= 12, a message displaying “You have successfully registered under an Adult Account.” should be displayed in the console. 
If age <= 11, a message displaying, “Sorry, age must be greater than 12 to register as an adult.” should be displayed in the console. 
requestBook : If bookType is “Fiction,” a message displaying “Book Issued successfully, please return the book within 7 days.” should be displayed in the console. 
Else, a message displaying, “Oops, you are allowed to take only adult Fiction books.” should be displayed in the console. 

Create a class “LibraryInterfaceDemo.java” with a main() method that performs the below functions,
Test case #1:
Create an instance of the KidUser class. 
Set the age as specified in the below table and invoke the registerAccount() method of the KidUser object.

Age
10
18


Set the bookType as specified in the below table and invoke the requestBook() method of the KidUser object.
BookType
“Kids”
“Fiction”


Test case #2:
Create an instance of the AdultUser class. 
Set the age as specified in the below table and invoke the registerAccount() method of the AdultUser object.

Age
5
23


Set the bookType as specified in the below table and invoke the requestBook() method of the AdultUser object.
BookType
“Kids”
“Fiction”









