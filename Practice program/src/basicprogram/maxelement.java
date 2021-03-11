package basicprogram;

public class maxelement {

	public static void main(String[] args) {
		int a[]= {4,8,2,65,32,11};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				
			}
		}
		System.out.println(max);
		// TODO Auto-generated method stub

	}

}
