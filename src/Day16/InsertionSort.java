package Day16;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
//        int[] arr = {10,50,20,30,40};
//
//        for(int i = 1 ; i < arr.length ; i++){
//            int key = arr[i];
//            int j = i -1;
//
//            while(j >= 0 && arr[j] > key){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1]= key;
//        }
//        System.out.println(Arrays.toString(arr));

        String[] arr = {"pineapple" , "banana" , "apple" , "peach" , "grapes"};

        for(int i = 1 ; i < arr.length ; i++){
            String key = arr[i];
            int j = i -1;
            while( j >= 0 && arr[j].compareTo(key) > 0){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));

    }
}
