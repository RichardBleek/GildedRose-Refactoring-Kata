package com.gildedrose;

import org.junit.jupiter.api.Test;

public class ItemTest {

    @Test
    void sellInValue() {
        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
        };

        GildedRose gildedRose = new GildedRose(items);


    }
}
