/*Consider tht u are building console interface or customers loan application where customer used to provide name, pan, aadhaar, email, then they will set the password for their account.
your role is to validate those info using regex
input: 
name: "Ra"
Password: "razak$123"
Aadhaar: "33394i209022"
PAN: "ABCDEFG"
Email: "example@gmail.c"

output: invalid aadhar, invalid email
*/

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class ValidateInfo {
    static Map<String, String> patterns = new HashMap<>();
    static{
        patterns.put("name", "^[A-Za-z ]{3,}$");
        patterns.put("password", "^(?=.[@#$!_])[A-Za-z0-9?=.@#$!_]{8,}$");
        patterns.put("adhaar", "^[0-9]{12}$");
        patterns.put("pan", "^[A-Z]{5}[0-9]{4}[A-Z]{1}$");
        patterns.put("email", "^[a-z0-9-_]{2,}");
    }
    static String validateKYC(Map<String, String> userData) {
        boolean flag = true;
        for (Map.Entry<String, String> entry : userData.entrySet()) {
            String field = entry.getKey();
            String value = entry.getValue();
            String regex = patterns.get(field);
            if (!Pattern.matches(regex, value)) {
                System.out.println("Invalid " + field);
                flag = false;
            }
        }
        return flag ? "Account created" : "Invalid User data";
    }

    public static void main(String[] args) {
        // Valid case
        Map<String, String> user1 = new HashMap<>();
        user1.put("name", "Razak Mohamed S");
        user1.put("password", "Razak@123");
        user1.put("aadhaar", "987654567834");
        user1.put("pan", "ABCDE0882W");
        user1.put("email", "dlithe@gmail.com");

        System.out.println(validateKYC(user1));

        // Invalid case
        Map<String, String> user2 = new HashMap<>();
        user2.put("name", "Ra");
        user2.put("password", "Razak123");
        user2.put("aadhaar", "987567834");
        user2.put("pan", "ABCDE08");
        user2.put("email", "dlithe@gmil.m");

        System.out.println(validateKYC(user2));
    }
}
