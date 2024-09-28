package ISP;

public class Cube implements Shape3D {
    public int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    @Override
    public double volume() {
        return Math.pow(edge, 3);
    }
}
