package com.OOAD;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Logger {
    BufferedWriter text;
    int day;
    Tracker tracker;

    Logger(int day, Tracker tracker) {
        // reference: https://www.w3schools.com/java/java_files_create.asp
        this.day = day;
        this.tracker = tracker;
        try {
            text = new BufferedWriter(new FileWriter("Logger-" + day + ".txt"));
        } catch (IOException e) {
            System.out.println("An error creating logger file " + day + " occurred.");
            e.printStackTrace();
        }
    }

    public void write(String string){
        try{
            text.write(string);
            text.newLine();
        }
        catch (IOException e) {
            System.out.println("An error writing logger text occurred.");
            e.printStackTrace();
        }
    }

    public void publishTracker(){
        try{
            text.newLine();
            text.write("Tracker: Day " + day);
            text.newLine();
            text.write("Clerk, Items Sold, Items Purchased, Items Damaged");
            text.newLine();
            for (TrackerDataStructure clerk: tracker.clerkStorage){
                text.write("" + clerk.ClerkName + " , " + clerk.itemsSold + " , " + clerk.itemsPurchased
                + " , " + clerk.itemsDamaged);
                text.newLine();
            }
        }
        catch (IOException e) {
            System.out.println("An error publishing tracker results occurred.");
            e.printStackTrace();
        }
    }

    public void close(){
        try{
            text.close();
        }
        catch (IOException e) {
            System.out.println("An error closing logger text occurred.");
            e.printStackTrace();
        }
    }
}
