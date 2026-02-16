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




//next permutation 
// import java.util.*;

// public class Arrays{
//     public static void nextPermutation(int nums[]){
//         int n = nums.length;
//         int pivot = -1;
//         for(int i= n-2;i>=0;i--){
//             if(nums[i]<nums[i+1]){
//                 pivot = i;
//                 break;
//             }

//         }

//         // if pivot = -1
//         if(pivot == -1){
//             reverse(nums,0,n-1);
//             return;
//         }
    


//     for(int i=n-1;i>pivot;i--){
//         if(nums[i]>nums[pivot]){
//             int temp = nums[i];
//             nums[i] = nums[pivot];
//             nums[pivot] = temp;
//             break;
//         }

//     }


//     reverse(nums,pivot+1,n-1);



    
//  }

// private static void reverse(int[] nums,int i, int j){
//     while(i<j){
//         int temps = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temps;
//         i++;
//         j--;
//     }
// }


// public static void main(String[] args) {
//     int nums[] = {1,2,3};
//     nextPermutation(nums);
//    for (int x : nums) {
//             System.out.print(x + " ");
//         }
// }
// }


  

// find missing and repeat number
// public class Arrays{
//     public static void findNumber(int[] nums){
//         int missing = -1,repeat = -1;
//         int n = nums.length;
//         int count[] = new int[n+1];
//         for(int i =0;i<n;i++){
//             count[nums[i]]++;
//         }

//         for(int i =1;i<= n;i++){
//             if(count[i] == 0){
//                 missing = i;
//             }

//             if(count[i] == 2){
//                 repeat = i;
//             }
//         }
//         System.out.println("("+ repeat + ","+ missing+")");

//     }
//     public static void main(String[] args) {
//         int[] nums = {1,2,2,4};
//       findNumber(nums);

//     }
// }



// Buy and sell stocks
// public class Arrays{
//     public static int buyStocks(int prices[]){
//        int buyPrice = Integer.MAX_VALUE;
//        int maxProfit = 0;
//        for(int i=0;i<prices.length;i++){
//         if(buyPrice < prices[i]){
//             int profit = prices[i] - buyPrice;
//              maxProfit = Math.max(maxProfit, profit);
//         }else{
//             buyPrice = prices[i];
//         }
//        }

//        return maxProfit;
//     }
//     public static void main(String[] args) {
//         int prices [] = {7,1,5,3,6,4};
//         int result = buyStocks(prices);
//         System.out.println(result);
//     }
// }



//sorted repeated array
// public class Arrays{
//     public static int serachInrepeated(int nums[],int target){
//         int start =0,end= nums.length-1;
//         while(start<= end){
//             int mid = start + (end - start)/2;

//             if(nums[mid] == target){
//                 return mid;
//             }

//             if(nums[start] <= nums[mid]){
//                 if(nums[start]<= target && target < nums[mid]){
//                     end = mid-1;
//                 }else{
//                     start = mid+1;
//                 }
//             }else{
//                 if(nums[mid]<target && target <= nums[end]){
//                     start = mid+1;
//                 }else {
//                     end = mid -1;
//                 }
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//        int[] nums = {4,5,6,7,0,1,2};
//         int target = 0;
//        int result = serachInrepeated(nums, target);
//        System.out.println(result);
//     }
// }


// product of array itself
// import java.util.*;

// public class Arrays{
//     public static int[] productOfArray(int nums[]){
//         int n = nums.length;
//         int leftProduct[] = new int[n];
//         leftProduct[0] = 1;
//         for(int i=1;i<n;i++){
//             leftProduct[i] = leftProduct[i-1]*nums[i-1];
//             // return leftProduct[i];
//         }
//         int rightProduct[] = new int[n];
//         rightProduct[n-1] = 1;
//         for(int i= n-2;i>= 0;i--){
//             rightProduct[i] = rightProduct[i+1]*nums[i+1];
//             // return rightProduct[i];
//         }
        
//         int ans[] = new int[n];
//         for(int i = 0;i<n;i++){
//         ans[i] = leftProduct[i]*rightProduct[i];
//         }

//         return ans;

//     }
//     public static void main(String[] args) {
//         int nums[] = {1,2,3,4};
//         int[] result = productOfArray(nums);
//         for(int i=0;i<result.length;i++){
//         System.out.print(result[i]+ " ");
//         }
//     }

    
// }



//Maximum product subarray
// public class Arrays{
//     public static int maxProduct(int nums[]){
//         int currMax = nums[0];
//         int currMin = nums[0];
//         int ans = nums[0];
//         int n = nums.length;
//         for(int i=1;i<n;i++){
//             if(nums[i] < 0 ){
//             int temp = currMax;
//             currMax = currMin;
//             currMin = temp;
//             }

//             int tempMax = Math.max(nums[i], nums[i]*currMax);
//             int tempMin = Math.min(nums[i], nums[i]*currMin);
           
//             currMax = tempMax;
//             currMin = tempMin;
             
//             ans = Math.max(currMax, ans);
              
              

//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int nums[] = {2,3,-2,4};
//         int result = maxProduct(nums);
//         System.out.println(result);
        
//     }
// }


//find minimum in rotated array
// public class Arrays{
//     public static int findMinInArray(int nums[]){
//         // int min = Integer.MAX_VALUE;
//         int end = nums.length-1;
//         int st = 0;
//         while(st <= end){
//             int mid = (st + end)/2;

//             if(nums[st] <= nums[end]){
//                 return nums[st];
//             }

//             if(nums[mid] >= nums[st]){
//                 st = mid+1;
//             }else{
//                 end = mid;
//             }

            
//         }
//         return nums[st];
//     }

//     public static void main(String[] args) {
//         int nums[] = {4,5,6,7,0,1,2

//         };
//         int result = findMinInArray(nums);
//         System.out.println(result);
//     }
// }