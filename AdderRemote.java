    import java.rmi.*;  
    import java.rmi.server.*;  
    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;

    public class AdderRemote extends UnicastRemoteObject implements Adder{  
    AdderRemote()throws RemoteException{  
    super();  
    }  
    public String add(int x,int y){
	System.out.println("client send start index:-"+x);
	System.out.println("client send end index:-"+y);
		int count=0;
		String s = "";
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"program.txt"));
			String line = reader.readLine();
			while (line != null) {
				if (count >= x-1 && count<=y-1){
				s = s +line + "\n";
				}
				line = reader.readLine();
				++count;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	System.out.println(s);
	if(x >y)
	{
		s = "Starting index can't be larger than end index";
		return s;
	}
	if(x >count)
	{
	s ="this line no does not exist in file";
	return s;
	}
	 
	return s;}  
    }  
