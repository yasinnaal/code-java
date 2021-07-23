class test{    
    public static void main(String args[]){    
     int flag=0;   
     int m = 0;   
     int n=98;
     
   // m=n/2;    // it will work if we tested half range 
    System.out.println("m:" + m);   
    for(int i=2;i<n;i++)
    {
      if(n%i==0)
      {      
       System.out.println(n+" is not prime number");      
       flag=1;    
       break;      
      }    

    
    }
        
    if(flag==0)  
    { 
      System.out.println(n+" is prime number");  
 
    }  

   }    
   }   