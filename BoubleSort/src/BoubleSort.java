public class BoubleSort
{
    void Boublesor(int arr[],int n)
    {

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);


                }

            }

        }

    }
     void  swap(int arr[],int x, int y)
    {
        int temp;
        temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;




    }
    void print(int arr[],int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] +" ");

        }
    }
}
