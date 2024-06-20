package sortingAlgo;

public class UniqueTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -1, 0, 1, 2, -1, -4 };
//int[] nums = {-1,0,1,0};
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					
					if (sum == nums[i] + nums[j] + nums[k]) {
						System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
					}

				}
			}
		}
		
	}
}
