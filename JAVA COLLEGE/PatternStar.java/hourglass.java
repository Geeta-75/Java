public class hourglass {

    

 public static void main (String [] args) 

    {
    int a [] = { 1 , 10 , 100, 98 , 30 , 55} ;

    int large = 0; 
   // int secondlarge = 0 ; 
    int i ;
    for (  i = 0 ; i < a.length ; i ++ )
    {
        if (large< a [i])

        {
            large = a [i];
        }
    }

    int secondlarge = a.length - 1;

//  for (int j = 0 ; j < a.length ; j ++ )
//     {
//         if ( a [j] != large)
//         {
//             if (secondlarge < a [j])
        

//         {
//             large = a [j];
//         }
//     }
    
// }
 System.out.println(secondlarge);
}
}
    
        

    




