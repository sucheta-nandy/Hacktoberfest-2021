import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
static int rec_linear_search(int arr[], int left, int right, int x) 
{
  int result;
  if (right < left)        // The array is exhausted so return -1
    return -1;
  if (arr[left] == x)        // If element found return position
    return left;
  // Call the function again with new subarray from next element.
  result = rec_linear_search(arr, left+1, right, x);     
  return result;    // return the result to the calling function.
}
  public static void main(String[] args)
  {
    int loc,x,array[]={10,11,12,13,14,25,26,37,48,29};
    x=13;    // Searched Element.
    loc = rec_linear_search(array, 0, 10, x);    // Call the search function
    if(loc != -1)
      System.out.print("Element found at location : " + loc);
    else
      System.out.print("Element not present in the array.");
  }
}
