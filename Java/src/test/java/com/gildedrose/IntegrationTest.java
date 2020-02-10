package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationTest {

    static Item[] day0 = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20), //
            new Item("Aged Brie", 2, 0), //
            new Item("Elixir of the Mongoose", 5, 7), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 3, 6) };

    static Item[] day1 = new Item[] {
            new Item("+5 Dexterity Vest", 9, 19), //
            new Item("Aged Brie", 1, 1), //
            new Item("Elixir of the Mongoose", 4, 6), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21),
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 50),
            new Item("Backstage passes to a TAFKAL80ETC concert", 4, 50),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 2, 5) };

    static Item[] day2 = new Item[] {
            new Item("+5 Dexterity Vest", 8, 18), //
            new Item("Aged Brie", 0, 2), //
            new Item("Elixir of the Mongoose", 3, 5), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 13, 22),
            new Item("Backstage passes to a TAFKAL80ETC concert", 8, 50),
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 50),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 1, 4) };

    @Test
    public void initialize(){
        Item[] items = Arrays.stream(day0).map(item -> new Item(item.name, item.sellIn, item.quality)).toArray(Item[]::new);
        GildedRose gildedRose = new GildedRose(items);

        for(int i=0; i < items.length; i++) {
            assertEquals(day0[i].quality, items[i].quality);
            assertEquals(day0[i].sellIn, items[i].sellIn);
            assertEquals(day0[i].name, items[i].name);
        }
    }

    @Test
    public void days() {
        Item[] items = Arrays.stream(day0).map(item -> new Item(item.name, item.sellIn, item.quality)).toArray(Item[]::new);
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();
        for(int i=0; i < items.length; i++) {
            assertEquals(day1[i].quality, items[i].quality);
            assertEquals(day1[i].sellIn, items[i].sellIn);
            assertEquals(day1[i].name, items[i].name);
        }

        gildedRose.updateQuality();
        for(int i=0; i < items.length; i++) {
            assertEquals(day2[i].quality, items[i].quality);
            assertEquals(day2[i].sellIn, items[i].sellIn);
            assertEquals(day2[i].name, items[i].name);
        }
    }
}
