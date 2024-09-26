package ru.gb.Fabric;

import ru.gb.Interface.IGameItem;

public abstract class ItemGenerator {
    public abstract IGameItem createItem();

    public IGameItem getReward() {
        return createItem();
    }
}
