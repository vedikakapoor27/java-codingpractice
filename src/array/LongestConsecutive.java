package array;

    import java.util.*;

    public class LongestConsecutive {

        public static int longestConsecutive(int[] nums) {

            // Store all numbers in set
            HashSet<Integer> set = new HashSet<>();

            for (int num : nums) {
                set.add(num);
            }

            int longest = 0;

            // Check each number
            for (int num : set) {

                // only start if it's the beginning of sequence
                if (!set.contains(num - 1)) {

                    int current = num;
                    int count = 1;

                    // keep increasing sequence
                    while (set.contains(current + 1)) {
                        current++;
                        count++;
                    }

                    // update longest
                    if (count > longest) {
                        longest = count;
                    }
                }
            }

            return longest;
        }

        public static void main(String[] args) {
            int[] nums = {100,4,200,1,3,2};
            System.out.println(longestConsecutive(nums));
        }
    }

