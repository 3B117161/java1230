public class MySearch{
	public static void main (string[] args){
		int [] arr = {10,9,8,7,6,5,4,3,2,1,0};
		
		int target = 2;
		int targetIndex = 0;
		int searchCount = 0;
		//search
		for (int i=1; i<arr.length; i++){
			if (arr[i] == tardget){
				targetIndex = i;
			}
			searchCount++;
		}
		System.out.println("The position is"+targetIndex);
		System.out.println("searchCount"+searchCount);
	}
	
}
				
//暴力破解法		