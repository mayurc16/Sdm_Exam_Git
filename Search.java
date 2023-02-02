Class Search
{
    public static void Linear Search(int arr[],int element)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
                {
                    System.out.println("Element Found at index: "+i);
                    return;
                }
        }
        System.out.println("Element Not Found");  
    }
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