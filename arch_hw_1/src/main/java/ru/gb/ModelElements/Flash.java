package ru.gb.ModelElements;

import ru.gb.common.Angle3D;
import ru.gb.common.Color;
import ru.gb.common.Point3D;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public Float power;

    public Flash() {};

    public void rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void move(Point3D location) {
        this.location = location;
    }
}
