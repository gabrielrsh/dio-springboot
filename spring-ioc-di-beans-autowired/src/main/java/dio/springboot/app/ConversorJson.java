package dio.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import dio.springboot.app.model.ViaCepResponse;

@Component
public class ConversorJson {
    @Autowired
    private Gson gson;

    public ViaCepResponse converter(String json){
        ViaCepResponse response = gson.fromJson(json,ViaCepResponse.class);
        return response;
    }
}
