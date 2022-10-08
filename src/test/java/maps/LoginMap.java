package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LoginMap {
    private static Map<String, Object> login;
    public static String token;


    public static Map<String, Object> getLogin() {
        return login;
    }

    public static void initLogin(){
        login = new HashMap<>();
        login.put("email", "aluno@email.com");
        login.put("senha", "123456");


    }
}
