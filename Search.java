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
    public static void main(String[] args)  
    {
       
    }

}