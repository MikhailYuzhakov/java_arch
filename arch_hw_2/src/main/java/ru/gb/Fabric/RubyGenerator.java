package ru.gb.Fabric;

import ru.gb.Interface.IGameItem;
import ru.gb.Product.RubyReward;

public class RubyGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new RubyReward();
    }
}
