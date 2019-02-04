package javapro;

public class Sample2 
{
	//properties
		public byte by;
		public int i;
		public float f;//decimal
		public double d;
		public long l;
		public char c;
		public String s;
		public boolean bo;
		//constructor
		public Sample2() 
		{
			by=1;
			i=100;
			f=12;
			d=38.33;
			l=900000;
			c='j';
			s="Babu";
			bo=true;			
		}
		//method
		public void display() 
		{
			System.out.println(by);
			System.out.println(i);
			System.out.println(f);
			System.out.println(d);
			System.out.println(l);
			System.out.println(c);
			System.out.println(s);
			System.out.println(bo);
		}
}

