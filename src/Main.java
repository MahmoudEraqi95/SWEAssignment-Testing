import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


    }
    public int[] flattenArray(int[][] arr){
        if (arr==null)
            return new int[]{-1};
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result.add(arr[i][j]);
            }
        }
        int [] result2 = new int[result.size()];
        for (int i = 0; i < result2.length; i++) {
            result2[i] = result.get(i);
        }
        return result2;
    }
}