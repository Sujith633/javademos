package sample;

public class ArrayChallange {
	public static void main(String[] args) {
		int[] arr = {3,5,4,5,6,3,5,7};
		System.out.println("The given array is :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]==3 && arr[i]==5) {
				arr[i]=0;
			}
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
	public static void Demo() {
		int[] arr = {3,5,4,5,6,3,5,7};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum += arr[i];
			}
			System.out.print(arr[i]+",");
		}
	}

}
