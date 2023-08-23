import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    public void registration(){
        while(true){
            String name,id,email,password;
            System.out.println("Welcome to new user registration.Plese enter your details: ");
            System.out.println("Enter your name: ");
            name = sc.nextLine();
            System.out.println("Enter your ID: ");
            id = sc.nextLine();
            System.out.println("Enter your Email: ");
            email = sc.nextLine();
            System.out.println("Enter your Password: ");
            password = sc.nextLine();
            try{
                FileWriter fw = new FileWriter("registration_request.txt");
                fw.write("Namee:"+name+",");
                fw.write("ID:"+id+",");
                fw.write("Email:"+email+",");
                fw.write("Password:"+password+"\n");
                fw.close();
                break;
            }
            catch(IOException e){
                System.out.println("Error creating request.Please try again");
            }
            sc.close();
        }
        
    }
    public void login(){
        String userName,password;
        System.out.print("Enter your username: ");
        userName = sc.nextLine();
        System.out.print("Enter your password: ");
        password = sc.nextLine();
        try{
            BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
            String line ; 
            boolean found=false;
            while((line=reader.readLine())!=null){
                String[] tokens = line.split(",");
                String[] val1 = tokens[0].split(":");
                String[] val2 = tokens[3].split(":");
                if(val1[1].equals(userName) && val2[1].equals(password)){
                    found=true;
                    break;
                }
            }
            if(found){
                System.out.println("Login Successful");
            }
            else{
                System.out.println("Wrong credential.If you are new here please register.");
            }
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
