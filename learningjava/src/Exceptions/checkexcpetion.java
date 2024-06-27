import java.io.FileNotFoundException;

class checkexception {
 
    // Main driver method
    public static void main(String[] args)
    {
    	try
    	{
    		throw new FileNotFoundException();
    	}
    	catch(FileNotFoundException e)
    	{
    		e.getMessage();
    	}
    }
    
}

