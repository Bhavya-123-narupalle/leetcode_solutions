import java.util.Scanner;
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result=new StringBuilder();
        int level=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(level>0){
                    result.append(ch);
                }
                level++;
            }
            else if(ch==')'){
                level--;
                if(level>0){
                    result.append(ch);
                }
            }
        }
        return result.toString();
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution sol=new Solution();
        String ans=sol.removeOuterParentheses(s);
        System.out.println(ans);

    }
}