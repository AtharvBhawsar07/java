class Ar
{
    public static void main(String a[])
    {
        int nums [][]= new int [5] [5];
          for( int i=0; i <5; i++)
              
          {
           for(int j = 0; j<5; j++)
             {
                  nums[i][j]= (int)(Math.random()*10);

                       System.out.print(nums[i][j] + " ");   
              }
               System.out.println(" ");
          
           
            } 

                        for(int n[]:nums)
                {
                    for(int m : n){
                         System.out.print(m + " ");  
                         
                    }
                        System.out.println(" ");
                }


                                                      
   }

}
            






