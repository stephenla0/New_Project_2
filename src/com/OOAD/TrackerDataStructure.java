package com.OOAD;

//data structure for tracking clerks

public class TrackerDataStructure {
    String ClerkName;
    int itemsSold;
    int itemsPurchased;
    int itemsDamaged;

    TrackerDataStructure(String name){
        ClerkName = name;
        itemsSold = 0;
        itemsPurchased = 0;
        itemsDamaged = 0;
    }

}
