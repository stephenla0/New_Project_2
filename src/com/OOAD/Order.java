package com.OOAD;

//different options client will have to use and its command classes
public class Order
{
    public void getStore()
    {
        System.out.println("Requesting Store.");
    }

    public void clerkName()
    {
        System.out.println("Asking Clerk their name.");
    }

    public void getTime()
    {
        System.out.println("Asking Clerk what time it is.");
    }

    public void sellInventory()
    {
        System.out.println("Selling to Clerk.");
    }

    public void buyInventory()
    {
        System.out.println("Buying inventory.");
    }

    public void buyGuitarKit()
    {
        System.out.println("Buying Guitar Kit.");
    }

    public void end()
    {
        System.out.println("Ending interactions.");
    }

}
