package com.OOAD;
//import java.lang.Object.org.apache.commons.math3.distribution.AbstractIntegerDistribution;
import java.text.NumberFormat;
import java.util.Random;

public interface Utility {

    // making this utility function that can be used by saying Utility.rndFromRange(min,max)
    // https://www.baeldung.com/java-generating-random-numbers-in-range
    static int rndFromRange(int min, int max) {
        //returns a uniform inclusive random number from a given min and max range
        return (int) ((Math.random() * ((max+1) - min)) + min);
    }
    
    /*static int getPoisson(int min, int max, double mean)
    {
        PoissonDistribution p = new PoissonDistribution(mean);
        return 2 + p.sample();
    }*/

    static double rnd() {
        return Math.random();
    }

    // another utility for printing out pretty $ values
    // https://stackoverflow.com/questions/13791409/java-format-double-value-as-dollar-amount
    static String asDollar(double value) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(value);
    }

    // a utility for getting a random enum value from any enum
    // https://stackoverflow.com/questions/1972392/pick-a-random-value-from-an-enum
    // call like randomEnum(MyEnum.class)
    static <T extends Enum<?>> T randomEnum(Class<T> clazz){
        int x = new Random().nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
}
