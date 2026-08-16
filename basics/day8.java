public class day8 {
    public static void main(String[] args) {

        String str = "HelloJava";

        boolean onlyAlphabets = true;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!Character.isLetter(ch)) {
                onlyAlphabets = false;
                break;
            }
        }

        if (onlyAlphabets) {
            System.out.println("String contains only alphabets.");
        } else {
            System.out.println("String does not contain only alphabets.");
        }
    }
}