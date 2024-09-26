package ru.gb.Fabric;

import ru.gb.Interface.IGameItem;
import ru.gb.Product.EmeraldReward;

public class EmeraldGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new EmeraldReward();
    }
}
