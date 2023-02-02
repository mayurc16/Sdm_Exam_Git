Class Search
{
   
    public static void main(String[] args)  
    {
       /*Menu Driven Program*/ 
       
       int i ;
       do
       {
        System.out.println("01. Linear Search");
        System.out.println("01. Binary Search");
        System.out.println("0. Exit");
        i=/*Input from user*/ 
            Switch(i)
            {
                case 1:LinearSearch(); break;
                case 2:BinarySearch(); break;
                case 0:i=0; break;
            }
       }while (i==0);
       

    }

}