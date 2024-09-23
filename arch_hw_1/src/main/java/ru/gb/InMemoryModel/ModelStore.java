package ru.gb.InMemoryModel;

import ru.gb.ModelElements.Camera;
import ru.gb.ModelElements.Flash;
import ru.gb.ModelElements.PolygonalModel;
import ru.gb.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PolygonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;

    private IModelChangedObserver[] changedObservers;

    public ModelStore(IModelChangedObserver[] changedObservers) {
        this.changedObservers = changedObservers;
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
    }

    public Scene getScene(int number) {
        return scenes.get(number);
    }

    @Override
    public void IModelChange(IModelChanger sender) {

    }
}
