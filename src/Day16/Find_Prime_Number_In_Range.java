package Day16;

import java.util.ArrayList;

public class Find_Prime_Number_In_Range {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int start = 0;
        int end = 1000;
        for(int i = start  ; i < end ; i++){
            if(isPrime(i)){
                arr.add(i);
            }
        }
        System.out.println(arr);
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
}
