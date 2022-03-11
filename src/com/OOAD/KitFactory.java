package com.OOAD;

public class KitFactory extends CreateGuitarKit{ //THIS IS NOT CORRECT
    public GuitarKitInterface createKit(Item type)
    {
        Item item;

        switch (type) {
            case BRIDGE -> item = new Bridge();
            case NECK -> item = new Neck();
            case KNOBSET -> item = new KnobSet();
            case COVERS -> item = new Covers();
            case PICKGUARD -> item = new PickGuard();
            case PICKUPS -> item = new Pickups();
            default -> {
                out("Error in makeNewItemByType - unexpected type enum");
                item = null;
            }
        }
    }

}
