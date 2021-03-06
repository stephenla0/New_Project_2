package com.OOAD;
import java.util.ArrayList;

// top level object to run the simulation
public class Simulation implements ConsoleLogger {
    Store north_store;
    Store south_store;
    int dayCounter;
    Weekday weekDay;

    // enum for Weekdays
    // next implementation from
    // https://stackoverflow.com/questions/17006239/whats-the-best-way-to-implement-next-and-previous-on-an-enum-type
    public static enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        private static Weekday[] vals = values();
        public Weekday next() {
            return vals[(this.ordinal()+1) % vals.length];
        }
    }

    Simulation() {
        weekDay = Weekday.MONDAY;   //set the starting day
        dayCounter = 0;
        north_store = new Store();
        south_store = new Store();
    }

    void startSim(int days) {
        for (int day = 1; day <= days; day++) {
            out(" ");
            out("*** Simulation day "+day+" ***");
            startDay(day);
        }
    }

    void startDay(int day) {
        if (weekDay == Weekday.SUNDAY) {
            north_store.closedToday(day);
            south_store.closedToday(day);
        }
        else {
            north_store.openToday(day);
            south_store.openToday(day);
        }
        weekDay = weekDay.next();
    }

    void summary() {
        out("");
        out("Summary:");
        out("");
        out("Items remaining in inventory:");
        ArrayList<Item> items_north = north_store.inventory.getRemainingItems();
        ArrayList<Item> items_south = south_store.inventory.getRemainingItems();
        String s = "";
        for (Item item:items_north) s = s + item.itemType.toString().toLowerCase() + " ";
        out(s);
        out("");
        out("Total value of remaining items:");
        out("" + Utility.asDollar(north_store.inventory.getRemainingItemsValue()));
        out("");
        out("Items sold:");
        ArrayList<Item> itemsSold = north_store.inventory.getRemainingItems();
        String s2 = "";
        for (Item item2:itemsSold) s2 = s2 + item2.itemType.toString().toLowerCase() + " ";
        out(s2);
        out("");
        out("Total value of sold items:");
        out("" + Utility.asDollar(north_store.inventory.getSoldItemsValue()));
        out("");
        out("Money left in cash register:");
        out("" + Utility.asDollar(north_store.getRemainingCashInRegister()));
        out("");
        out("Money added to register from bank:");
        out("" + Utility.asDollar(north_store.getTotalMoneyFromBank()));
    }
}
