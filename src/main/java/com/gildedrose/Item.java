package com.gildedrose;

import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.BackStagePass;
import com.gildedrose.items.Sulfuras;

public class Item {
    public String name;
	public int sellIn; 
    public int quality;

	protected Item(String name, int sellIn, int quality) {
		this.setName(name);
		this.setSellIn(sellIn);
		this.setQuality(quality);
	}
    
	/* Generated getter and setter code */
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSellIn() {
		return sellIn;
	}
	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "Item{" +
				"name='" + name + '\'' +
				", sellIn=" + sellIn +
				", quality=" + quality +
				'}';
	}

	protected boolean isBackStagePass() {
		return false;
	}

	protected boolean isSulfuras() {
		return false;
	}

	protected boolean isAgedBrie() {
		return false;
	}

	public void passOneDay() {
		updateSellInDays();
		updateQuality();

		if (isExpired()) {
			updateQualityAfterExpiration();
		}
	}

	protected void updateQuality() {
		deceaseQuality();
	}

	protected void updateQualityAfterExpiration() {
		deceaseQuality();
	}

	private void deceaseQuality() {
		if (quality > 0) {
			quality = quality - 1;
		}
	}

	private boolean isExpired() {
		return sellIn < 0;
	}

	protected void updateSellInDays() {
		sellIn = sellIn - 1;
	}

	public void increaseQuality() {
		if (quality < 50) {
			quality = quality + 1;
		}
	}
}
