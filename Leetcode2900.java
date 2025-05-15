import java.util.ArrayList;

class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> list=new ArrayList<>();
        boolean flag=(groups[0]==1);
        list.add(words[0]);
        for(int i=1;i<groups.length;i++){
           if((flag && groups[i]==1 ) || (!flag && groups[i]==0)) continue;
           list.add(words[i]);
           flag=!flag;
        }
        return list;
    }
}