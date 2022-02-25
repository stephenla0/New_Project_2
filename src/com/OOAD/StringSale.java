package com.OOAD;
//Concrete Class that extends Abstract and will actually be called to modify sales
public class StringSale extends AbstractDecoratorSale
{
    public StringSale (Decorator decorator)
    {
        super(decorator);
    }

    @Override public void sales()
    {
        decorator.sales();
        setStringSale(decorator);
    }

    private void setStringSale(Decorator decorator)
    {
        System.out.println("We made it here!");
    }
}
