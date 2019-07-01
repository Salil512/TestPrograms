import java.util.Scanner;

class StringReverse2{
public static void main(String[] args){
System.out.println("Enter the String");
Scanner read = new Scanner(System.in);
String str = read.nextLine();
StringBuilder reverse = new StringBuilder();
for(int i= str.length()-1;i>=0;i--)
	{
		reverse.append(str.charAt(i));
	}
		System.out.println(reverse.toString());

	}
}