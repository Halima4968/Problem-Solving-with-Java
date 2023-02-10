import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class registration_form {
    public static void main(String[] args) throws IOException {

        JSONObject userReg=new JSONObject();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name");
        userReg.put("Full name", scanner.nextLine());

        System.out.println("Enter your email");
        userReg.put("Email Address", scanner.nextLine());

        System.out.println("Enter your password");
        userReg.put("Password", scanner.nextLine());

        System.out.println("Enter your address");
        userReg.put("Address", scanner.nextLine());

        System.out.println("Enter your mobile number");
        userReg.put("Mobile", scanner.nextLine());

        System.out.println(userReg);
        FileWriter file=new FileWriter("./src/main/resources/UserRegistration.json");
        file.write(userReg.toJSONString());
        file.flush();
        file.close();

    }

}
