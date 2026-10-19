public class maxConsecutive {
  public static void main(String[] args) {
int []arr={1,1,1,0,0,0,2,2,2,1,1,1,1,1,1,1,0};
int count=1;
int i=0;
  for(int j=i+1;j<arr.length-1;j++)
  {
    if(arr[j-i-1]==arr[j]) count++;
    if(arr[j-i-1]!=arr[j]) count=1;
  }
System.out.println(count);
  }

}