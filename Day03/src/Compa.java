
public class Compa {

	public static void main(String[] args) {
		int a[]= {3,3,4,4,5,5,5,2,4};
		
		for (int i=0;i<a.length;i++) {
			int x=a[i];
			int count=0;
			if(x==-1)continue;

			for(int j=0;j<a.length;j++)
			{
				if(x==a[j])
				{
					count++;
					a[j]=-1;
				}
				
			}
			System.out.println("The frequency of element :" +x+" is " +  count);
		}

	}

}


