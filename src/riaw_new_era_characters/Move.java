package riaw_new_era_characters;

public class Move implements Movement {
    private CurrentGeoPosition geoPosition;
    private int x = geoPosition.getX();
    private int y = geoPosition.getY();
    private int z = geoPosition.getZ();

    private int stepX;
    private int stepY;
    private int stepZ;

    private Step step;

    @Override
    public int[] forward() {
        stepX = x + step.getStep_x();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] forward_diagonal_right() {
        stepX = x + step.getStep_x();
        stepY = y + step.getStep_y();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] forward_diagonal_left() {
        stepX = x + step.getStep_x();
        stepY = y - step.getStep_y();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] back() {
        stepX = x - step.getStep_x();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] back_diagonal_right() {
        stepX = x - step.getStep_x();
        stepY = y + step.getStep_y();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] back_diagonal_left() {
        stepX = x - step.getStep_x();
        stepY = y - step.getStep_y();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] right() {
        stepY = y + step.getStep_y();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] left() {
        stepY = y - step.getStep_y();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] jump() {
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] jump_forward() {
        stepX = x + step.getStep_x();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] jump_forward_diagonal_right() {
        stepX = x + step.getStep_x();
        stepY = y + step.getStep_y();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] jump_forward_diagonal_left() {
        stepX = x + step.getStep_x();
        stepY = y - step.getStep_y();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] jump_back() {
        stepX = x - step.getStep_x();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] jump_right() {
        stepY = y + step.getStep_y();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] jump_left() {
        stepY = y - step.getStep_y();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] jump_back_diagonal_right() {
        stepX = x - step.getStep_x();
        stepY = y + step.getStep_y();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] jump_back_diagonal_left() {
        stepX = x - step.getStep_x();
        stepY = y - step.getStep_y();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] fly() {
        stepZ = z + step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] fly_forward() {
        stepY = y + step.getStep_y();
        stepZ = z + step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] fly_forward_diagonal_right() {
        stepX = x + step.getStep_x();
        stepY = y + step.getStep_y();
        stepZ = z + step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] fly_forward_diagonal_left() {
        stepX = x + step.getStep_x();
        stepY = y - step.getStep_y();
        stepZ = z + step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] fly_back() {
        stepX = x - step.getStep_x();
        stepZ = z + step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] fly_right() {
        stepY = y + step.getStep_y();
        stepZ = z + step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] fly_left() {
        stepY = y - step.getStep_y();
        stepZ = z + step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] fly_back_diagonal_right() {
        stepX = x - step.getStep_x();
        stepY = y + step.getStep_y();
        stepZ = z + step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] fly_back_diagonal_left() {
        stepX = x - step.getStep_x();
        stepY = y - step.getStep_y();
        stepZ = z + step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] dive() {
        stepZ = z - step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] dive_forward() {
        stepX = x + step.getStep_x();
        stepZ = z - step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] dive_forward_diagonal_right() {
        stepX = x + step.getStep_x();
        stepY = y + step.getStep_y();
        stepZ = z - step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] dive_forward_diagonal_left() {
        stepX = x + step.getStep_x();
        stepY = y - step.getStep_y();
        stepZ = z - step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] dive_back() {
        stepX = x - step.getStep_x();
        stepZ = z - step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] dive_right() {
        stepY = y + step.getStep_y();
        stepZ = z - step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] dive_left() {
        stepY = y - step.getStep_y();
        stepZ = z - step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] dive_back_diagonal_right() {
        stepX = x - step.getStep_x();
        stepY = y + step.getStep_y();
        stepZ = z - step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public int[] dive_back_diagonal_left() {
        stepX = x - step.getStep_x();
        stepY = y - step.getStep_y();
        stepZ = z - step.getStep_z();
        return new int[] {stepX, stepY, stepZ};
    }

    @Override
    public void stay() {

    }

    @Override
    public void pass() {

    }


}
