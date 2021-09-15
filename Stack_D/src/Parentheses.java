import java.util.Scanner;

public class Parentheses {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la expresion para evaluar");

        String exp = scan.nextLine();

        Stack<Character> stack = new StackPar<Character>();

        for(char c: exp.toCharArray()){
            if(c =='(' || c =='[' || c == '{')
                stack.push(c);
            else if(c == ')' && stack.peek()=='(')
                stack.pop();
            else if(c == ']' && stack.peek()=='[')
                stack.pop();
            else if(c == '}' && stack.peek()=='{')
                stack.pop();
        }

        System.out.println(stack.isEmpty());
    }
}
