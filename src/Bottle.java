import java.util.Arrays;
import java.util.Random;

public class Bottle {

    private double howManyLiters;
    private static Random random = new Random();
    private static double randomN;

    Bottle(double howManyLiters) {
        this.howManyLiters = howManyLiters;
    }

    private static double getRandomN() {
        return randomN = random.nextDouble();
    }

    double getHowManyLiters() {
        return howManyLiters;
    }


    boolean pourOut(double volumeOut) {
        if (howManyLiters < volumeOut)
            this.howManyLiters += volumeOut;
        else
            return false;
        return true;
    }

    private void pourIn(double volumeIn) {
        this.howManyLiters -= volumeIn;
    }

    private void pour(double howManyLiters, Bottle WhereToPour) {
        if (this.pourOut(howManyLiters)) {
            this.pourIn(howManyLiters);
        } else
            System.out.println("To little");
    }


    public static void main(String[] args) {

        Bottle[] bottles = new Bottle[5];

        for (int i = 0; i < bottles.length; i++) {
            bottles[i] = new Bottle(getRandomN());

        }
        System.out.println(Arrays.deepToString(bottles));

        bottles[0].pour(4, bottles[2]);
    }

    public String toString() {
        return getHowManyLiters() + " ";
    }
}
