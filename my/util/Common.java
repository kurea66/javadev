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
	//配列のクローンを返却するメソッド
	public static int[] arrClone(int[] arr){
		int[] arrClone=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			arrClone[i]=arr[i];
		}
		return arrClone;
	}
	//配列を昇順に並び替えるメソッド
	public static void arrSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=arr.length-1;j>i;j--){
				if(arr[j-1] < arr[j]){
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	//第二引数でtrueを渡されると降順ソートするメソッド
	public static void arrSort(int[] arr,boolean isDesc){
		if(isDesc){
			for(int i=0;i<arr.length-1;i++){
				for(int j=arr.length-1;j>i;j--){
					if(arr[j-1] > arr[j]){
						int temp=arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}else{
			arrSort(arr);
		}
	}
	//要素数と指定範囲を受け取り、指定範囲の乱数で埋め尽くした配列を返すメソッド
	public static int[] arrRandomRange(int min,int max,int count){
		int[] arrRandomRange = new int[count];
		for(int i=0;i<arrRandomRange.length;i++){
			int minAbs=Math.abs(min);
			int maxAbs=Math.abs(max);
			arrRandomRange[i]=new Random().nextInt(minAbs + maxAbs + 1) + min;
			}
	return arrRandomRange;
	}
}

