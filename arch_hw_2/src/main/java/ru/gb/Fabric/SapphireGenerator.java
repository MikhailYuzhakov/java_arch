package ru.gb.Fabric;

import ru.gb.Interface.IGameItem;
import ru.gb.Product.SapphireReward;

public class SapphireGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new SapphireReward();
    }
}
