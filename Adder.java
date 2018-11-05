    import java.rmi.*;  
    public interface Adder extends Remote{  
    public String add(int x,int y)throws RemoteException;  
    }  
