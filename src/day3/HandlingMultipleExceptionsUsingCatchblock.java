package day3;

public class HandlingMultipleExceptionsUsingCatchblock {

	 

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        try {

            HandlingMultipleExceptionsUsingCatchblock obj = new HandlingMultipleExceptionsUsingCatchblock();

        }catch(NullPointerException | ArithmeticException | IndexOutOfBoundsException e) {

            System.out.println(e.getMessage());

        }

 

    }

 

}

 