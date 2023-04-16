
public class bubble {

	
	public static void main(String[] args) {

		int arr[] = {40,20,30,10,50};
		bub(arr);
		for (int i = 0;i <arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
public static void bub(int arr[]){
		int n = arr.length,temp;
		for (int i = 0;i<n;i++) {
			for (int j = 0;j<n-1;j++){
				if (arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
