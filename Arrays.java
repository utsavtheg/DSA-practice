//Maximum and Minimum Element in Array

// public class Arrays{
//   public static void minMax(int arr[]){
//     int min = Integer.MAX_VALUE;
//     int max = Integer.MIN_VALUE;
//     for(int i=0;i<arr.length;i++){
//       if(max<arr[i]){
//         max = arr[i];
//       }
//       if(min > arr[i]){
//         min = arr[i];
//       }
//     }
//     System.out.println("The minimum element is :" + min);
//     System.out.println("the maximum element is :"+max);
//     System.out.println("("+min+","+max+")");
//   }
//   public static void main(String[] args) {
//     int arr[] = {3,5,4,1,9};
//     minMax(arr);
//   }
// }

//Reverse the array



// public class Arrays{

//   public static void reverse(int arr[]){
//     int start = 0;
//     int end = arr.length-1;
//     while(start<end){
//       int temp = arr[start];
//      arr[start] = arr[end];
//       temp = arr[end];
//       start++;
//       end--;
//     }
//   }
//   public static void main(String[] args) {
//     int arr[] = {1,4,3,2,6,5};
//     reverse(arr);
//     for(int i=0;i<arr.length;i++){
//       System.out.print(arr[i]+" ");

//     }
//   }

    //MAximum of SubArray
    // public class Arrays{
       
    //   public static int maxSum(int nums[]){
    //     int cs = nums[0],ms = nums[0];
    //     for(int i=1;i<nums.length;i++){
    //       cs = Math.max(nums[i],cs + nums[i]);
    //       ms = Math.max(ms ,cs);

    //     }
    //     return ms;
    //   }


    //   public static void main(String args[]){
    //     int nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    //     int result = maxSum(nums);

    //   }





    // }


// chocolate distribution

// import java.util.*;

// public class dpp{
//   public static void chocolateDistribute(int packets[],int m){
//     if (m == 0 || packets.length == 0 || m > packets.length) {
//       System.out.println("Invalid input");
//       return;
//     }
//     int diff = Integer.MAX_VALUE;
//     int currDiff = 0;
//     int min = 0, max = 0;
//     Arrays.sort(packets);
//     for(int i=0;i<=packets.length-m;i++){
//         min = packets[i];
//         max = packets[i+m-1];

//        currDiff = max - min;
//        diff = Math.min(diff, currDiff);
       

//     }
//     System.out.println("The minimum distribution is:"+ diff);

//   }
//   public static void main(String[] args) {
//     int packets[] = {7,3,2,4,9,12,56};
//     int m = 4;
//     chocolateDistribute(packets, m);;

//   }
// }

//Search in rotated array
// public class Arrays{
//   public static int(int nums[] , int target){
//     int target = n;

//   }

// }


  

