package javapro;

public class Sample3 
{
	//properties
		
		public int i;
		
		public double d;
		public long l;
		public char c;
		public String s;
		
		//constructor with argument
		public Sample3(int i1,double d1,long l1,char c1,String s1)
		{
			i=i1;
			d=d1;
			l=l1;
			c=c1;
			s=s1;
		}
		//method
		public void display() 
		{
			System.out.println(i);
		
			System.out.println(d+"\n"+l);
		
			System.out.println(c);
			System.out.println(s);
		
		}

}
