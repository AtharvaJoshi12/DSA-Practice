

public class practice {

    public static void reverseString(StringBuilder s)
    {
        int start = 0;
        int end = s.length()-1;
        while (start<end)
        {
            char temp = s.charAt(start);
            s.setCharAt(start,s.charAt(end));
            s.setCharAt(end,temp);
            start++;
            end--;
        }
        System.out.println(s);
    }



    public static void main(String[] args) {

        StringBuilder s2 = new StringBuilder("Atharva");
        System.out.println(s2);
        System.out.println("After reverse");
        reverseString(s2);

    }
}

