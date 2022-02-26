package com.OOAD;
//Concrete Class that extends Abstract and will actually be called to modify sales
public class CablesSale extends AbstractDecoratorSale
{
    public CablesSale (Decorator decorator)
    {
        super(decorator);
    }

    @Override public double sales()
    {
        decorator.sales();
        return setStringSale(decorator); //not sure on this
    }

    private double setStringSale(Decorator decorator)
    {
        return .30;
    }

    @Override public int quantity()
    {
        decorator.sales();
        return setQuantity(); //not sure on this
    }

    private int setQuantity()
    {
        return Utility.rndFromRange(1,2);
    }
}
