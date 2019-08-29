import java.util.Scanner;

public class SocSecProcessor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        char decision;

        do {
            System.out.print("Please enter a name: ");
            String fName = new String(input.next());
            String lName = new String(input.next());
            String name = fName+ " " +lName;

            System.out.print("Please enter a social security number: ");
            String ssn = new String(input.next());

            try {
                if (isValid(ssn)) {
                    System.out.println(name + " " + ssn + " is valid.");
                }
            } catch (Exception e) {
                System.out.println(name + " " + ssn + " " + e.getMessage());
            }

            System.out.println("Enter Y/N if you want to continue ");
            String choice = input.next();
            decision = choice.charAt(0);
        } while (Character.toUpperCase(decision) == 'Y');
    }

    public static boolean isValid(String ssn)throws SocSecException{
        boolean valid = true;

        if (ssn.length() != 11 ) {
            throw new SocSecException(" ssn needs to have 11 characters ");
        }

        else if (ssn.charAt(3) != '-') {
            throw new SocSecException(" ssn needs to have a '-' at character 3");
        }

        else if(ssn.charAt(6) != '-') {
            throw new SocSecException(" ssn needs to have a '-' at character 6");
        }

        for (int i = 0; i <3 ; i++){
            if(!Character.isDigit(ssn.charAt(i)))
                throw new SocSecException(" One of the characters in 1-3 is not a digit");
        }

        for (int i = 4; i <6 ; i++){
            if(!Character.isDigit(ssn.charAt(i)))
                throw new SocSecException(" One of the characters in 4-6 is not a digit");
        }

        for (int i = 7; i < 11 ; i++){
            if (!Character.isDigit(ssn.charAt(i)))
                throw new SocSecException(" One of the characters in 7-11 is not a digit");
        }



        return valid;
    }
}

