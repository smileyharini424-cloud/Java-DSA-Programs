public class SearchElement
{
	public static void main(String[] args) {
	    int[] arr = {10,25,5,40,15};
	    int search = 40;
	    boolean found = false;
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]==search)
	        {
	            found=true;
	            break;
	        }
	    }
	    if(found)
	    {
	        System.out.println("element found");
	    }else {
	        System.out.println("Element not found");
	    }
	}
}
