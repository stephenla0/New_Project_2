package com.OOAD;
import java.util.ArrayList;
import java.util.List;
//This is remote controls
public class RemoteControl
{
    private List<Command> orderList = new ArrayList<Command>();
    public void Order() {}

    public void setCommand(int slot, Command order) //for lambda expressions
    {
       orderList.add(order);
    }
    //tutorialspoint.com/design_pattern/command_pattern.htm
    public void giveOrder() {  //"button was pressed"
        System.out.println("Order has been given");
        for(Command order : orderList)
        {
            order.Execute();
        }
        orderList.clear();

    }
}

