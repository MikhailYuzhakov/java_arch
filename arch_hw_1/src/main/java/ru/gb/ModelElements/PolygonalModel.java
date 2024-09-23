package ru.gb.ModelElements;

import ru.gb.common.Polygon;
import ru.gb.common.Texture;

import java.util.ArrayList;
import java.util.List;

public class PolygonalModel {
    public List<Polygon> polygons;
    public List<Texture> textures;

    public PolygonalModel(List<Texture> textures) {
        this.textures = textures;
        this.polygons = new ArrayList<>();
    }

    public void addPolygon(Polygon polygon) {
        polygons.add(polygon);
    }

}
