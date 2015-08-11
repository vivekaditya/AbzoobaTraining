
public class ExtraProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int depth=100,cnt=0;
		for(int j=0;j<=1000;j++)
		{
			int num = j;
			for(int i=0;i<depth;i++)
			{ 
				num = sq_sum_digits(num);
				if(num==1)
				{
					System.out.println(j);
					cnt++;
					break;
				}
			}
		}
		System.out.println("Total "+cnt);
	}
	public static int sq_sum_digits(int s)
	{
		int sum=0;
		while(s!=0)
		{
			sum  = sum + (s%10)*(s%10);
			s = s/10;
		}
		return sum;
	}
}
