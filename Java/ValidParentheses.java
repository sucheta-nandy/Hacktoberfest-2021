import java.util.*;
public class ValidParentheses {
	public static boolean isValid(String s) {
        int flag=1;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
                continue;
            }
            if(stack.isEmpty()){
                flag=0;
                break;
            }
            if(ch==')'){
                if(stack.peek()=='('){
                    stack.pop();
                }
                else{
                    flag=0;
                    break;
                }
            }
            if(ch=='}'){
                if(stack.peek()=='{'){
                    stack.pop();
                }
                else{
                    flag=0;
                    break;
                }
            }
            if(ch==']'){
                if(stack.peek()=='['){
                    stack.pop();
                }
                else{
                    flag=0;
                    break;
                }
            }
            
        }
        if(!stack.isEmpty())
                flag=0;
        if(flag==0)
            return false;
        else
            return true;
    }
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(isValid(str));
	}
}
