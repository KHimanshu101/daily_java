public class day9 {
    public static void main(String[] args) {

        String str = "programming";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            if (result.indexOf(current) == -1) {
                result = result + current;
            }
        }

        System.out.println("Original: " + str);
        System.out.println("After removing duplicates: " + result);
    }
}
    

