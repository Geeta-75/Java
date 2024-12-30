/*public class StarPattern1 {

    public static void main(String args[])   
{    

int i, j ,k , l;       

for (i=1; i<=4; i++)   
{   
for (j=1; j<= i; j++)   
{  
System.out.print("  ");   
}   
  
for ( k=4; k>=i; k--)  

{    
System.out.print("* ");   
}   
for (l = 3 ; l >= i ; l--)
{
    System.out.print("* ");
}

System.out.println();   
}   
}

    
}*/


public class StarPattern1 {

    public static void main(String args[])   
{    

int i, j ,k , l;       

for (i=4; i>=1; i--)   
{   
for (j=4; j>= i; j--)   
{  
System.out.print("  ");   
}   
  
for ( k=1; k<=i; k++)  

{    
System.out.print("* ");   
}   
for (l = 3 ; l >= i ; l--)
{
    System.out.print("* ");
}

System.out.println();   
}   
}

    
}

