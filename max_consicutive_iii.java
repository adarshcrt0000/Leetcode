public class max_consicutive_iii {
  public static void main(String[] args) {
    int []arr={1,1,1,0,0,0,1,1,1,1,0}; 
    int k = 2;
    int n=arr.length;
   

    // optimizesolution 


        int zerocount=0;
        
        int left=0;
        for(int r=0;r<n;r++)
        {
            if(arr[r]==0){
                zerocount++;
            }
            if(zerocount>k){
                if(arr[left]==0){
                    zerocount--;
                }
                left++;
            }
        }
        System.out.println(n-left);









// brute force

//  int count=0;
    // int max=0;
  // for(int i=0;i<n;i++)
  // {

  //   for(int j=i;j<n;j++)
  //   {
      
  //     if(arr[j]==0){
  //       count++;
  //     }
  //     else if(count>k)
  //     {
       
  //       break;
  //     }
  //     max=Math.max(max, j-i+1);
  //     }
  //    }
  //  System.out.println(max);
  }
}
