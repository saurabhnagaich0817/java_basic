public class sorted
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
         int [] arr = { 1,3,2,5,6};
        System.out.print(sorted(arr,0));
	}
	static boolean sorted(int [] arr,int i){
	    if(i == arr.length-1){
	        return true;
	    }
	    return arr[i]<arr[i+1] && sorted(arr,i+1);
	}
}
