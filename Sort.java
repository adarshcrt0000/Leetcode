public class Sort {
  public static void main(String[] args)
  {
    int arr[]={0,1,0,1,2,2,1,0,1,2,1};

// optimize way

int n=arr.length;
int low=0;
int mid=0;
int high=n-1;

while(mid<=high)
{
  if(arr[mid]==0) 
    {
      arr[mid]=arr[low];
      arr[low]=0;
      low++;
      mid++;

    }
    else if(arr[mid]==1) mid++;
  else
    {
      arr[mid]=arr[high];
      arr[high]=2;
      high--;
    } 
}
for(int a:arr)
{
  System.out.print(a);
}

// simple way to solve



//     int C0=0;
//     int C1=0;
//     int C2=0;
//     for(int i=0;i<arr.length;i++)
//     {
//       if(arr[i]==0) C0++;
//       if(arr[i]==1) C1++;
//       if(arr[i]==2) C2++;
//     }
//   for(int i=0;i<C0;i++)
//   {
//     arr[i]=0;
//   }
//   for(int i=C0;i<C1;i++)
//   {
//     arr[i]=1;
//   }
//   for(int i=C1;i<arr.length;i++)
//   {
//     arr[i]=2;
//   }

// for(int a:arr){
//   System.out.print(a);
// }

  }
}