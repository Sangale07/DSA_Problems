package Day16;

public class Binary_Search {


    public static void main(String[] args) {
        String[] word =  {"apple", "banana", "cherry", "date", "fig", "grape"};
        String target = "date";
        int start = 0;
        int end = word.length - 1;
        System.out.println(binarySearch(target , word , start, end));

        while(start <= end){
         int mid = (start + end)/2;

         if(word[mid].equals(target)){
             System.out.println("index found:"+ mid );
             break;
         }
         else if(word[mid].compareTo(target) > 0 ){
           end = mid -1;

         }
         else{
             start = mid +1;
         }
        }
    }
    static int binarySearch(String target , String[] word  , int start , int end){
        if(start > end){
            return-1;
        }

        int mid = (start + end)/2;

        if(word[mid].equals(target)){
            return mid;

        }
        else if(word[mid].compareTo(target) > 0){
           return binarySearch(target , word , start  , mid-1);
        }
        else{
           return  binarySearch(target , word , mid+1 , end);
        }
    }
}
