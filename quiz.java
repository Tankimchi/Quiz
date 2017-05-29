import java.util.Scanner;

class quiz {
    public static void main (String[] args){
        Scanner keyboard = new Scanner (System.in);
        
        int score = 0;
        
        System.out.print("Are you ready for a quiz? ");
                String answer = keyboard.nextLine();
        
        System.out.print("\nOkay, here we go! ");
        System.out.println();
        System.out.print("\nDirections: Type the number and press enter after choosing your answer. ");
        System.out.println();
        
        System.out.print("\nQ1.) What is the capital of Texas? ");
        System.out.println();
            System.out.print("\n1. Dallas      2. Austin ");
            System.out.print("\n3. San Antonio 4. Houston ");
            System.out.print("\n> ");
                int capital = keyboard.nextInt();
                    if(capital == 2) {
                        System.out.println("That's correct! ");
                        score++;
                        } else { 
                            System.out.println("That's incorrect.");
                        }
        System.out.print("\nQ2.) You can store the value cat in a variable of type int. ");
        System.out.println();
            System.out.print("\n1. True ");
            System.out.print("\n2. False ");
            System.out.print("\n> ");
                int either = keyboard.nextInt();
                    if(either == 2) {
                        System.out.println("That's correct! ");
                        score++;
                        } else { 
                            System.out.println("That's incorrect.");
                        }
        System.out.print("\n3.)What is 9 + 6 / 3?");
        System.out.println();
            System.out.print("\n1. 5     2. 11 ");
            System.out.print("\n3. 14    4. 23.5 ");
                int maths = keyboard.nextInt();
                System.out.print("\n> ");
                    if(maths == 2) {
                        System.out.println("That's correct! ");
                        score++;
                        } else { 
                            System.out.println("That's incorrect.");
                        }

                    System.out.println();
                    if (score < 1 ) {
                        System.out.println(" \nI'm sorry, you did not get any questions right. Please refresh this page to take the quiz again. ");
                        } else if (score == 1) {
                        System.out.println(" \nI'm sorry, you only got 1 out of 3 questions correct. Please refresh this page tot take the exam again.");
                    	} else if (score == 2) {
                        System.out.println(" \nYou got 2 out of 3 question correct which is good but not great. Please refresh the page if you'd like to re-take the exam.");
                    	} else if (score ==3) {
                        System.out.println(" \nAwesome! You got all 3 out of 3 questions correct! Way to go! ");
                    	}
                    
                    System.out.println();
                    System.out.println("Thanks for playing! ");
                
    }
}