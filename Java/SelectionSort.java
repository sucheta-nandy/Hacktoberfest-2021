public class SelectionSort {
    void sort(int MyArray[])
    {
        int n = MyArray.length;

        // One by one move the boundary of unsorted sub-array
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (MyArray[j] < MyArray[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first element
            int temp = MyArray[min_idx];
            MyArray[min_idx] = MyArray[i];
            MyArray[i] = temp;
        }
    }

    void printArray(int MyArray[])
    {
        int n = MyArray.length;
        for (int i=0; i<n; ++i)
            System.out.print(MyArray[i]+" ");
        System.out.println();
    }

    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int MyArray[] = {64,25,12,22,11};
        ob.sort(MyArray);
        System.out.println("Sorted array:");
        ob.printArray(MyArray);
    }
}
