package ru.gb.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int id;
    public List<PolygonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(List<PolygonalModel> models, List<Camera> cameras) {
        this.cameras = cameras;
        this.models = models;
        this.flashes = new ArrayList<>();
    }

    public void addFlash(Flash flash) {
        flashes.add(flash);
    }

}
