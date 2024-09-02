package Day16;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        String[] arr = {"pineapple" , "banana" , "apple" , "peach" , "grapes"};
        mergesort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static  void merge(String[] array , String[] left , String[] right){
        int i = 0 , j = 0, k = 0;

        while(i < left.length  && j < right.length){
        if(left[i].compareTo(right[j]) <= 0){
            array[k++] = left[i++];
        }
        else{
            array[k++] = right[j++];
        }


        }

        while(i < left.length){
            array[k++] = left[i++];

        }
        while(j < right.length){
            array[k++] = right[j++];

        }
    }
    static void mergesort(String[] array){
        if(array.length < 2){
            return;
        }

        int mid = array.length / 2;
        String[] left = new String[mid];
        String[] right =  new String[array.length - mid];

        for(int i = 0 ; i < mid ; i++){
            left[i] = array[i];
        }

        for(int i = mid ; i < array.length ; i++){
            right[i - mid] = array[i];

        }



        mergesort(left);
        mergesort(right);
        merge(array , left , right);
    }
}
