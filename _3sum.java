import java.util.Arrays;

public class _3sum {
  public static void main(String[] args)
  {
    int []nums={-1,2,-5,3,3,2,-1,-1,0,0,0,-1};
      Arrays.sort(nums);
    int n=nums.length;
    int j,k;
   for(int i=0;i<n-2;i++)
   {
      if(i>0 && nums[i]==nums[i-1]) continue;

      j=i+1;
      k=n-1;

      while(j<k)
      {
        int sum=nums[i]+nums[j]+nums[k];

        if(sum==0) 
        {
         System.out.println("["+nums[i]+","+nums[j]+","+nums[k]+"]");
         while(j<k && nums[k]==nums[k-1]) k--;
         while(j<k && nums[j]==nums[j+1]) j++;

         j++;
         k--;
        }
        else if(sum>0)
        { 
          k--;     
        }
        else
        {
            j++;
        }
      }

   }
  }
}
