package gilded.rose.refactoring.kata;

public class GildedRoseCs {
    ItemCs[] items;

    public GildedRoseCs(ItemCs[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            ItemCs item = items[i];
            doUpdateItemQuality(item);
        }
    }

    private void doUpdateItemQuality(ItemCs item) {
        if ("Aged Brie".equals(item.name)) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;

            }

            item.sellIn = item.sellIn - 1;

            if (item.sellIn < 0) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        } else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;

                if (item.sellIn < 11) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }

                if (item.sellIn < 6) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }

            item.sellIn = item.sellIn - 1;

            if (item.sellIn < 0) {
                item.quality = item.quality - item.quality;
            }
        } else if ("Sulfuras, Hand of Ragnaros".equals(item.name)) {

        } else {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }

            item.sellIn = item.sellIn - 1;

            if (item.sellIn < 0) {
                if (item.quality > 0) {
                    item.quality = item.quality - 1;
                }
            }
        }
    }

}