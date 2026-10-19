public class mi_size_sbar_aum {

  public static void main(String[] args) {
    int []arr={2,3,1,2,5,4,3};
    // optimize way

  
        int n=arr.length;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        int l=0;
        int t=7;

for(int r=0;r<n;r++)
{
  sum+=arr[r];
  while(sum>=t){
    ans=Math.min(ans,r-l+1);
    sum-=arr[l];
    l++;

  }
}

System.out.println(ans==Integer.MAX_VALUE ? 0:ans);

    
    // bruteForce
    
    // int t=7;
    // int ans=Integer.MAX_VALUE;
    // int n=arr.length;
    // for(int i=0;i<n;i++)
     
    // {
    //   int sum=0;
    //   for(int j=i;j<n;j++)
    //   {
    //     sum+=arr[j];
    //     if(sum>=t)
    //     {
    //       int len=j-i+1;
    //       ans=Math.min(ans, len);
        
    //     }
    //   }
      
    // }
    //   if(ans==Integer.MAX_VALUE)
    //      System.out.println(0);

    //  System.out.println(ans);
    
  }
}