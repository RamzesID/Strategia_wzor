package NJPO;

import java.util.Random;

public class Sorting {
    private  SortingStrategy strategy;

    public void setStrategy(SortingStrategy s){
        strategy = s;
    }

    public void sortArray(int[] arr){
        Random rand = new Random();
        long time = 0;
        int k = 10;
        while (k != 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt();
            }
            long startTime = System.nanoTime();
            strategy.sort(arr);
            time = time + (System.nanoTime() - startTime);
            k--;
        }
        System.out.println("Czas sortowania " + strategy.getName()  +": " + time/10 + "[ms]");
    }
}
