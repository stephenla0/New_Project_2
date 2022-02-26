package com.OOAD;
import java.util.ArrayList;

//tracker class to track store information

public class Tracker {
    public ArrayList <TrackerDataStructure> clerkStorage;

    Tracker(){
        clerkStorage = new ArrayList<TrackerDataStructure>();
        clerkStorage.add(new TrackerDataStructure("Velma"));
        clerkStorage.add(new TrackerDataStructure("Shaggy"));
        clerkStorage.add(new TrackerDataStructure("Daphne"));
    }

    public void updateItemsSold(Clerk clerk, int change){
        TrackerDataStructure data = getTrackerDataStructure(getClerkTrackerIndex(clerk));
        data.itemsSold = data.itemsSold + change;
    }

    public void updateItemsPurchased(Clerk clerk, int change){
        TrackerDataStructure data = getTrackerDataStructure(getClerkTrackerIndex(clerk));
        data.itemsPurchased = data.itemsPurchased + change;
    }

    public void updateItemsDamaged(Clerk clerk, int change){
        TrackerDataStructure data = getTrackerDataStructure(getClerkTrackerIndex(clerk));
        data.itemsDamaged = data.itemsDamaged + change;
    }

    public TrackerDataStructure getTrackerDataStructure(int index){
        return clerkStorage.get(index);
    }

    public int getClerkTrackerIndex(Clerk clerk){
        for (int i = 0; i < clerkStorage.size(); i++){
            if(clerkStorage.get(i).ClerkName == clerk.name){
                return i;
            }

        }
        return -1;
    }

}
