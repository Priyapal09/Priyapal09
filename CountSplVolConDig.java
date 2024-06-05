package string;
import java.util.*;
public class CountSplVolConDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		int vol=0,spl=0,dig=0,word=0;
		System.out.println("Enter a string");
		str=sc.nextLine();
		str=" "+str;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vol++;
			if(ch>='0'&&ch<='9')
				dig++;
			if(ch==' ')
				word++;
			if(!Character.isLetterOrDigit(ch)&&!Character.isWhitespace(ch))
				spl++;
		}
		System.out.println("The number vowels are"+vol);
		System.out.println("The number of digits are"+dig);
		System.out.println("The number of words are"+word);
		System.out.println("The number of special character are"+spl);

	}

}
