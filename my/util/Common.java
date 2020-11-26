package my.util;
import java.util.*;
public class Common{
	//int型配列をShuffle
	public static void arrShuffle(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int index = new Random().nextInt(arr.length-i);
			int temp=arr[index];
			arr[index]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
}
