package com.muthukumarasamym.hackerank;

import java.io.*;
import java.util.*;
import java.lang.reflect.*;
class Prime{
public void checkPrime(int ...p){			// varags - variable agruments
    for(int i: p){
        if(isPrime(i)){
            System.out.print(i+" "); 	
        }
    }
    System.out.println();
}   
public static boolean isPrime(int a){
    int count=0;
    for(int i=1;i<=a;i++){
        if(a%i==0)
        count++;
    }
    if(count==2){
        return true;
    }
    else{
        return false;
    }
}
}
public class PrimeNumbers {

  public static void main(String[] args) {
    try{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n1=Integer.parseInt(br.readLine());
    int n2=Integer.parseInt(br.readLine());
    int n3=Integer.parseInt(br.readLine());
    int n4=Integer.parseInt(br.readLine());
    int n5=Integer.parseInt(br.readLine());
    Prime ob=new Prime();
    ob.checkPrime(n1);
    ob.checkPrime(n1,n2);
    ob.checkPrime(n1,n2,n3);
    ob.checkPrime(n1,n2,n3,n4,n5);  
    Method[] methods=Prime.class.getDeclaredMethods();
    Set<String> set=new HashSet<>();
    boolean overload=false;
    for(int i=0;i<methods.length;i++)
    {
      if(set.contains(methods[i].getName()))
      {
        overload=true;
        break;
      }
      set.add(methods[i].getName());
      
    }
    if(overload)
    {
      throw new Exception("Overloading not allowed");
    }
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
  
}

