package Models.Serialize;

import Models.Circle;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonS implements InterfaceJ<Circle> {
    private ObjectMapper objectMapper;

    public JsonS(){
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
    }

    @Override
    public void writeObject(String fileName, Circle object){
        try {
            objectMapper.writeValue(new File(fileName), object);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Circle readObject(String fileName){
        try {
            var res = objectMapper.readValue(new File(fileName), Circle.class);
            return (Circle) res;
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeList(String fileName, List object){
        try {
            objectMapper.writeValue(new File(fileName), object);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public List readObjectsList(String fileName){
        try {
            List res = objectMapper.readerForListOf(Circle.class).readValue(new File(fileName));
            return res;
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
