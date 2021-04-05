物品的属性:

    - SellIn 销售期限 表示多少天之内把物品卖出去
    - Quality 物品品质 物品的品质

SellIn:

    - 每天结束的时候 会降低

Quality:

    - 每天结束的时候 会降低
    - where sellIn = 0  双倍下降
    - >= 0 AND <= 50

特例：

    - Aged Brie Quality 会随时间推移而提高
    - Sulfuras 永远不过期 不会降低Quality 因此它的品质是80且永远不变。
    - Backstage passes 品质`Quality`会随着时间推移而提高；
        当还剩10天或更少的时候，品质`Quality`每天提高2；
        当还剩5天或更少的时候，品质`Quality`每天提高3；
        但一旦过期，品质就会降为0
    - "Conjured"（召唤物品）的品质`Quality`下降速度比正常物品快一倍
    