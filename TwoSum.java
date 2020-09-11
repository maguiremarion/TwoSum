import java.util.Scanner;

public class TwoSum {
	
	public static int[] given = new int[100];
	public static int target;

    private static void selection_sort(int arr[]) {
    	
        int n = arr.length; 
 
        for (int i = 0; i < n-1; i++) { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        }
    }
	
	private static int[] twoSum(int[] arr, int target) {
		
		int [] copy_arr = new int[100];
		selection_sort(arr);
		System.arraycopy(arr, 0, copy_arr, 0, arr.length);
		int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            if(arr[left] + arr[right] == target) {
                return new int[] {left, right};
            }
            else if (arr[left] + arr[right] < target) {
                left++;
            } 
            else {
                right--;
            }
        }
        return new int[] {-1};
    }
	
	private static void enterValues() {
		
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter how many values will be in the array: ");
    	int valueCount = input.nextInt();
    	System.out.print("Enter those " + valueCount + " values: ");
    	
		for (int i=0; i<valueCount;i++) {   
            	given[i]=input.nextInt();
        }
		
		System.out.print("Enter the target value: ");
		target = input.nextInt();
		
		input.close();
	}
	
	private static int checkZeros(int[] arr){
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] == 0)
				count+=1;
		}
		return count;
	}

	public static void main(String[] args) {
		
		enterValues();	
		int[] result = twoSum(given, target);
		
		if(result[0] == -1) {
			System.out.println("No Valid Answer");
			System.exit(0);
		}
		else {
			int test = checkZeros(given);
			System.out.println("The indicies of the results in the array are at index " + (result[0]-test) + " and " + (result[1]-test));
		}
	}
}