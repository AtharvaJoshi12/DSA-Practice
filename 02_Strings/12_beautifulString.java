// Make Beautiful String
// Link - https://www.codingninjas.com/studio/problems/beautiful-string_1115625?leftPanelTab=0
import java.util.*;

public class practice {

    public static String generateString(int n, boolean zero){
        String ans = "";
        if (n==0) return ans;
        if(zero){
            ans+='0';
            n--;
        }
        else {
            ans += '1';
            n--;
        }

        while (n!=0){
            char temp = (ans.charAt(ans.length()-1)=='0')?'1':'0';
            ans+=temp;
            n--;
        }
        return ans;
    }

    public static int change(String str, String s, int n){
        int ans = 0;
        for(int i = 0;i<n;i++){
            if(str.charAt(i)!=s.charAt(i))
                ans++;
        }
        return ans;
    }
    public static int makeBeautiful(String str) {
        String s1 = generateString(str.length(),true);
        int s1change = change(str,s1,str.length());

        String s2 = generateString(str.length(),false);
        int s2change = change(str,s2,str.length());

        return Math.min(s1change,s2change);
    }
    public static void main(String[] args) {
        System.out.println(makeBeautiful("1010"));
    }
}




