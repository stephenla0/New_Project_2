package com.OOAD;

public class getStore implements Command {
    Order order;  //reference to the command Receiver

    // constructor – sets the specific order to command
    public getStore(Order order) {
        this.order = order;
    }

    //remote.control.setCommand(0,order::on, order::off);


    // override for execute with specifically what action the light needs to do
    @Override
    public void Execute() {
        order.getStore();
    }
}


