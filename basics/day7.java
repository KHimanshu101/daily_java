// public class day7 {
//     public static void main(String[] args) {

//         String str = "Hello Java World";

//         String result = str.replaceAll("\\s", "");

//         System.out.println("Original: " + str);
//         System.out.println("Without spaces: " + result);
//     }
// }

public class day7 {
    public static void main(String[] args) {

        String str = "hello";

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == current) {
                    count++;
                }
            }

            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (str.charAt(k) == current) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                System.out.println(current + " = " + count);
            }
        }
    }
}