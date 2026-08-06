public class RotateArray
{
	public static void main(String[] args) {
		int[] arr ={10,20,30,40,50};
		
		int [] left = arr.clone();
		int first = left[0];
		
		for(int i=0;i<left.length-1;i++)
		{
		    left[i]=left[i+1];
		}
		left[left.length-1]=first;
		
		System.out.print("Left Rotated Array: ");
		for(int num : left)
		{
		    System.out.print(num + " ");
		}
		System.out.println();
		
		//right Rotate
		int[] right = arr.clone();
		int last = right[right.length-1];
		
		for(int i=right.length-1;i>0;i--)
		{
		    right[i]=right[i-1];
		}
		right[0]=last;
		
		System.out.print("Right Rotate array: ");
		for(int num : right)
		{
		    System.out.print(num + " ");
		}
	}
}
