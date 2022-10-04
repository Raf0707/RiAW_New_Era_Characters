package riaw_new_era_characters;

public class Step {
    private CurrentGeoPosition geoPosition;
    private int x = geoPosition.getX();
    private int y = geoPosition.getY();
    private int z = geoPosition.getZ();

    private int step_x;
    private int step_y;
    private int step_z;

    public Step(int x, int y, int z, int step_x, int step_y, int step_z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.step_x = step_x;
        this.step_y = step_y;
        this.step_z = step_z;
    }

    public int getStep_x() {
        return step_x;
    }

    public void setStep_x(int step_x) {
        this.step_x = step_x;
    }

    public int getStep_y() {
        return step_y;
    }

    public void setStep_y(int step_y) {
        this.step_y = step_y;
    }

    public int getStep_z() {
        return step_z;
    }

    public void setStep_z(int step_z) {
        this.step_z = step_z;
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
}
