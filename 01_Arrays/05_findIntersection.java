// 2 Pointer approach is used.

public class practice {
    public static void printArray(int[] array)
    {
        for(int i :array) System.out.print(i + " ");
    }

    public static void findIntersection(int[] array1,int[] array2) {
      int i = 0,j=0;
      while (i< array1.length && j< array2.length)
      {
          if (array1[i]==array2[j]) {
              System.out.print(array1[i] + " ");
              i++;
              j++;
          }
          else if (array1[i]<array2[j])
              i++;
          else
              j++;
      }

    }
    public static void main(String[] args) {
        int []array1 = {1,2,2,3};
        int []array2 = {2,3,4};
        findIntersection(array1,array2);

    }
}

