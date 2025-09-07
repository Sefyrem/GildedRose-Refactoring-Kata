package com.gildedrose;

public enum LegendaryItemEnum {
    SULFURA("Sulfuras, Hand of Ragnaros");

    private final String item;

    LegendaryItemEnum(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public static boolean isLegendaryItem(String itemName) {
        for (LegendaryItemEnum legendaryItem : LegendaryItemEnum.values()) {
            if (legendaryItem.getItem().equalsIgnoreCase(itemName)) {
                return true;
            }
        }
        return false;
    }
}
