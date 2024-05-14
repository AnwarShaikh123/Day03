
public class Sort {

	public static void main(String[] args) {
		int a[]= {2,5,7,9,2,1};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
				
			}
			
		}
		for(int num:a)
		{
			System.out.println(num);
		}


	}

}
