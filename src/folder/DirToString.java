package folder;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class DirToString {
	

    
	public static void main(String[] args) {
		
		    File curDir = new File("/home");
	        getAllFiles(curDir);
	    }
			
	    	
		    private static void getAllFiles(File curDir) {
			StringBuilder sb = new StringBuilder();
			int count = 0;
			String[] folderList = curDir.list();
			for(String folder : folderList) {
				sb.append(folder.toString()).append('\n');
				count++;
			}
			String total = "There are " + count + " files and folders in this directory";
			
			System.out.println(sb);	
			
			
	        String str = sb.toString();
	        try{
	        	 FileWriter fstream = new FileWriter("/tmp/home.txt");
	        	 BufferedWriter out = new BufferedWriter(fstream);
	        	 out.write(total + "\n" + str);
	        	 out.close();
	        	 }catch (Exception e){
	        	  System.err.println("Error: " + e.getMessage());
	        	 }
	    
	    
}
}