import java.text.DecimalFormat;
import java.util.Random;

public class Ihm {
    public static void main(String[] args) {
        Temperature [] temperatures = new Temperature[7];
        DecimalFormat df = new DecimalFormat("0.00");

        fillTemperatures(temperatures);
        displayAllTemperatures(temperatures);
        displayMorningTemperatures(temperatures);
        displayEveningTemperatures(temperatures);
        System.out.println("\nLa températures max est => " + df.format(findMaxTemperatures(temperatures)) + " °celcius");
        System.out.println("La températures max matin est => " + df.format(findMaxMorningTemperatures(temperatures)) + " °celcius");
        System.out.println("La températures max aprés-midi est => " + df.format(findMaxEveningTemperatures(temperatures)) + " °celcius");
        System.out.println("\nLa températures min est => " + df.format(findMinTemperatures(temperatures)) + " °celcius");
        System.out.println("La températures min matin est => " + df.format(findMinMorningTemperatures(temperatures)) + " °celcius");
        System.out.println("La températures min aprés-midi est => " + df.format(findMinEveningTemperatures(temperatures)) + " °celcius");
    }
    public static void fillTemperatures(Temperature [] tps) {
        Random rd = new Random();
        String [] jours = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
        for (int i = 0; i < tps.length; i++) {
            tps[i] = new Temperature();
            tps [i].morning = rd.nextDouble(-10,20);
            tps [i].evening = rd.nextDouble(10,  20);
            tps [i].day = jours [i];
        }
    }
    public static void displayAllTemperatures(Temperature [] tps) {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Toutes les Températures");
        System.out.print("\t\t   ");
        for (int i = 0; i < tps.length; i++) {
            System.out.print(tps[i].day + "\t");
            if(tps[i].day.length() <= 6) {
                System.out.print("    ");
            }
        }
        System.out.print("\nMatin\t\t");
        for (int i = 0; i < tps.length; i++) {
            if (df.format(tps[i].morning).length() == 4 ) {
                System.out.print(" ");
            }
            System.out.print(df.format(tps[i].morning) + "\t\t" );

        }
        System.out.print("\nSoir\t\t");

        for (int i = 0; i < tps.length; i++) {

            if (df.format(tps[i].evening).length() == 4 ) {
                System.out.print(" ");
            }
            System.out.print(df.format(tps[i].evening) + "\t\t");
        }
        System.out.println();
    }

    public static void displayMorningTemperatures(Temperature [] tps) {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("\nTempératures du matin");
        System.out.print(" ");
        for (int i = 0; i < tps.length; i++) {
            System.out.print(tps[i].day + "\t");
            if(tps[i].day.length() <= 6) {
                System.out.print("    ");
            }
        }
        System.out.println();
        for (int i = 0; i < tps.length; i++) {
            if (df.format(tps[i].morning).length() == 4 ) {
                System.out.print(" ");
            }
            System.out.print(df.format(tps[i].morning) + "\t\t" );
        }
        System.out.println();
    }
    public static void displayEveningTemperatures(Temperature [] tps) {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("\nTempératures du soir");
        System.out.print(" ");
        for (int i = 0; i < tps.length; i++) {
            System.out.print(tps[i].day + "\t");
            if(tps[i].day.length() <= 6) {
                System.out.print("    ");
            }
        }
        System.out.println();
        for (int i = 0; i < tps.length; i++) {

            if (df.format(tps[i].evening).length() == 4 ) {
                System.out.print(" ");
            }
            System.out.print(df.format(tps[i].evening) + "\t\t");
        }
        System.out.println();
    }

    public static double findMaxTemperatures(Temperature [] tps) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < tps.length ; i++) {
            if(max < tps[i].morning) {
                max = tps[i].morning;
            } else if (max < tps[i].evening) {
                max = tps[i].evening;
            }
        }
        return max;
    }
    public static double findMaxMorningTemperatures(Temperature [] tps) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < tps.length ; i ++) {
            if(max < tps[i].morning) {
                max = tps[i].morning;
            }
        }
        return max;
    }
    public static double findMaxEveningTemperatures(Temperature [] tps) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < tps.length ; i++) {
            if (max < tps[i].evening) {
                max = tps[i].evening;
            }
        }
        return max;
    }
    public static double findMinTemperatures(Temperature [] tps) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < tps.length ; i++) {
            if(min > tps[i].morning) {
                min = tps[i].morning;
            } else if(min > tps[i].evening) {
                min = tps[i].evening;
            }
        }
        return min;
    }
    public static double findMinMorningTemperatures(Temperature [] tps) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < tps.length ; i++) {
            if (min > tps[i].morning) {
                min = tps[i].morning;
            }
        }
        return min;
    }
    public static double findMinEveningTemperatures(Temperature [] tps) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < tps.length ; i++) {
            if (min > tps[i].evening) {
                min = tps[i].evening;
            }
        }
        return min;
    }
}
