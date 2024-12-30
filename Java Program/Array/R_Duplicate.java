package Array ;
public class R_Duplicate{
public static void main(String args [] ){
int a [] = { 1,2,2,3,4,5,6,6,7};
int d = 0;
System.out.println(" Remove Duplicate Element " );
for(int i = 0 ; i < a.length  ; i++){
for(int j = i+1 ; j < a.length - 1 ; j++){
if(a[i] == a[j]){
    a[i] = d;
}
}
}
for(int k = 0 ; k < a.length - 1 ; k++){
if(k != d ){
System.out.println(a[k]);
}
}
}
}