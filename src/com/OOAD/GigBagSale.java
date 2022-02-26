package com.OOAD;
//Concrete Class that extends Abstract and will actually be called to modify sales
public class GigBagSale extends AbstractDecoratorSale
{
    public GigBagSale (Decorator decorator)
    {
        super(decorator);
    }

    @Override public double sales()
    {
        decorator.sales();
        return setStringSale(); //not sure on this
    }

    private double setStringSale()
    {
       return .2;
    }

    @Override public int quantity()
    {
        decorator.sales();
        return setQuantity(); //not sure on this
    }

    private int setQuantity()
    {
        return 1;
    }

}
