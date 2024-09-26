package ru.gb.Fabric;

import ru.gb.Interface.IGameItem;
import ru.gb.Product.AlexandriteReward;

public class AlexandriteGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new AlexandriteReward();
    }
}
