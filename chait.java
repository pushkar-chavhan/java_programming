class SY2022bit034
{
	public static void main(String args[])
	{
		int all_number;
		all_number=new_array();
		System.out.println("No. of prime numbers: " + all_number);
		System.out.println("No. of non-prime numbers: " + (100-all_number));
	}
	public static int new_array()
	{       int size = 100;
		long[] arr=new long[size];
		int i,a,b,c,d,e,f,g,prime_count=0;
		boolean prim;
		for(i=0;i<size;i++)
		{
			
			a=(int)System.nanoTime()%10;
			b=(int)System.nanoTime()%10;
			c=(int)System.nanoTime()%10;
			d=(int)System.nanoTime()%10;
			e=(int)System.nanoTime()%10;
			f=(int)System.nanoTime()%10;
			g=(int)System.nanoTime()%10;
			arr[i]=((a*1000000)+(b*100000)+(c*10000)+(d*1000)+(e*100)+(f*10)+g);
		}
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
			prim=check_prime(arr[i]);
			if(prim==true)
				prime_count+=1;
		}
		return prime_count;
	}
	public static boolean check_prime(long num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
			return true;
		else
			return false;
	}
}
