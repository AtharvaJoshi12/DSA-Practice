// Given two arrays A and B of equal size N, the task is to find if given arrays are
//  equal or not. Two arrays are said to be equal if both of them contain same set of 
//  elements, arrangements (or permutation) of elements may be different though.

// Note : If there are repetitions, then counts of repeated elements must also be same 
// for two array to be equal.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class practice {
    // Time complexity O(n) space complexity O(Unique(A)+Unique(B)) 
    public static boolean check(long A[],long B[],int N)
    {
        HashMap<Long,Integer> map1 = new HashMap<>();
        HashMap<Long,Integer> map2 = new HashMap<>();

        for (int i = 0; i < A.length; i++){
            if (map1.containsKey(A[i]))
                map1.put(A[i],map1.get(A[i])+1 );
            else
                map1.put(A[i],1);
        }

        for (int i = 0; i < B.length; i++){
            if (map2.containsKey(B[i]))
                map2.put(B[i],map2.get(B[i])+1 );
            else
                map2.put(B[i],1);
        }

        for (Long key:map1.keySet()){
            if(!map2.containsKey(key))
                return false;
            else{
                if(!(map2.get(key) == map1.get(key)))
                    return false;
            }
        }

        return true;

    }
     public static void main(String[] args) {

        long arr1[] = {8 ,9 ,7 ,5, 3, 1};
        long arr2[] = {5, 4 ,2 ,5 ,1 ,7};
         System.out.println( check(arr1,arr2,6));
     }
}

// 2nd solution here time complexity and space complexity both are O(n) so this is better than above solution
//   public static boolean check(long A[],long B[],int N)
//     {
//         HashMap<Long,Integer> map1 = new HashMap<>();
        
//          for (int i = 0; i < A.length; i++){
//              if (map1.containsKey(A[i]))
//                  map1.put(A[i],map1.get(A[i])+1 );
//              else
//                  map1.put(A[i],1);
//          }
        
//         for (int i = 0; i < B.length; i++){
//              if (map1.containsKey(B[i]))
//                  map1.put(B[i],map1.get(B[i])-1 );
//              else
//                  return false;
//          }
         
//          for (Long key:map1.keySet()){
//              if(map1.get(key) != 0)
//                 return false;
               
//          }
         
//          return true;
        
//     }