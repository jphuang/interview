import java.util.*;

public class Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sumList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

        }
        return sumList ;
    }

    public static List<List<Integer>>  towSum(int[] nums,int value ,int start ,int end){
        List<List<Integer>> sumList = new ArrayList<>();
        while (start < end) {
            if (nums[start] == nums[start +1]) {
                start ++ ;
                continue;
            }
            if (nums[end] == nums[end -1]){
                end -- ;
                continue;
            }
            int s = nums[start] + nums[end] + value;
            if (s == 0) {

            }
        }
        return  sumList;
    }
}
