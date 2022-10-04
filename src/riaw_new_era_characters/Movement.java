package riaw_new_era_characters;

public interface Movement {
    int[] forward(); // +x
    int[] forward_diagonal_right(); // +x, +y
    int[] forward_diagonal_left(); // +x, -y
    int[] back(); // -x
    int[] back_diagonal_right(); // -x, +y
    int[] back_diagonal_left(); // -x, -y
    int[] right(); // +y
    int[] left(); // -y
    int[] jump(); // 0
    int[] jump_forward(); // +x
    int[] jump_forward_diagonal_right(); // +x, +y
    int[] jump_forward_diagonal_left(); // +x, -y
    int[] jump_back(); // -x
    int[] jump_right(); // +y
    int[] jump_left(); // -y
    int[] jump_back_diagonal_right(); // -x, +y
    int[] jump_back_diagonal_left(); // -x, -y
    int[] fly(); // +z
    int[] fly_forward(); // +x, +z
    int[] fly_forward_diagonal_right(); // +x, +y +z
    int[] fly_forward_diagonal_left(); // +x, -y, +z
    int[] fly_back(); // -x, +z
    int[] fly_right(); // +y, +z
    int[] fly_left(); // -y, +z
    int[] fly_back_diagonal_right(); // -x, +y, +z
    int[] fly_back_diagonal_left(); // -x, -y, +z

    int[] dive(); // -z
    int[] dive_forward(); // +x, -z
    int[] dive_forward_diagonal_right(); // +x, +y, -z
    int[] dive_forward_diagonal_left(); // +x, -y, -z
    int[] dive_back(); // -x, -z
    int[] dive_right(); // +y, -z
    int[] dive_left(); // -y, -z
    int[] dive_back_diagonal_right(); // -x, +y, -z
    int[] dive_back_diagonal_left(); // -z, -y, -z


    void stay(); //
    void pass(); //
}
