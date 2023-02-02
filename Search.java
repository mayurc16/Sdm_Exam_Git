Class Search
{
   
    public static void main(String[] args)  
    {
       /*Menu Driven Program*/ 
       
       int i ;
       int arr[]={1,7,8,12,17,56,65};
       do
       {
        System.out.println("01. Linear Search");
        System.out.println("01. Binary Search");
        System.out.println("0. Exit");
        i=/*Input from user*/ 
            Switch(i)
            {
                case 1:LinearSearch(arr,65); break;
                case 2:System.out.println(BinarySearch(arr,0,arr.length,56)); break;
                case 0:i=0; break;
            }
       }while (i==0);
       

    }

}