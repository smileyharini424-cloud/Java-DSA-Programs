public class ReverseArray
{
	public static void main(String[] args) {
	    int[] arr = {3,5,8,9,3};
	    
	    System.out.println("Reversed array:");
	    for(int i=arr.length-1;i>=0;i--)
	    {
	        System.out.print(arr[i]+" ");
	    }
	}
}
