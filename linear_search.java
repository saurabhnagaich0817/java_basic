import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int arr [] = {1,2,3,4,5};
        int t = 5;
        System.out.print(find(arr,t,0));
    }
    // public static int find(int[] arr ,int t, int i){
    //     if(i == arr.length){
    //         return -1;
    //     }
    //     if(arr[i] == t){
    //         return i;
    //     }
    //     else{
    //         return find(arr, t, i+1);
    //     }

    // }
    public static boolean find(int[] arr ,int t, int i){
        if(i == arr.length){
            return false;
        }
        if(arr[i] == t){
            return true;
        }
        else{
            return find(arr, t, i+1);
        }

    }

    
}
