public class warmups {


    //  public boolean arrayFront9(int[] nums) {


    public boolean array123(int[] nums) {


        for (int i = 0; i < nums.length; i++) {

            if ((nums[i] == 1) && (nums[i + 1] == 2) && (nums[i + 2] == 1)) {

                return true;
            }


            return false;
        }

    }

}
