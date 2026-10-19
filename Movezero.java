public class Movezero {
  public static void main(String[] args)
  {
    int nums[]={1,0,2,1,0,0,3};

  //  optimize method
   int n=nums.length;
   int left=0;
   int right=0;
   for(int i=0;i<n-2;i++)
    {
      if(nums[right]==0) right++;
      if(nums[right]!=0)
        {
          int temp=nums[left];
          nums[left]=nums[right];
          nums[right]=temp;
          left++;
          right++;
          
        }
    }
    for(int a:nums)
    {
      System.out.print(a);
      }

    // Brute force method

    
    //  int n=nums.length;
    //     int idx=0;
    //     for(int i=0;i<n;i++)
    //     {
    //         if(nums[i]!=0){
    //           nums[idx++]=nums[i];
    //         }
    //     }

    //   while(idx<n)
    //   {
    //     nums[idx++]=0;
    //   }
      
    //    for(int a:nums)
    //    {
    //     System.out.print(a);
    //    }
  }
}
