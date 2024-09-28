public class ArrayReverser {

    public int[] reverseArray(int[] targetArray){
        if (targetArray==null)
            return new int[]{-1};
        int[] result = new int[targetArray.length];
        int index = 0;
        for (int i = targetArray.length-1; i >=0; i--, index++) {
            result[index] = targetArray[i];
        }
        return result;
    }
}
