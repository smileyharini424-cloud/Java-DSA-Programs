public class RemoveDuplicates
{
	public static void main(String[] args) {
		int[] arr ={13,46,29,13, 23, 29};
		System.out.print("Array Without duplicates:");
		
		for(int i=0;i<arr.length;i++)
		{
		    boolean duplicate = false;
		    for(int j=0;j<i;j++)
		    {
		        if(arr[i] == arr[j])
		        {
		            duplicate = true;
		            break;
		        }
		    }
		    if(!duplicate)
		    System.out.print(arr[i] + " ");
		    
		}
	}
}
