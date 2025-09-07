package com.gildedrose;

public enum SpecialItemEnum {
    BRIE("Aged Brie"),
    CONCERT("Backstage passes to a TAFKAL80ETC concert");

    private final String item;

    SpecialItemEnum(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public static boolean isSpecialItem(String itemName) {
        for (SpecialItemEnum specialItem : SpecialItemEnum.values()) {
            if (specialItem.getItem().equalsIgnoreCase(itemName)) {
                return true;
            }
        }
        return false;
    }

}
