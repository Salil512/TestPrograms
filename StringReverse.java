import java.util.Scanner;

class StringReverse{
public static void main(String[] args){
Scanner str = new Scanner(System.in);
String reverse ="";
System.out.println("Enter the string");
 String str1 = str.nextLine();
for(int i = str1.length()-1;i>=0;i--)
	{
   reverse = reverse + str1.charAt(i);
	}
System.out.println(reverse);

	}
}
