public class Subarray_Product_Less_Than_K {
public static void main(String[] args) {
  int []arr={10,5,2,6,3,4};

  int n=arr.length;
  int count=0;
  int k=100;

  for(int i=0;i<n;i++)
  {
    int pro=1;
    for(int j=i;j>=0;j--)
    {
      pro*=arr[j];
      if(pro<k)
        {
          count++;
      
        }
else if(pro>k){
  break;
}
      }
  }
System.out.println(count);
}
  
}