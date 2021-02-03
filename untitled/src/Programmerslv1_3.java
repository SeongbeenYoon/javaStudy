class Solution {
    public String solution(String[] seoul) {
        int rst=0;
        for(int i=0; i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                rst=i;
                break;
            }
        }
        String answer = "김서방은 "+rst+"에 있다";
        return answer;
    }
}
public class Programmerslv1_3 {
    public static void main(String args[]){
        Solution s=new Solution();
        String[] testarr={"Jane","Kim"};
        System.out.print(s.solution(testarr));
    }
}
