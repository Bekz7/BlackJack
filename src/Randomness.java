import java.util.Random;

public class Randomness {


    public static void main(String[] args) {
        Random random = new Random(23);

        int randomNumber = random.nextInt(10);
        int randomFive = random.nextInt(5);

        System.out.println("My random number is: " + randomNumber);

        System.out.println("Here are some numbers from 1 to 5!");
        System.out.print( 3 + random.nextInt(5) + " " );
        System.out.print( 3 + random.nextInt(5) + " " );
        System.out.print( 3 + random.nextInt(5) + " " );
        System.out.print( 3 + random.nextInt(5) + " " );
        System.out.print( random.nextInt(5) + " " );
        System.out.print( 10 + random.nextInt(5) + " " );
        System.out.println();

        System.out.println("Here are some numbers form 1 to 100!");
        System.out.print( 1 + random.nextInt(100) + "\t" );
        System.out.print( 1 + random.nextInt(100) + "\t" );
        System.out.print( 1 + random.nextInt(100) + "\t" );
        System.out.print( 1 + random.nextInt(100) + "\t" );
        System.out.print( 1 + random.nextInt(100) + "\t" );
        System.out.print( 1 + random.nextInt(100) + "\t" );
        System.out.println();

        int numb1 = 1 + random.nextInt(10);
        int numb2 = 1 + random.nextInt(10);

        if (numb1 == numb2) {
            System.out.println("The random numbers were the same! Weird");
        }

        if (numb1 != numb2) {
            System.out.println("The random numbers are different! Not to surprising, actually.");
        }

    }

}

