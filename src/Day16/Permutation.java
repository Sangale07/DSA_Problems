package Day16;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static List<String> iterativeM(String str){
        List<String> arr = new ArrayList<String>();
        arr.add(String.valueOf(str.charAt(0)));

        for(int i = 1 ; i < str.length() ; i++){
            List<String> newArr = new ArrayList<>();
            char curr =str.charAt(i);
            for(int j = 0 ; j < arr.size() ; j++){
                String per = arr.get(j);
                for(int k = 0 ; k <= arr.size() ; k++){
                    String newper = per.substring(0 , k)+ curr + per.substring(k);
                    newArr.add(newper);
                }
            }
            arr = newArr;
        }

    return arr;
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(iterativeM(str));

    }
}
