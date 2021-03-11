package basicprogram;

public class Minelement {

	public static void main(String[] args) {
		int a[]= {4,8,2,65,32,11};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
				
			}
		}
		System.out.println(min);
		// TODO Auto-generated method stub

	}

}
