package com.OOAD;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    FileWriter text;
    int day;

    Logger(int day) {
        // reference: https://www.w3schools.com/java/java_files_create.asp
        this.day = day;
        try {
            text = new FileWriter("Logger-" + day + ".txt");
        } catch (IOException e) {
            System.out.println("An error creating logger file " + day + " occurred.");
            e.printStackTrace();
        }
    }

    public void write(String string){
        try{
            text.write(string);
        }
        catch (IOException e) {
            System.out.println("An error writing logger text occurred.");
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
