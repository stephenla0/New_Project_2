package com.OOAD;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class ClerkObserver implements PropertyChangeListener {
    String event;
    Logger logger;

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
                logger.write(evt.getNewValue()+" items have been added to inventory.");
            }
            case "goToBank_evt_1" -> {
                //System.out.println("4");
            }
            case "doInventory_evt_1" -> {
                //System.out.println("5");
            }
            case "doInventory_evt_2" -> {
                //System.out.println("6");
            }
            case "doInventory_evt_3" -> {
                //System.out.println("7");
            }
            case "placeAnOrder_evt_1" -> {
                //System.out.println("8");
            }
            case "openTheStore_evt_1" -> {
                //System.out.println("9");
            }
            case "openTheStore_evt_2" -> {
                //System.out.println("10");
            }
            case "cleanTheStore_evt_1" -> {
                //System.out.println("11");
            }
            case "leaveTheStore_evt_1" -> {
                //System.out.println("12");
            }

        }

    }
}
