    import java.rmi.*; 
    import java.util.Scanner; 
    public class MyClient{  
    public static void main(String args[]){ 
	System.out.println("Enter start and end index of line"); 
	Scanner sc = new Scanner(System.in); 
	 int start = sc.nextInt(); 
         int  end = sc.nextInt();  
	 
    try{  
    Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/himanshu");  
    System.out.println(stub.add(start,end));  
    }catch(Exception e){}  
    }  
    }  
