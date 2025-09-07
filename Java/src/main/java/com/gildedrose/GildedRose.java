package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!LegendaryItemEnum.isLegendaryItem(item.name)) {
                item.sellIn = item.sellIn - 1;

                if (!SpecialItemEnum.isSpecialItem(item.name)) {
                    if (item.quality > 0) {
                        item.quality = item.quality - 1;
                    }
                    if (item.sellIn < 0 && item.quality > 0) {
                        item.quality = item.quality - 1;
                    }
                    if (item.name.toLowerCase().contains("conjured") && item.quality > 0) {
                        item.quality = item.quality - 1;
                    }
                } else {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }

                    if (item.name.equals(SpecialItemEnum.CONCERT.getItem())) {
                        if (item.sellIn < 0) {
                            item.quality = 0;
                        } else if (item.sellIn < 6) {
                            item.quality = item.quality + 2;
                        } else if (item.sellIn < 11) {
                            item.quality = item.quality + 1;
                        }
                        if (item.quality > 50) {
                            item.quality = 50;
                        }
                    }

                    if (item.name.equals(SpecialItemEnum.BRIE.getItem()) && item.quality < 50 && item.sellIn < 0) {
                        item.quality = item.quality + 1;
                    }
                }
            }
        }
    }
}
