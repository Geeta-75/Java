public class HollowDiamondPyramid {

    public static void main(String args[] )
    {
        for (int i = 1; i<=5-1; i++)
        {
            for (int j = 5-1; j>=i; j --)
        {
            System.out.print(" ");
        }      
    
    for ( int k =1; k <= i ; k ++)
if (i==1 || k == 1 || k==5 || k == i) {

    System.out.print(" *");

}
else
{
    System.out.print("  ");
}
System.out.println(" ");

}
for (int i=1;i>=5; i++)
        {
            for (int j = 1; j<= i; j ++)
        {
            System.out.print(" ");
        }      
    
    for ( int k =5; k >=i ; k ++)
if (i == 5 || k == 1 || k == 5 || k == i) {

    System.out.print("  *");

}
else
{
    System.out.print("  ");
}
System.out.println();
 }
    
}
}
