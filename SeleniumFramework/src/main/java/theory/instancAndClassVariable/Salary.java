package theory.instancAndClassVariable;

public class Salary {

    static final int HOURLY_WAGE = 30;

    // Instance variable -  Példány változó
    int workedHours = 32;
    // Class variable - Osztály változó
    static int hoursToWork = 40;

    public static void main(String args[]) {

        Salary salary1 = new Salary();

        System.out.println("Value of static variable: "+ Salary.hoursToWork * HOURLY_WAGE);
        System.out.println("Monthly salary: " + Salary.hoursToWork * HOURLY_WAGE);

        System.out.println("Value of instance variable: " + salary1.workedHours * HOURLY_WAGE);
        System.out.println("Actual salary: " + salary1.workedHours * HOURLY_WAGE);
    }
}
