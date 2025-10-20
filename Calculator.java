import java.util.*;
class Operation{ 
int add,sub,mul,div;
int addition(int a,int b){
	add=a+b;
	return add;
}
int subtraction(int a,int b){
	sub=a-b;
	return sub;	
}
int multiplication(int a,int b){
	mul=a*b;
	return mul;
}
int division(int a,int b){
	if(b!=0){
		div=a/b;
	}
	else{
		return 0;
	}
	return div;
}
}
class Calculator{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int choice,c=0;
Operation obj=new Operation();
do{
System.out.println("Enter the number:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
System.out.println("Enter the choice:");
choice=sc.nextInt();
if(choice>=1 && choice<=4){
System.out.println("enter two number a & b:");
int a=sc.nextInt();
int b=sc.nextInt();
switch(choice){
case 1:
	c=obj.addition(a,b);
	System.out.println(c);
	break;
case 2:
	c=obj.subtraction(a,b);
	System.out.println(c);
	break;
case 3:
	c=obj.multiplication(a,b);
	System.out.println(c);
	break;
case 4:
	c=obj.division(a,b);
	System.out.println(c);
	break;
default:
	System.out.println("Invalid choice");
}
}else if(choice!=5){
	System.out.println("Invalid choice,please enter the right choice number");
}
}while(choice!=5);
}
}

	
	