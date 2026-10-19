public class traping_water {
  public static void main(String[] args)
  {
    int []height={0,1,0,2,1,0,1,3,2,1,2,1};


           int n=height.length;
        int l=0;
        int r=n-1;
        int water=0;
        int l_max=height[l];
        int r_max=height[r];
        while(l<r)
        {
            if(l_max<r_max)
            {
                l++;
                l_max=Math.max(l_max,height[l]);
                water+=l_max-height[l];
            }
            else{
                r--;
             r_max=Math.max(r_max,height[r]);
                water+=r_max-height[r];
            }
        }
        System.out.print(water);
  }
}
