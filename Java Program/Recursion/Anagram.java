package Recursion ;
public class Anagram {
public static void anag (char[] str , char[] str2 , int count , int i ) {
if ( i < 0 ){
if(count == str2.length ){
System.out.println(" Anagram ");
}
else{
System.out.println("  not a Anagram ");
}
return;
}

for(int j = 0 ; j < str2.length ; j++){
     if(str[i] == str2[j]){
      count ++;
break;
}
}
anag ( str , str2 , count , i - 1);
}

public static void main (String args [] ) {
    String a = "race";
    String b = "care";
    int count = 0;
    char [] str = a.toCharArray();
   char [] str2 = b.toCharArray();
    anag ( str , str2 , count , str.length - 1);
}
}
   



