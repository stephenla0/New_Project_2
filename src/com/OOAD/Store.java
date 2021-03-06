package com.OOAD;
import java.util.ArrayList;

public class Store implements ConsoleLogger {
    public ArrayList<Clerk> clerks;
    public Clerk activeClerk;
    public double cashRegister;
    public double cashFromBank;
    public Inventory inventory;
    public int today;
    ClerkObserver observer;
    TuneContext context;
    double tuneresult;
    Tracker tracker;
    Logger logger;

    Store() {
        // initialize the store's starting inventory
        inventory = new Inventory();

        cashRegister = 0;   // cash register is empty to begin
        cashFromBank = 0;   // no cash from bank yet

        // initialize the store's staff, observer, and tuning strategy
        observer = new ClerkObserver();
        clerks = new ArrayList<Clerk>();
        context = new TuneContext(new Manual()); //use strategy to make odds and add it in clerk
        tuneresult = context.gettune();
        clerks.add(new Clerk("Velma",.05, this, observer, tuneresult));
        context = new TuneContext(new Haphazard());
        tuneresult = context.gettune();
        clerks.add(new Clerk("Shaggy", .20, this, observer, tuneresult));
        context = new TuneContext(new Electronic());
        tuneresult = context.gettune();
        clerks.add(new Clerk("Daphne", .15, this, observer, tuneresult)); //An additional Clerk will be hired – Daphne.
        tracker = new Tracker(); //initialize tracker for observer
    }

    void openToday(int day) {
        today = day;
        logger = new Logger(day, tracker); //create new tracker each day
        observer.setLogger(logger);
        out("Store opens today, day "+day);
        activeClerk = getValidClerk();
        out(activeClerk.name + " is working today.");
        activeClerk.arriveAtStore();
        activeClerk.checkRegister();
        activeClerk.doInventory();
        activeClerk.openTheStore();
        activeClerk.cleanTheStore();
        activeClerk.leaveTheStore();
        logger.publishTracker(); //publish current tracker results to logger
        logger.close(); //close logger
        logger = null;
    }

    Clerk getValidClerk() {
        // pick a random clerk
        Clerk clerk = clerks.get(Utility.rndFromRange(0,clerks.size()-1));
        Clerk sickclerk = null;
        //see if clerk is sick
        if(Utility.rnd()<0.1){
            sickclerk = clerk;
        }

        // if they are ok to work, set days worked on other clerks to 0
        if ((sickclerk == null) && (clerk.daysWorked < 3)) {
            clerk.daysWorked += 1;
            for (Clerk other: clerks) {
                if (other != clerk) other.daysWorked = 0; // they had a day off, so clear their counter
            }
        }
        // if they are not ok to work, set their days worked to 0 and get another clerk
        else if ((sickclerk == null) && (clerk.daysWorked >= 3)){
            out(clerk.name+" has worked maximum of 3 days in a row.");
            clerk.daysWorked = 0;   // they can't work, get another clerk
            for (Clerk other: clerks) {
                if (other != clerk) {
                    clerk = other;
                    break;
                }
            }
            for (Clerk others: clerks) {
                if (others != clerk) others.daysWorked = 0; // they had a day off, so clear their counter
            }
        }
        // new case: if sick get new eligible clerk and give others a break
        else {
            out(clerk.name+" is sick today and can not work.");
            clerk.daysWorked = 0;
            for (Clerk other: clerks) {
                if ((other != clerk) && (other.daysWorked < 3)) {
                    clerk = other;
                    break;
                }
            }
            for (Clerk others: clerks) {
                if (others != clerk) others.daysWorked = 0; // they had a day off, so clear their counter
            }
        }
        return clerk;
    }

    void closedToday(int day) {
        logger = new Logger(day, tracker);
        observer.setLogger(logger);
        out("Store is closed today, day "+day);
        logger.write("Store is closed today, day "+day);
        logger.publishTracker();
        logger.close();
        logger = null;
    }

    //for summary
    double getRemainingCashInRegister(){
        return cashRegister;
    }

    double getTotalMoneyFromBank(){
        return cashFromBank;
    }

}
