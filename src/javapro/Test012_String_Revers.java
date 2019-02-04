package patterns;
public class Test012_String_Revers 
{
	public static void main(String[] args) 
	{
		String str="Jakkula";
		System.out.println(str);
		char[] ch=str.toCharArray();
		for(int j=ch.length-1;j>=0;j--)
		{
			System.out.print(ch[j]);
		}
	}
}