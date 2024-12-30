package String;

public class Vowel_Check {
    public static void main(String[] args) {
        System.out.println(String_Contains_Vowel("A"));
        System.out.println(String_Contains_Vowel("a"));
    }
    public static boolean String_Contains_Vowel(String str)
    {
        return str.toLowerCase().matches(" [aieou] ");
    }
    
}
