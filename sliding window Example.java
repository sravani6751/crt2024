public class SlidingWindowExample{
	public static void main(String[]args){
		int[] a={10,20,30,40,50};
		for(int l=0;l<a.length;l++){
			int i=0;
			int j=l;
			while(j<a.length){
				for(int k=i;k<=j;k++)
				{
					System.out.print(a[k]+" ");
				}
				System.out.println();
				i++;
				j++;
			}
		}
	}
}
