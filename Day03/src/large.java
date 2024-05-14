
public class large {

	public static void main(String[] args) {
		int a[]= {2,4,6,1,9,8};
		int max=a[0];
		System.out.print("Largest elemnt in the array is : ");
		for (int i=0;i<a.length;i++)
		{
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
		

	}

}
