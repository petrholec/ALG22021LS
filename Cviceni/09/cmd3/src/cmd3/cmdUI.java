import java.io.IOException;
import java.util.Scanner;

public class cmdUI {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        CommandLine cmd = new CommandLine();
        do{
            System.out.print(cmd.getActualDir() + "$ ");
            String command = sc.nextLine();
            try {
                System.out.println(cmd.parseAndExecute(command));


            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("nepodaril se prikaz");
            }

            try{
                end = cmd.isEnd();
            } catch(UnsupportedOperationException e) {
                System.out.println("jeste nejde");
            }
        //} while(!command.equals("exit"));
        } while (!end);
       

    }
    
}
