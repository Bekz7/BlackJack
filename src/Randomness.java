import java.util.Random;

public class Randomness {
    static Random random = new Random();
    static int randomNumber;
    static int randomFive = random.nextInt(5);
    static int randomHundred;

    public static int getRandomNumber() {
        return randomNumber = random.nextInt(10);
    }

    public static int getRandomFive() {
        return randomFive = random.nextInt(5);
    }

    public static int getRandomHundred() {
        return randomHundred = random.nextInt(100);
    }

    public static void main(String[] args) {

        randomFive = ranFive(randomFive);

        System.out.println("My random number is: " + getRandomNumber());
        System.out.println();

        System.out.println("Here are some numbers from 1 to 5!");
        System.out.print(3 + randomFive + " ");
        System.out.print(3 + randomFive + " ");
        System.out.print(3 + getRandomFive() + " ");
        System.out.print(3 + getRandomFive() + " ");
        System.out.print(getRandomFive() + " ");
        System.out.print(10 + getRandomFive() + " ");
        System.out.println("\n");

        System.out.println("Here are some numbers form 1 to 100!");
        System.out.print(1 + getRandomHundred() + "\t");
        System.out.print(1 + getRandomHundred() + "\t");
        System.out.print(1 + getRandomHundred() + "\t");
        System.out.print(1 + getRandomHundred() + "\t");
        System.out.print(1 + getRandomHundred() + "\t");
        System.out.print(1 + getRandomHundred() + "\t");
        System.out.println("\n");

        int numb1 = getRandomNumber();
        int numb2 = getRandomNumber();

        if (numb1 == numb2) {
            System.out.println("The random numbers were the same! Weird");
        }

        if (numb1 != numb2) {
            System.out.println("The random numbers are different! Not to surprising, actually.");
        }
    }

    static int ranFive(int ranFive) {
        ranFive = randomFive + random.nextInt(5);
        return ranFive;
    }
}



