// Count Ways To Reach The N-th Stairs
// Link - https://www.codingninjas.com/codestudio/problems/count-ways-to-reach-nth-stairs_798650?utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_10


public class practice {
        public static int climbStair(int nStairs)
        {
            // base case
            if(nStairs<0)
                return 0;
            if(nStairs==0)
                return 1;

            return climbStair(nStairs-1)+climbStair(nStairs-2);
        }

        public static void main(String[] args) {
            System.out.println(climbStair(5));
        }
    }

