package challenge.codewars;

import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.stream.IntStream;

@UtilityClass
public class HowGreenIsMyValley {

    /**
     * <a href=https://www.codewars.com/kata/56e3cd1d93c3d940e50006a4>codewars_challenge</a><br>
     * Input : an array of integers.
     * Output : this array, but sorted in such a way that there are two wings:
     * the left wing with numbers decreasing,
     * the right wing with numbers increasing.
     * the two wings have the same length. If the length of the array is odd the wings are around the bottom, if the length is even the bottom is considered to be part of the right wing.
     * each integer l of the left wing must be greater or equal to its counterpart r in the right wing, the difference l - r being as small as possible. In other words the right wing must be nearly as steep as the left wing.
     * @param arr input array
     * @return resulting array
     * */
    public static int[] makeValley(int[] arr) {
        sortDesc(arr);
        int len = arr.length;
        int lWingLen = len / 2;
        int rWingLen = (int) Math.ceil(len / 2.0);
        int[] lWing = new int[lWingLen];
        int[] rWing = new int[rWingLen];

        if (len % 2 != 0) {
            rWing[rWingLen - 1] = arr[len - 1];
        }
        int wingIndex = 0;
        for (int i = 0; i < len - len % 2; i += 2) {
            lWing[wingIndex] = arr[i];
            rWing[wingIndex] = arr[i + 1];
            wingIndex++;
        }
        Arrays.sort(rWing);
        return IntStream.concat(Arrays.stream(lWing), Arrays.stream(rWing)).toArray();
    }

    private static void sortDesc(int[] arr) {
        Arrays.sort(arr);
        int rightIndex = arr.length - 1;
        int temp;
        for (int leftIndex = 0; leftIndex < rightIndex; leftIndex++, rightIndex--) {
            temp = arr[rightIndex];
            arr[rightIndex] = arr[leftIndex];
            arr[leftIndex] = temp;
        }
    }


}
