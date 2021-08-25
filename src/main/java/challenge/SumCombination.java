package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SumCombination {

    private static final int SIZE_OF_OUT = 4;//size

    public static List<int[]> generate(int arrayLength, int sizeOfFinalArray, int[] array, int targetSum) {
        List<int[]> combinations = new ArrayList<>();
        recursiveOperation(combinations, new int[sizeOfFinalArray], 0, arrayLength - 1, 0, array, targetSum);
        return combinations;
    }

    private static void recursiveOperation(List<int[]> combinations, int generatedArray[], int start, int end, int index, int[] array, int targetSum) {
        if (index == generatedArray.length) {
            int[] combination = generatedArray.clone();
            if (Arrays.stream(combination).reduce(0, Integer::sum) == targetSum) {
                combinations.add(combination);
                System.out.println(Arrays.toString(combination));
            }
        } else {
            int max = Math.min(end, end + 1 - generatedArray.length + index);
            for (int i = start; i <= max; i++) {
                generatedArray[index] = array[i];
                recursiveOperation(combinations, generatedArray, i + 1, end, index + 1, array, targetSum);
            }
        }
    }
    
    public static List<int[]> fourNumberSum(int[] array, int targetSum) {
        if (Objects.isNull(array) || array.length < 4) {
            return List.of();
        }
        List<int[]> combinations = generate(array.length, SIZE_OF_OUT, array, targetSum);
        return combinations;
  }

}
