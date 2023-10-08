// Check if strings are rotations of each other or not
// Link - https://practice.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1

class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        if(s1.length()!=s2.length())
            return false;
            
        String s3 = s1 + s1;
        
        if(s3.indexOf(s2)!=-1)
            return true;
        else 
            return false;
    }
    
}