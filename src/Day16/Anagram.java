package Day16;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "dcab";

        char[] arr1 = new char[str1.length()];
        char[] arr2 = new char[str2.length()];

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("String is Anagram");
        }
        else{
            System.out.println("String is not Anagram");
        }
    }


}
