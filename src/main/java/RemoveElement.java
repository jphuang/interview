
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int j = nums.length -1 ;
        int left  = 0;
        for (int i = 0 ; i <= j; i++) {
            if (nums[i] != val ) {
                nums[left] = nums[i];
                left ++;
            }
        }
        return left  ;
    }



    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int i = removeElement(nums, 3);
        System.out.println(i);

        int[] ints = {2};
        System.out.println(removeElement(ints, 0));

        int[] ints2 = new int[]{1} ;
        System.out.println(removeElement(ints2, 1));
    }
}