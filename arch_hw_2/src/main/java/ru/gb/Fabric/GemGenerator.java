package ru.gb.Fabric;

import ru.gb.Interface.IGameItem;
import ru.gb.Product.GemReward;

public class GemGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}
