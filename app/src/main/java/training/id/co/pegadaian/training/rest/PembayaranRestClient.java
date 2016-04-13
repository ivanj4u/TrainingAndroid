package training.id.co.pegadaian.training.rest;

import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

import training.id.co.pegadaian.training.exception.LoginFailedException;

/**
 * Created by ivan_j4u on 4/13/2016.
 */
public class PembayaranRestClient {

    private static final String URL_SERVER = "https://pembayaran.herokuapp.com";

    private RestTemplate template = new RestTemplate();

    public void login(String username, String password) throws LoginFailedException {
        Map<String, String> loginData = new HashMap<>();
        loginData.put("username", username);
        loginData.put("password", password);

        Map<String, Object> hasil = template
                .postForObject(URL_SERVER + "/api/login",
                        loginData, Map.class, new Object[]{}
                );

        if(hasil == null){
            throw new LoginFailedException("Response invalid");
        }

        if(!(Boolean)hasil.get("success")){
            throw new LoginFailedException("Username / Password salah");
        }
    }

}
