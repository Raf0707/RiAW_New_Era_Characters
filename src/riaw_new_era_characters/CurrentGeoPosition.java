package riaw_new_era_characters;

public class CurrentGeoPosition {
    public int x;
    public int y;
    public int z;

    public CurrentGeoPosition(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int[] getCoords(int x, int y, int z) {
        return new int[]{x, y, z};
    }

}
