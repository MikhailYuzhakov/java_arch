package ru.gb.Fabric;

import ru.gb.Interface.IGameItem;
import ru.gb.Product.SilverReward;

public class SilverGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new SilverReward();
    }
}
