package com.company;

public class moveZeroes {

// public void moveZeroes(int[] nums) {//使用新数组
//     int length=nums.length;
//         int [] newZeroes = new int[length];
//         int count=0;
//         for(int i: nums){
//                if(nums[i]==0){
//                    newZeroes[length-1-count]=0;
//                    count++;
//                }
//                else{newZeroes[i-count]=nums[i];}
//         }
//         System.arraycopy(newZeroes,0,nums,0,length);
// }
// public void moveZeroes(int[] nums) {//勉强能用
//     int length=nums.length;
//     int head=0;
//     while(head<length-1){
//         int current=0;
//         while(current<length-1) {
//             if (nums[current] == 0) {
//                 //交换current与tail
//                 nums[current] = nums[current] ^ nums[current+1];
//                 nums[current+1] = nums[current] ^ nums[current+1];
//                 nums[current] = nums[current] ^ nums[current+1];
//             }
//             current+=1;
//         }
//         head+=1;
//     }
// }
// public void moveZeroes(int[] nums) {//查找非0数字 找到后落回数组头
//     int length = nums.length;
//     int p1 = 1;//顺序遍历整个数组
//     int p2=1;//从遍历点有非0就交换到最前非0一个位置
//     while(p1<length){
//         p2=p1;
//         while(p2>=1&&nums[p2-1]==0&&nums[p2]!=0){
//             nums[p2]=nums[p2]^nums[p2-1];
//             nums[p2-1]=nums[p2]^nums[p2-1];
//             nums[p2]=nums[p2]^nums[p2-1];
//             p2--;
//         }
//         p1++;
//     }
// }

public void moveZeroes(int[] nums) {//查找非0数字 找到后放到第n个位置,最后把尾部置为0
    int length = nums.length;
    int n=0;

   for(int i=0;i<length;i++){
       if(nums[i]!=0){
           nums[n]=nums[i];
           n++;
       }
   }
   for(int i=n;i<length;i++){
       nums[i]=0;
   }
}

}
