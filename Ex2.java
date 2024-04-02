import java.util.Scanner;

public class Ex2
{

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter the number : ");

int num = sc.nextInt();

if(num > 0)

{

int a = 0, b = 1, c;

System.out.print("Fibonacci Series : "+a+", "+b+", ");

while(b < num)

{

c=a+b;

a=b;

b=c;

if(b <= num)

System.out.print(b+", ");

}

}

else

System.out.print("Invalid Input");

}

}