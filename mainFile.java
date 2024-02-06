import java.util.*;

class Main {
    static int a;
    static int NumberOfAttempts = 0;
    static int leftAttempts = 10;

    public static void Guess_num() {
        Scanner sc = new Scanner(System.in);

        if (NumberOfAttempts < 10) {
            int l = leftAttempts - NumberOfAttempts;
            System.out.println("*** You have " + l + " attempts****");
            System.out.print("Enter the Number: ");
            int enterNumber = sc.nextInt();
            NumberOfAttempts = NumberOfAttempts + 1;

            if (enterNumber == a) {
                System.out.println("********CONGRATULATIONS********");
                System.out.println("You made at " + NumberOfAttempts + " attempts");
            } else {
                if (NumberOfAttempts == 4) {
                    if (a % 2 == 0) {
                        System.out.println("HINT:-The number is an even number");
                    } else {
                        System.out.println("HINT:-The number is an odd number ");
                    }
                }
                if (NumberOfAttempts == 2) {
                    if (0 <= a && a <= 50) {
                        System.out.println("The number is between 0 to 50 ");
                    } else {
                        System.out.println("The Number is between 51 to 100 ");
                    }
                }
                if (NumberOfAttempts == 6) {
                    int upper = a + 15;
                    int lower = a - 15;
                    System.out.println("HINT:-The number ranges from " + lower + " to " + upper);
                }
                if (enterNumber < a) {
                    System.out.println("***LOW***");
                } else if (enterNumber > a) {
                    System.out.println("***HIGH***");
                }
                Guess_num();
            }
        } else if (NumberOfAttempts >= 10) {
            System.out.println( "The Number is "+ a);
            System.out.println("YOU HAVE REACHED MAXIMUM ATTEMPTS \n TRY AGAIN ");
            System.out.println("THE NUMBER IS " + a);
            sc.close(); // Close the Scanner to avoid resource leak
            System.exit(0);
        }
        sc.close(); 
    }

    public static void main(String[] args) {
        Random r = new Random();
        a = r.nextInt(100);
        System.out.println("****ENTER THE NUMBER BETWEEN 1 TO 100****");
        Guess_num();
    }
}
