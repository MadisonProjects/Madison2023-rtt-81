package sep26practice;

import java.util.Arrays;

public class CopyingArraysUsingForLoops {
	public static void main(String[] args)
	{

		int[] sourceArrays = {2,3,4,5,10};
		int[] targetArrays = new int[sourceArrays.length];
		for(int i=0; i < sourceArrays.length; i++)
{
			targetArrays[i] = sourceArrays[i];
			
}
		System.out.println(Arrays.toString(sourceArrays));
		System.out.println(Arrays.toString(targetArrays));
		if (targetArrays == sourceArrays) {
			System.out.println("same instance");
		} else {
			System.out.println("Different instance");
			
		}
		}
}
