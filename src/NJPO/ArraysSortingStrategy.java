package NJPO;

import java.util.Arrays;

public class ArraysSortingStrategy implements SortingStrategy {

    @Override
    public String getName() {
        return "ArraysSort";
    }

    @Override
    public void sort(int[] tab) {
            Arrays.sort(tab);
    }
}
