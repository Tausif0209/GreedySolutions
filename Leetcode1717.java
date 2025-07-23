public class Leetcode1717 {
    public int maximumGain(String s, int x, int y) {
        if(s.length()==0) return 0;
        int maxPoint=0;
        String remove;
        if(x>y) remove="ab";
        else{
            int temp=x;
            x=y;
            y=temp;
            remove="ba";
        }
        int len;
        char ch;
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length();i++){
                  len=sb.length();
                ch=s.charAt(i);
                if(!sb.isEmpty() && sb.charAt(len-1)==remove.charAt(0) && ch==remove.charAt(1)) {
                    maxPoint+=x;
                    sb.deleteCharAt(len-1);
                }
                else sb.append(ch);
            }
            s=sb.toString();
            sb=new StringBuilder();
              for(int i=0;i<s.length();i++){
                len=sb.length();
                ch=s.charAt(i);
                if(!sb.isEmpty() && sb.charAt(len-1)==remove.charAt(1) && ch==remove.charAt(0)) {
                    maxPoint+=y;
                    sb.deleteCharAt(len-1);
                }
                else sb.append(ch);
            }
            return maxPoint;
    }// can be solved using stack
}
