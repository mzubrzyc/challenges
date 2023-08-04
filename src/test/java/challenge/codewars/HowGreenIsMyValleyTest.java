package challenge.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HowGreenIsMyValleyTest {

    @Test
    void makeValley() {
        int[] a = new int[]{17, 17, 15, 14, 8, 7, 7, 5, 4, 4, 1};
        int[] r = new int[]{17, 15, 8, 7, 4, 1, 4, 5, 7, 14, 17};
        assertThat(HowGreenIsMyValley.makeValley(a)).containsExactly(r);
        a = new int[]{20, 7, 6, 2};
        r = new int[]{20, 6, 2, 7};
        assertThat(HowGreenIsMyValley.makeValley(a)).containsExactly(r);
        a = new int[]{};
        r = new int[]{};
        assertThat(HowGreenIsMyValley.makeValley(a)).containsExactly(r);
        a = new int[]{79, 35, 54, 19, 35, 25};
        r = new int[]{79, 35, 25, 19, 35, 54};
        assertThat(HowGreenIsMyValley.makeValley(a)).containsExactly(r);
        a = new int[]{67, 93, 100, -16, 65, 97, 92};
        r = new int[]{100, 93, 67, -16, 65, 92, 97};
        assertThat(HowGreenIsMyValley.makeValley(a)).containsExactly(r);
        a = new int[]{66, 55, 100, 68, 46, -82, 12, 72, 12, 38};
        r = new int[]{100, 68, 55, 38, 12, -82, 12, 46, 66, 72};
        assertThat(HowGreenIsMyValley.makeValley(a)).containsExactly(r);
        a = new int[]{14, 14, 14, 14, 7, 14};
        r = new int[]{14, 14, 14, 7, 14, 14};
        assertThat(HowGreenIsMyValley.makeValley(a)).containsExactly(r);
        a = new int[]{14, 14, 14, 14, 14, 14};
        r = new int[]{14, 14, 14, 14, 14, 14};
        assertThat(HowGreenIsMyValley.makeValley(a)).containsExactly(r);
    }


}
