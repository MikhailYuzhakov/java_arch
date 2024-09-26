package ru.gb.Fabric;

import ru.gb.Interface.IGameItem;
import ru.gb.Product.PearlReward;

public class PearlGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new PearlReward();
    }
}
