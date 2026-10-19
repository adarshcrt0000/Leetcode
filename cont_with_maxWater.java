public class cont_with_maxWater {
  public static void main(String[] args)
  {
    int arr[]={1,3,5,4,8,9,5};
    int l=0;
    int n=arr.length;
    int r=n-1;
    int max_area=0;

    while(l<r)
      {
        int h=Math.min(arr[l], arr[r]);
        int w=r-l;
        int area =h*w;
        max_area=Math.max(max_area, area);
        if(l<=r) l++;
        else r--;

      }
      
    System.out.print(max_area);
  }
}
