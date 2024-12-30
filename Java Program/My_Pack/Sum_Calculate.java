package My_Pack ;
public class Sum_Calculate{
public static int sum (int [] arr , int l ){
if (l <= 0 ){
return 0 ;
}
return sum(arr , l - 1) + arr [ l - 1];
}
public static void main(String args [] ){
int a [] = { 1,2,3,4,5,10,15};
int n = sum(a, a.length);
System.out.println(n + "   " );
}
}