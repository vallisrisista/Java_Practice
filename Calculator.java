import java.util.Scanner;
class Calculator{
    int a,b,c;
    int add(int a,int b){
        return c=a+b;
    }
    int sub(int a,int b){
        return c=a-b;
    }
    int mul(int a,int b){
        return c=a*b;
    }
    int div(int a,int b){
        return c=a/b;
    }

public static void main(String args[]) {
    int p=0;
    Calculator cal=new Calculator();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 2 numbers");
    int m=sc.nextInt();
    int n=sc.nextInt();
    char op;
    System.out.println("enter any operator");
    op=sc.next().charAt(0);
    switch (op) {
        case '+':
             p=cal.add(m,n);
            break;
        case '-':
             p=cal.sub(m,n);
            break;  
        case '*':
            p=cal.mul(m,n);
           break;
       case '/':
            p=cal.div(m,n);
           break;   
        default:
            System.out.println("invalid op");
            break;
    }
    System.out.println(p);
}
}
