package com.OOAD;
import java.beans.PropertyChangeListener;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

//These tests can verify objects are instantiated, check expected numeric values, or test algorithms in the code.
// You must be able to run your code in test mode to run these JUnit tests and capture the output of the tests
// to a test output text file in your repository.
public class testing {
    public void testMusic()
    {
        CD cd = new CD(); //1
        assertTrue(cd instanceof Item);
        assertTrue(cd instanceof Music);

        PaperScore ps = new PaperScore(); //2
        assertTrue(ps instanceof Item);
        assertTrue(ps instanceof Music);

        Vinyl vl = new Vinyl(); //3
        assertTrue(vl instanceof Item);
        assertTrue(vl instanceof Music);

        Cassette cs = new Cassette(); //4
        assertTrue(cs instanceof Item);
        assertTrue(cs instanceof Music);
    }

    public void testPlayers()
    {
        CDPlayer cd = new CDPlayer(); //5
        assertTrue(cd instanceof Item);
        assertTrue(cd instanceof Players);

        RecordPlayer ps = new RecordPlayer(); //6
        assertTrue(ps instanceof Item);
        assertTrue(ps instanceof Players);

        CassettePlayer vl = new CassettePlayer(); //7
        assertTrue(vl instanceof Item);
        assertTrue(vl instanceof Players);

        MP3 cs = new MP3(); //8
        assertTrue(cs instanceof Item);
        assertTrue(cs instanceof Players);
    }
    public void testInstruments()
    {
        Guitar gt = new Guitar(); //8
        assertTrue(gt instanceof Item);
        assertTrue(gt instanceof Stringed);
        assertTrue(gt instanceof Instrument);


        Bass bass = new Bass(); //9
        assertTrue(bass instanceof Item);
        assertTrue(bass instanceof Stringed);
        assertTrue(bass instanceof Instrument);

        Mandolin mandolin = new Mandolin(); //10
        assertTrue(mandolin instanceof Item);
        assertTrue(mandolin instanceof Stringed);
        assertTrue(mandolin instanceof Instrument);

        Flute flute = new Flute(); //11
        assertTrue(flute instanceof Item);
        assertTrue(flute instanceof Wind);
        assertTrue(flute instanceof Instrument);

        Saxophone saxophone = new Saxophone(); //12
        assertTrue(saxophone instanceof Item);
        assertTrue(saxophone instanceof Wind);
        assertTrue(saxophone instanceof Instrument);

        Harmonica harmonica = new Harmonica(); //13
        assertTrue(harmonica instanceof Item);
        assertTrue(harmonica instanceof Wind);
        assertTrue(harmonica instanceof Instrument);
    }

    public void testClothing()
    {
        Shirts shirt = new Shirts(); //15
        assertTrue(shirt instanceof Item);
        assertTrue(shirt instanceof Clothing);
        assertTrue(shirt.size != null);

        Hats hat = new Hats(); //16
        assertTrue(hat instanceof Item);
        assertTrue(hat instanceof Clothing);
        assertTrue(hat.size != null);

        Bandanas bandanas = new Bandanas(); //17
        assertTrue(bandanas instanceof Item);
        assertTrue(shirt instanceof Clothing);
    }

    public void testClerks()
    {
        ClerkObserver observer = new ClerkObserver(); //14
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
