Class Search
{
    public static boolean BinarySearch(int arr[],int element,int si, int ei)
    {
        if(si>ei)
            return false;
        int mid =arr.length/2;
        if(arr[mid]==element) 
        {
            return true;
        }   
        if(arr[mid]>=element) 
            BinarySearch(arr, element, mid, ei);
        else
            BinarySearch(arr, element, si,mid);
    }   
    public static void main(String[] args)  
    {
       
    }

}