
public class Sec_large {

	public static void main(String[] args) {
		int a[]= {2,4,6,1,9,8};
		int max=a[0];
		int sec_max=0;
		System.out.print(" the Second largest element in the array is : ");
		for (int i=0;i<a.length;i++)
		{
			if(max<a[i]) {
				sec_max=max;
				max=a[i];
			}
			else if(sec_max<a[i]) {
				sec_max=a[i];
			}
		}
		System.out.print(sec_max);


	}

}
