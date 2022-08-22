package com.collection;

import java.io.IOException;  
class TestEx{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("caought inside main()"+e);}  
  }  
  public static void main(String args[]){  
   TestEx obj=new TestEx();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  