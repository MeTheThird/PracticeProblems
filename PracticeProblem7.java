package practiceProblems;

public class PracticeProblem7 {
//Given an integer array, return the sum
	// if there is a thirteen in the array, don't add it or the one after
	
	static int luckyNumber(int[] Array)
	{
		int x = 0;
		int previous;
		int current;
		for (int i = 0; i < Array.length; i++)
		{
			if (i == 0 && Array[i] != 13)
			{
				x += Array[i];
			}
			if (i >= 1){
				previous = Array[i - 1];
				current = Array[i];
				if (Array[i] == 13)
				{
					Array[i] = 0;
					Array[i + 1] = 0;
				}
				x += Array[i];
			}
			
			
		}
		
		return x;
	}
	public static void main(String[] args) {
		int[] banana;
		banana = new int[5];
		banana[0] = 13;
		banana[1] = 13;
		banana[2] = 2;
		banana[3] = 3;
		banana[4] = 4;
		
		System.out.println(luckyNumber(banana));

	}

}
