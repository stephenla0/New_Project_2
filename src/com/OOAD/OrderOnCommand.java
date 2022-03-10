package com.OOAD;

public abstract class OrderOnCommand implements Command {
    Order order;  //reference to the command Receiver

    // constructor – sets the specific light to command
    public OrderOnCommand(Order order) {
        this.order = order;
    }

    //remote.control.setCommand(0,order::on, order::off);


    // override for execute with specifically what action the light needs to do
    @Override
    public void Execute() {
        order.giveOrder();
    }
}


