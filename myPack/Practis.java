package myPack;
    

import java.util.*;
class Practis {

// from L to R
static void Even(int L, int R)
{

if (R < L) 
{
	return;
}

// Recurrence relation
if(R % 2 == 0 )
	Even(L, R - 2);
else
	Even(L, R - 1);

// Check if R is even
if (R % 2 == 0) 
{
	System.out.print(R + " ");
}
}


static void Odd(int L, 
				int R)
{
// Base case
if (R < L) 
{
	return;
}


if(R % 2 == 1 )
	Odd(L, R - 2);
else
	Odd(L, R - 1);

// Check if R is even
if (R % 2 == 1) 
{
	System.out.print(R + " ");
}
}


public static void main(String[] args)
{
int L = 10, R = 25;
System.out.print("Even numbers:");


Even(L, R);
System.out.println();

// Print all the
// odd numbers
System.out.print("Odd numbers:");
Odd(L, R);
}

@Override
public String toString() {
    return "Practis []";
}
}

// This code is contributed by Rajput-Ji

    

