public class Leetcode3201 {
  public int maximumLength(int[] nums) {
        int odd=0,even=0,oddGroup=0;
        boolean flag;
        if(nums[0]%2==0){
            flag=true;
            even++;
        }
        else{
            flag=false;
            odd++;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]%2==0) {
                even++;
                if(!flag) oddGroup++;
                flag=true;
            }
            else{
                odd++;
                if(flag) oddGroup++;
                flag=false;
            }
        
        }
         int evenGroup=Math.max(odd,even);
        return Math.max(evenGroup,oddGroup+1);
    }
}
