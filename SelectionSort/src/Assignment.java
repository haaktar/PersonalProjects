/* Portfolio Activity Unit 2
Lab: Implementing selection sort algorithm and performing asymptotic analysis.
Write a code to implement a selection sort algorithm in Java or Python.
Test your program with the data set below and take screenshots.
Perform an asymptotic analysis of your algorithm.

Data set:
64 35 12 22 11
 */

class Assignment
{
    void sort(int arr[])
    {
        int n = arr.length;

        // Moving boundary
        for (int i = 0; i < n-1; i++)
        {
            // Finding the minimum element
            int minElement = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[minElement])
                    minElement = j;


            int newElement = arr[minElement];
            arr[minElement] = arr[i];
            arr[i] = newElement;
        }
    }

    // Printing Arrays
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    //  Testing :
    public static void main(String args[])
    {
        Assignment object = new Assignment();
        int arr[] = {64,35,12,22,11}; // 64 35 12 22 11
        object.sort(arr);
        object.printArray(arr);
        System.out.println("*** Array is sorted ***");

    }
}

