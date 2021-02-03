import java.util.*;
//제발 클래스 이름 맨 앞글자 대문자 하는거까먹지좀 말자 성빈아....
class Solution1 {
    String solution(String[] participant, String[] completion) {
        int lc=completion.length;
        int flag=0;
        int rst=-1;
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i<lc;i++){
            if(completion[i].equals(participant[flag])){
                flag+=1;
            }
            else{
                rst=flag;
            }
        }
        if(rst==-1){
            rst=flag;
        }
        String answer = "";
        answer=participant[rst];
        return answer;
    }
}
public class Programmerslv1_2 {

    public static void main(String args[]){
        Solution1 s=new Solution1();
        String[] testp={"mislav", "stanko", "mislav", "ana"};
        String[] testc={"stanko", "ana", "mislav"};
        //아마 sort 메소드가 String 에 대하여 진행될 경우 맨 앞글자의 아스키 코드 값을 바탕으로 되는 듯 하다. 그러면 먼저 sorting을 하고 진행을 하면 좀 더 쉽겠구나!
        String answer=s.solution(testp,testc);
        System.out.print(answer);

    }
}
