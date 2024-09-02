package Day16;

import java.util.ArrayList;
import java.util.Arrays;

public class Check_AnagramAndPalindromeof_Primenumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int start = 0;
        int end = 1000;
        for(int i = start  ; i < end ; i++){
            if(isPrime(i)){
                if(isPalindrome(i)){
                    arr.add(i);
                }

            }
        }
        System.out.println(arr);
      boolean[] anagramList = new boolean[arr.size()];
        for(int i = 0 ; i <arr.size() - 1 ;i++){
            for(int j = i + 1 ; j < arr.size() ; j++){
                if(isAnagram(arr.get(i) , arr.get(j))){
                    anagramList[i] = true;
                    anagramList[j] = true;

                }

            }
        }
        System.out.print("Prime anagrams are: ");
        for(int i = 0 ; i <arr.size() ; i++){
            if(anagramList[i]){
                System.out.print(arr.get(i) + " ");
            }
        }


    }
    static boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }
        else{
            for(int i = 2 ; i <= n / 2; i++){
                if(n % i == 0){
                    return false;
                }

            }
        }
        return true;
    }
    static boolean isPalindrome(int n){
        String str = Integer.toString(n);

        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end) ){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    static boolean isAnagram(int a , int b){
       char[] arr1 = String.valueOf(a).toCharArray();
       char[] arr2 = String.valueOf(b).toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
         if(Arrays.equals(arr1 , arr2)){
             return true;
         }

         return false;
    }
}
