import java.io.File;
import java.io.IOException;

public class CommandLine {

    //data
    private String command;
    private File actualDir; //File funguje jak na soubory, tak i adresare. 

    //konstruktor
    public CommandLine(){
        actualDir = new File(System.getProperty("user.dir"));
    }

    public String getActualDir() {
        return actualDir.getAbsolutePath();
    }

	public String parseAndExecute(String command) throws IOException {
		String[] parts = command.trim().split(" ");
        String result;
        switch(parts[0]){
            case "mkfile": 
                result = mkfile(parts [1]); 
                break;
            //case "help": 
                //result = help();
            default: 
                result = "invalid command";
        }
        return result;
	}

    private String mkfile(String filename) throws IOException {
        //File f = new File(actualDir.getAbsolutePath() + File.separator + filename);
        File f = new File(actualDir, filename);
        if (f.createNewFile()){
            return "file created";
        } else {
            return "file already exists";
        }
        
    }

    private String help() {
        return null;
    }

	public boolean isEnd() {
		return false;
	}

    
}
