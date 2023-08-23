import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Librarian {
    Scanner sc = new Scanner(System.in);
    public void login(){
        String userName,password;
        System.out.print("Enter your username: ");
        userName = sc.nextLine();
        System.out.print("Enter your password: ");
        password = sc.nextLine();
        if(userName.equals("Admin") && password.equals("Admin")){
            functionality();
        }
        else{
            System.out.println("Wrong credentials.Please try again");
        }
    }
    public void functionality(){
        System.out.println("Welcome.Enter your choice.\n");
        System.out.println("1.Add Books\n2.Delete Books\n3.Edit Books\n4.Review User Request.");
        int choice;
        choice = sc.nextInt();
        if(choice==4){
            reviewUser();
        }
    }
    public void reviewUser(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("registration_request.txt"));
            String line;
            System.out.println("Showing requested user: ");
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
            System.out.println("Do you want to Accept(A) or Reject(R)?: ");
            String ch;
            ch = sc.nextLine();
            do {
                ch = sc.nextLine();
            } while (!ch.equals("A") && !ch.equals("R"));

            if(ch.equals("A")){
                reader = new BufferedReader(new FileReader("registration_request.txt"));
                FileWriter fw = new FileWriter("users.txt",true);
                while((line=reader.readLine())!=null){
                    fw.write(line+"\n");
                }
                reader.close();
                fw.close();
                System.out.println("User added successfully");
                File file = new File("registration_request.txt");
                file.delete();
            }
            else{
                System.out.println("Request rejected");
                File file = new File("registration_request.txt");
                file.delete();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
