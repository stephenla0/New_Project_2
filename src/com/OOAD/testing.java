package com.OOAD;
import java.beans.PropertyChangeListener;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

//These tests can verify objects are instantiated, check expected numeric values, or test algorithms in the code.
// You must be able to run your code in test mode to run these JUnit tests and capture the output of the tests
// to a test output text file in your repository.
public class testing {

    //instantiation of variables to test
    CD cd = new CD();
    Guitar gt = new Guitar();
    Flute fl = new Flute();
    Hats hat = new Hats();
    GigBag gb = new GigBag();
    Cables cable = new Cables();

    public void testItems()
    {
        //Basic testing
        assertTrue(cd instanceof Item);
        assertTrue(cd instanceof Music);
        assertTrue(fl instanceof Item);
        assertTrue(hat instanceof Item);
        assertTrue(gb instanceof Item);
        assertTrue(gt instanceof Item);
        assertTrue(cable instanceof Item);
    }

    public void testSimilarItems() //so make sure they are of the same class
    {
        //making sure classes are same
        assertEquals(cable.getClass(), GigBag.class);
        assertEquals(gt.getClass(), Stringed.class);
        assertEquals(cd.getClass(), Vinyl.class);
        assertEquals(hat.getClass(), Shirts.class);
        assertEquals(fl.getClass(), Wind.class);
    }

    public void testClerks()
    {
        ClerkObserver observer = new ClerkObserver();
        Store fakeStore = new Store();
        Clerk clerk = new Clerk("Tester Clerk", 0.4, fakeStore, observer,0.6);
        assertEquals(clerk.getClass(), Clerk.class);
        assertEquals(clerk.name,"Tester Clerk");
        assertSame(clerk.damageChance, 0.4);
    }

    public void testInstantiated()
        {
            //assertThrows(Clothing.class, () -> {new Shirts();});
        }

}
