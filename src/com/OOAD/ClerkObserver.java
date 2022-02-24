package com.OOAD;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class ClerkObserver implements PropertyChangeListener {
    String event;
    public void propertyChange(PropertyChangeEvent evt) {
        event=evt.getPropertyName();
        //System.out.println(event);
        switch(event){
            case "arriveAtStore_evt_1" -> {
                //System.out.println("1");
                break;
            }
            case "arriveAtStore_evt_2" -> {
                //System.out.println("2");
                break;
            }
            case "checkRegister_evt_1" -> {
                //System.out.println("3");
                break;
            }
            case "goToBank_evt_1" -> {
                //System.out.println("4");
                break;
            }
            case "doInventory_evt_1" -> {
                //System.out.println("5");
                break;
            }
            case "doInventory_evt_2" -> {
                //System.out.println("6");
                break;
            }
            case "doInventory_evt_3" -> {
                //System.out.println("7");
                break;
            }
            case "placeAnOrder_evt_1" -> {
                //System.out.println("8");
                break;
            }
            case "openTheStore_evt_1" -> {
                //System.out.println("9");
                break;
            }
            case "openTheStore_evt_2" -> {
                //System.out.println("10");
                break;
            }
            case "cleanTheStore_evt_1" -> {
                //System.out.println("11");
                break;
            }
            case "leaveTheStore_evt_1" -> {
                //System.out.println("12");
                break;
            }

        }

    }
}
