// Print All Possible combinations of Given String
// Time complexity = O(n * n!)

public class practice {

    public static void printString(String s, String per, int index){
        if(s.length() == 0){
            System.out.println(per);
            return;
        }
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            String newStr = s.substring(0,i) + s.substring(i+1,s.length());
            printString(newStr,per + ch,index+1);
        }

    }
    public static void main(String[] args) {

       String s = "ABC";
       printString(s,"",0);
    }
}




