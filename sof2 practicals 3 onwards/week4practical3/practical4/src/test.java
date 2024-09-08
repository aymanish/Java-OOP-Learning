import java.util.Arrays;

public class test {

    public static int removeDuplicates(int[] nums) {
    int index = 0;
    for (int i = 1; i < nums.length; i++) {
        //System.out.print("Current number = "+ nums[i]+"\n");
        //if nums[i] not in previous index add it and increment index
        System.out.println(nums[index]+"\n");
        if (nums[i] != nums[index]) {
            //System.out.print("Is new number = "+ nums[i]+"\n");
            index ++;
            //System.out.print("Unique values = "+ index +"\n");
            nums[index] = nums[i];
            System.out.print("Unique value added "+ nums[index]+"\n");
        }
    }

        return index+1;
    }
    



        public static void main(String[] args) {
        int[] nums = {1,1,2};
        int answer = removeDuplicates(nums);
        System.out.println("\n");
        System.out.println(answer);

        
    }
}
