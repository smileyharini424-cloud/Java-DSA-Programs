public class DuplicateElement
{
	public static void main(String[] args) {
 	    int[] arr = { 23,32,47,56,78,47,32};
 	    System.out.println("Duplicte elements: ");
 	    for(int i=0;i<arr.length;i++)
 	    {
 	        for(int j=i+1;j<arr.length;j++)
 	        {
 	            if(arr[i] == arr[j])
 	            {
 	                System.out.println(arr[i]);
 	                break;
 	            }
 	        }
 	    }
	}
}
