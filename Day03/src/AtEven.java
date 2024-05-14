
public class AtEven {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,7,8};
		System.out.print("Elements of an array present on an even position are: ");
		for (int i=1; i<a.length; i++)
		{
			if(i%2==0) {
				System.out.print(a[i] + "  ");
			}
		}

	}

}


	


