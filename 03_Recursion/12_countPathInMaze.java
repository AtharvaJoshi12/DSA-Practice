
public class practice {
 public static int countPathsInMaze(int i,int j,int n,int m)
        {
            if(i == n || j == m)
                return 0;
            if (i == n-1 && j == m-1)
                return 1;
            // move downwards
          int downPaths = countPathsInMaze(i+1,j,n,m);

            // move right
          int rightPaths = countPathsInMaze(i,j+1,n,m);

            return downPaths + rightPaths;
        }

        public static void main(String[] args) {
            System.out.println( countPathsInMaze(0,0,3,3));
        }
    }

