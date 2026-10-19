public class TwoSum{
     public static void main (String[] args)
{
// Brute force technique

// int[] arr={2,7,11,15};
// int target=91;
// boolean found=false;


// for(int i=0;i<arr.length;i++)
// {
//   for(int j=i+1;j<arr.length-1;j++){
  
//     if(arr[i]+arr[j]==target)
//     {
//       found=true;
//     }
//   }
// }

// if(found==false)
// {
//   System.out.println("Target not achieved");
// }
// else
// {
//   System.out.println("Target achieved");
  
// }
// }
// }


// two pointer technique

int[] arr={2,7,11,15};
int target=95;
int n=arr.length;
boolean found=false;
int lh=0;
int rh=n-1;
while(lh<rh)
{
  if(arr[lh]+arr[rh]==target)
  {
   found=true;
    break;
  }
  else if(arr[lh]+arr[rh]>target)
  {
    rh--;
  }
  else
  {
    lh++;
  }

}
if(found==false)
{
  System.out.println("Target not achieved");
}
else
{
  System.out.println("Target achieved");

}
}
}
