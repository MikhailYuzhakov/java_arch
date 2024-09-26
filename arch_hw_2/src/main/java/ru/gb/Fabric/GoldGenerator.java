package ru.gb.Fabric;

import ru.gb.Interface.IGameItem;
import ru.gb.Product.GoldReward;

public class GoldGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}
