 import java.util.*;

public class practice {
    private static final Map<String, String> NUMBER_MAP = new HashMap<>();

    static {
        NUMBER_MAP.put("zero", "0");
        NUMBER_MAP.put("one", "1");
        NUMBER_MAP.put("two", "2");
        NUMBER_MAP.put("three", "3");
        NUMBER_MAP.put("four", "4");
        NUMBER_MAP.put("five", "5");
        NUMBER_MAP.put("six", "6");
        NUMBER_MAP.put("seven", "7");
        NUMBER_MAP.put("eight", "8");
        NUMBER_MAP.put("nine", "9");
        NUMBER_MAP.put("double", "@");
        NUMBER_MAP.put("triple", "#");
    }
    public static String getPhoneNumber(String s) {
        StringBuilder phoneNumber = new StringBuilder();
        String[] words = s.split(" ");
        String nextWord = null;


        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String digit = NUMBER_MAP.get(word);

            if (digit != null && !digit.equals("@") && !digit.equals("#")) {
                phoneNumber.append(digit);
            } else if (word.equals("double")) {
                String nextDigit =  NUMBER_MAP.get(words[i+1]);
                phoneNumber.append(nextDigit);

            } else if (word.equals("triple")) {
                String nextDigit =  NUMBER_MAP.get(words[i+1]);
                phoneNumber.append(nextDigit);
                phoneNumber.append(nextDigit);

            } else {
                // Invalid word
                return null;
            }
        }

        // Check if the phone number is 10 digits long
        if (phoneNumber.length() != 10) {
            return null;
        }

        return phoneNumber.toString();
    }
    public static void main(String[] args) {
        String s1 = "two one nine six eight one six four six zero";
        String s2 = "five one zero two four eight zero double three two";
        String s3 = "five one zero six triple eight nine six four";

        System.out.println(getPhoneNumber(s1)); // 2196816460
        System.out.println(getPhoneNumber(s2)); // 5102480332
        System.out.println(getPhoneNumber(s3)); // 5106888964
    }
}




