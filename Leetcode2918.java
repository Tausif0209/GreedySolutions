class Solution {
  public long minSum(int[] nums1, int[] nums2) {
      long sum1 = 0;
      long sum2 = 0;
      int c1=0;
      int c2=0;
      for(int el:nums1){
          if(el!=0) sum1+=el;
          else c1++;
      } 
      for(int el:nums2){
         if(el!=0) sum2+=el;
         else c2++;
      }
      if(sum1+c1==sum2+c2) return sum1+c1;
      if(sum1+c1>sum2+c2)  return (c2!=0)?sum1+c1:-1;
      return (c1!=0)?sum2+c2:-1;
  }
}