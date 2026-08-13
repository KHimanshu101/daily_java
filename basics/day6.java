public class day6 {
    public static void main(String[] args) {

        int[] numbers = {10, 15, 22, 7, 8, 13, 20};

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Number of even numbers: " + count);
    }
}