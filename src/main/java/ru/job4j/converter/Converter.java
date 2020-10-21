package ru.job4j.converter;

/**
 * Convert.
 *
 * @author Ilya Schastliviy
 */
public class Converter {
    /**
     * Method RubleToEuro.
     * @param value value in rubles.
     * @return value in Euro.
     */
    public static int rubleToEuro(int value) {
        return value / 80;
    }
    /**
     * Method RubleToDollar.
     * @param value value in rubles.
     * @return value in Dollar.
     */
    public static int rubleToDollar(int value) {
        return value / 70;
    }
    /**
     * Method RubleToFunt.
     * @param value value in rubles.
     * @return value in Funt.
     */
    public static int rubleToFunt(int value) {
        return value / 90;
    }
    /**
     * Method DollarToRuble.
     * @param value value in dollars.
     * @return value in Rubles.
     */
    public static int dollarToRuble(int value) {
        return value * 70;
    }
    /**
     * Method EuroToRuble.
     * @param value value in euros.
     * @return value in Rubles.
     */
    public static int euroToRuble(int value) {
        return value * 80;
    }
    /**
     * Method funtToRuble.
     * @param value value in funts.
     * @return value in Rubles.
     */
    public static int funtToRuble(int value) {
        return value * 70;
    }
    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        int in = 160;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("160 rubles are 2. Test result : " + passed);
        int euro = Converter.rubleToEuro(160);
        System.out.println("160 rubles are " + euro + " euro.");
        System.out.println("280 rubles are 4. Test result : " + passed);
        int dollar = Converter.rubleToDollar(280);
        System.out.println("280 rubles are " + dollar + " dollar.");
        System.out.println("900 rubles are 10. Test result : " + passed);
        int funt = Converter.rubleToFunt(900);
        System.out.println("900 rubles are " + funt + " funt.");
    }
}
