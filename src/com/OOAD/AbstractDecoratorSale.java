package com.OOAD;
//Abstract Decorator Class the implements Decorator Interface
public abstract class AbstractDecoratorSale implements Decorator
{
    protected Decorator decorator;

    public AbstractDecoratorSale(Decorator decorator)
    {
        this.decorator = decorator;
    }

    public void sales(){decorator.sales();}

}





//https://www.geeksforgeeks.org/decorator-design-pattern-in-java-with-example/
