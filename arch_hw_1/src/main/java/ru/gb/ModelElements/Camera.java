package ru.gb.ModelElements;

import ru.gb.common.Angle3D;
import ru.gb.common.Point3D;

public class Camera {
    public Point3D location;
    public Angle3D angle;

    public Camera() {}

    public void rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void move(Point3D location) {
        this.location = location;
    }
}
