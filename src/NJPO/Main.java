package NJPO;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[100];
        int[] arr1 = new int[2000];
        int[] arr2 = new int[15000];

        Sorting sortArrays = new Sorting();

        sortArrays.setStrategy(new BubbleSortingStrategy());
        sortArrays.sortArray(arr);
        sortArrays.sortArray(arr1);
        sortArrays.sortArray(arr2);
        System.out.println("==================================");
        sortArrays.setStrategy(new SelectSortingStrategy());
        sortArrays.sortArray(arr);
        sortArrays.sortArray(arr1);
        sortArrays.sortArray(arr2);
        System.out.println("==================================");
        sortArrays.setStrategy(new QuickSortingStrategy());
        sortArrays.sortArray(arr);
        sortArrays.sortArray(arr1);
        sortArrays.sortArray(arr2);
        System.out.println("==================================");
        sortArrays.setStrategy(new ArraysSortingStrategy());
        sortArrays.sortArray(arr);
        sortArrays.sortArray(arr1);
        sortArrays.sortArray(arr2);




    }
}
