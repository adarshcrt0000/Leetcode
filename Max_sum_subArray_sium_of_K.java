public class Max_sum_subArray_sium_of_K {
  public static void main(String[] args)
  {
    int []arr={1, 4, 2, 10, 23, 3, 1, 0, 20};
    int n=arr.length;
    int windowSum=0;
    int maxSum=0;
    int k=4;
  
    for(int i=0;i<k;i++)
    {
     windowSum+=arr[i];

    }
    maxSum=windowSum;

    for(int i=k;i<n;i++)
    {
      windowSum+=arr[i]-arr[i-k];
      if(maxSum<=windowSum){
        maxSum=windowSum;
      }
    }
    System.out.print(maxSum);
  }
}
