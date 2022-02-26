package com.OOAD;

import java.util.ArrayList;

public abstract class Item implements ConsoleLogger {
    String name;            // I didn't implement a naming scheme - mostly ignoring this - how would you?
    double purchasePrice;   // $1 to $50
    double listPrice;       // purchasePrice x 2
    boolean isNew;          // set by constructor randomly
    int dayArriving;        // 0 at initialization, otherwise set at delivery
    Condition condition;    // set by constructor randomly
    double salePrice;       // set when sold
    int daySold;            // set when sold
    ItemType itemType;      // set by subclass constructors
    int currentIndexForDeletion;
    boolean tunable;
    tunableType tuneType;

    boolean damageAnItem(Item i) {
        int currLevel = i.condition.getLevel();
        if (currLevel == 1){
            return true;
        }
        else{
            i.condition.setLevel(currLevel--);
            i.listPrice = i.listPrice * 0.8;
            return false;
        }
    }

    Item() {
        // common initialization of a new instance
        purchasePrice = Utility.rndFromRange(1,50);
        listPrice = 2 * purchasePrice;
        isNew = (Utility.rnd() > .5);  // coin flip for new or used
        dayArriving = 0;
        condition = Utility.randomEnum(Condition.class);
        salePrice = 0;
        daySold = 0;
        tunable = false;
        tuneType = tunableType.NONE;
    }

    public static Item FindItemToAdd(ArrayList<Item> list, ItemType itemType) {
        for (Item item: list) {
            if (item.itemType == itemType) return item;
        }
        return null;
    }
}

abstract class Music extends Item {
    String band;
    String album;
    String[] bands = {"Yes","Jethro Tull","Rush","Genesis","ELP","Enya"};
    String[] albums = {"Fragile","Stormwatch","2112","Abacab","Tarkus","The Memory of Trees"};
    Music() {
        super();
        band = bands[Utility.rndFromRange(0,bands.length-1)];
        album = albums[Utility.rndFromRange(0,albums.length-1)];
    }
}

class PaperScore extends Music {
    PaperScore() {
        super();
        itemType = ItemType.PAPERSCORE;
    }
}
class CD extends Music {
    CD() {
        super();
        itemType = ItemType.CD;
    }
}
class Vinyl extends Music {
    Vinyl() {
        super();
        itemType = ItemType.VINYL;
    }
}

class Cassette extends Music { //new added for proj 3
    Cassette() {
        super();
        itemType = ItemType.CASSETTE;
    }
}

abstract class Players extends Item {
    boolean equalized;
    Players() {
        super();
        equalized=false;
        tunable=true;
        tuneType = tunableType.PLAYERS;
    }
}

class CDPlayer extends Players {
    CDPlayer() {
        super();
        itemType = ItemType.CDPLAYER;
    }
}

class RecordPlayer extends Players {
    RecordPlayer() {
        super();
        itemType = ItemType.RECORDPLAYER;
    }
}

class MP3 extends Players {
    MP3() {
        super();
        itemType = ItemType.MP3;
    }
}

class CassettePlayer extends Players { //added proj_3
    CassettePlayer() {
        super();
        itemType = ItemType.CASSETTEPLAYER;
    }
}

abstract class Instrument extends Item {
}

abstract class Stringed extends Instrument {
    boolean isElectric;
    boolean tuned;
    Stringed() {
        super();
        isElectric = (Utility.rnd()>.5); // coin flip for electric or acoustic
        tuned=false;
        tunable=true;
        tuneType = tunableType.STRINGED;
    }
}

class Guitar extends Stringed {
    Guitar() {
        super();
        itemType = ItemType.GUITAR;
    }
}
class Bass extends Stringed {
    Bass() {
        super();
        itemType = ItemType.BASS;
    }
}
class Mandolin extends Stringed {
    Mandolin() {
        super();
        itemType = ItemType.MANDOLIN;
    }
}

abstract class Wind extends Instrument {
    boolean adjusted;
    Wind() {
        super();
        adjusted=false;
        tunable=true;
        tuneType = tunableType.WIND;
    }
}

class Flute extends Wind {
    String type;
    String[] types = {"Piccolo","Alto","Bass","Tierce","Concert","Plastic"};
    Flute() {
        super();
        type = types[Utility.rndFromRange(0,types.length-1)];
        itemType = ItemType.FLUTE;
    }
}
class Harmonica extends Wind {
    String key;
    String keys[] = {"E","A","G","C","D"};
    Harmonica() {
        super();
        key = keys[Utility.rndFromRange(0,keys.length-1)];
        itemType = ItemType.HARMONICA;
    }
}

class Saxophone extends Wind {
    String type;
    String[] types = {"Sopranino", "Soprano", "Alto", "Tenor", "Baritone", "Bass"};

    Saxophone() {
        super();
        type = types[Utility.rndFromRange(0,types.length-1)];
        itemType = ItemType.SAXOPHONE;
    }
}


abstract class Clothing extends Item {
}

class Hats extends Clothing {
    String size;
    String sizes[] = {"XS", "S", "M", "L", "XL"};
    Hats() {
        super();
        size = sizes[Utility.rndFromRange(0,sizes.length-1)];
        itemType = ItemType.HATS;
    }
}

class Shirts extends Clothing {
    String size;
    String sizes[] = {"XS", "S", "M", "L", "XL"};
    Shirts() {
        super();
        size = sizes[Utility.rndFromRange(0,sizes.length-1)];
        itemType = ItemType.SHIRTS;
    }
}

class Bandanas extends Clothing {
    Bandanas() {
        super();
        itemType = ItemType.BANDANAS;
    }
}

abstract class Accessories extends Item {
}

class PracticeAmps extends Accessories {
    int wattage;
    int wattages[] = {1, 5, 10, 15, 20, 40, 50, 75, 90};
    PracticeAmps() {
        super();
        wattage = wattages[Utility.rndFromRange(0,wattages.length-1)];
        itemType = ItemType.PRACTICEAMPS;
    }
}

class Cables extends Accessories {
    int cable;
    int cables[] = {10, 12, 15, 20};
    Cables() {
        super();
        cable = cables[Utility.rndFromRange(0,cables.length-1)];
        itemType = ItemType.CABLES;
    }
}

class GigBag extends Accessories { //ADDED proj_3
    GigBag() {
        super();
        itemType = ItemType.GIGBAG;
    }
}


class Strings extends Accessories {
    String stringType;
    String strings[] = {"Guitar", "Bass", "Mandolin"};
    Strings() {
        super();
        stringType = strings[Utility.rndFromRange(0,strings.length-1)];
        itemType = ItemType.STRINGS;
    }
}
