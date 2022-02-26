package com.OOAD;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

//observer class handles all events and documents them in the logger

public class ClerkObserver implements PropertyChangeListener {
    String event;
    Logger logger;
    int additionalItems;

    public void setLogger(Logger logger){
        this.logger = logger;
    }
    public void propertyChange(PropertyChangeEvent evt) {
        event=evt.getPropertyName();
        //System.out.println(event);
        switch(event){
            case "arriveAtStore_evt_1" -> {
                logger.write(evt.getNewValue()+" has arrived at the store.");
            }
            case "arriveAtStore_evt_2" -> {
                logger.write(evt.getNewValue()+" items have been added to inventory.");
            }
            case "checkRegister_evt_1" -> {
                logger.write("The cash register has " + evt.getNewValue());
            }
            case "goToBank_evt_1" -> {
                logger.write("The cash register has " + evt.getNewValue() + " after going to the bank.");
            }
            case "doInventory_evt_1" -> {
                logger.write("There are " + evt.getNewValue() + " items in inventory.");
            }
            case "doInventory_evt_2" -> {
                logger.write("The total value of the inventory is " + evt.getNewValue());
            }
            case "doInventory_evt_3" -> {
                logger.write(evt.getNewValue() + " items were damaged while tuning.");
            }
            case "placeAnOrder_evt_1" -> {
                logger.write(evt.getNewValue() + " items were ordered.");
            }
            case "openTheStore_evt_1" -> {
                logger.write(((int)evt.getNewValue() + additionalItems) + " items were sold.");
                this.additionalItems = 0;
            }
            case "openTheStore_evt_1_addition" -> {
                this.additionalItems += (int)evt.getNewValue();
            }
            case "openTheStore_evt_2" -> {
                logger.write(evt.getNewValue() + " items were purchased.");
            }
            case "cleanTheStore_evt_1" -> {
                logger.write(evt.getNewValue() + " items were damaged while cleaning.");
            }
            case "leaveTheStore_evt_1" -> {
                logger.write(evt.getNewValue()+" has left the store.");
            }

        }

    }
}
