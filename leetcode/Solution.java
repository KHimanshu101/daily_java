class Solution {

    // Method to find the indices of two numbers whose sum equals the target
    public int[] twoSum(int[] nums, int target) {

        // Outer loop
        for (int i = 0; i < nums.length; i++) {

            // Inner loop
            for (int j = i + 1; j < nums.length; j++) {

                // Check if the sum equals the target
                if (nums[i] + nums[j] == target) {

                    // Return the indices
                    return new int[]{i, j};
                }
            }
        }

        // Return an empty array if no solution is found
        return new int[]{};
    }

    // Main method
    public static void main(String[] args) {

        // Create an object of Solution
        Solution obj = new Solution();

        // Input array
        int[] nums = {2, 7, 11, 15};

        // Target value
        int target = 9;

        // Call the twoSum method
        int[] result = obj.twoSum(nums, target);

        // Print the result
        if (result.length == 2) {
            System.out.println("Indices are: " + result[0] + " and " + result[1]);
            System.out.println("Values are: " + nums[result[0]] + " and " + nums[result[1]]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
