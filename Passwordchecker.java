import java.util.Scanner;     //importing the scanner method for the user to be able to input

public class Passwordchecker {
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in); //enabling the scanner class to work

        System.out.println("This is a password strength checker");


        System.out.println("Enter your password:");

        String passwd = scanner.nextLine(); //prompting the scanner to read input
        
        if (passwd.contains(" ")){
            System.out.println("Invalid password, because it contains space."); // if the password contains whitespace, it returns as an invalid password
            return;
        }

        boolean hasAtLeast10chars = passwd.length() >= 10; // Declaring boolean values for each part of the password that'll be inputed as false(i.e it doesnt contain that character)
        boolean hasUpperCasechar = false;
        boolean hasLowerCasechar = false;
        boolean hasDigit = false;
        boolean hasSpecialchar = false;

        for (int i = 0; i < passwd.length(); i++){
            char ch = passwd.charAt(i);      // Using the 'for' loop to check if the password inputed contains all the requirements of a strong password and changing their boolean values to true.

            if (Character.isUpperCase(ch)){
                hasUpperCasechar = true;
            }else if (Character.isLowerCase(ch)){
                hasLowerCasechar = true;
            }else if (Character.isDigit(ch)){
                hasDigit = true;
            } else{
                hasSpecialchar = true;
            }
        }

        boolean isStrongPasswd = hasAtLeast10chars && hasUpperCasechar && hasLowerCasechar && hasDigit && hasSpecialchar; // Declaring another boolean value that if the password contains the requirements, then it is a strong password.   

        if(isStrongPasswd){
            System.out.println(passwd + "(Your password is a strong one.)");
        }else {
            System.out.println(passwd + "(Your password is a weak one. A strong paassword should contaain the following: uppercase, lowercase, digit, special character, and must be at least 10 chrcters)");
        }

// End of program, but it is still open for improvement from anyone interested.

    }
}
