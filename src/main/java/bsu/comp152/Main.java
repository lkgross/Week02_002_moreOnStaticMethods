package bsu.comp152;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        dieRoll();
        /*
         * Call the static method multiSidedDieRoll
         * passing the argument (parameter value)
         * 6 or 12 or ... other number of sides.
         */
        multiSidedDieRoll(6);
        multiSidedDieRoll(12);
        System.out.println("You rolled a " + (returnRoll(6)
                + returnRoll(6)));
        System.out.println(returnWages(40, 12,
                15.5));
        System.out.println(returnWages(0, 5,
                20));
        System.out.println(returnWages(39.5, 0,
                20));
    }

    /**
     * Static method dieRoll -
     * Print the result of rolling a six-sided die.
     */
    public static void dieRoll() {
        Random rand = new Random();
        System.out.println("Your roll is " +
                (rand.nextInt(6) + 1));
    }

    /**
     * multiSidedDieRoll -
     * Print the result of rolling a die with sides
     * faces.
     * @param sides
     */
    public static void multiSidedDieRoll(int sides) {
        Random rand = new Random();
        System.out.println("Your roll is " +
                (rand.nextInt(sides) + 1));
    }

    /**
     * returnRoll -
     * Return the result of rolling a die with sides
     * faces.
     * @param sides
     * @return
     */
    public static int returnRoll(int sides) {
        Random rand = new Random();
        return rand.nextInt(sides) + 1;
    }

    /**
     * Return the amount you earn by working initial
     * hours at an hourly wage plus overtime hours at
     * time and a half.
     * @param initialHours
     * @param overTimeHours
     * @param hourlyWage
     * @return
     */
    public static double returnWages(double initialHours,
                                     double overTimeHours,
                                     double hourlyWage){
        return initialHours*hourlyWage +
                overTimeHours*hourlyWage*1.5;
    }

}