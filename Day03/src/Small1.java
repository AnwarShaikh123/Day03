
public class Small1 {

	public static void main(String[] args) {
		int a[]= {2,4,6,1,9,8};
		int min=a[0];
		System.out.print("Largest elemnt in the array is : ");
		for (int i=0;i<a.length-1;i++)
		{
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.print(min);

	}

}
