package com.OOAD;
//This is remote controls
public class Order
{
    Command onOrders[]; //uses interface
    Command offOrders[]; //uses interface
    public void Order() {}

    public void setCommand(int slot, Command onOrder, Command offOrder) //for lambda expressions
    {
        onOrders[slot] = onOrder;
        offOrders[slot] = offOrder;
    }
    public void giveOrder() {
        System.out.println("Order has been given");
        for(int i = 0; i < onOrders.length; i++)
        {
            onOrders[i].Execute();
        }

    }
}

