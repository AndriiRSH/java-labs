package Models.Serialize;

import Models.Circle;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class XmlS implements InterfaceS<Circle>{
    private ObjectMapper objectMapper;

    public XmlS(){
        JacksonXmlModule xmlModule = new JacksonXmlModule();
        xmlModule.setDefaultUseWrapper(false);
        objectMapper = new XmlMapper(xmlModule);
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
    public void writeList(String fileName, List<Circle> object){
        try {
            objectMapper.writeValue(new File(fileName), object);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Circle> readObjectsList(String fileName, Class<Circle> tClass){
        try {
            return objectMapper.readerForListOf(Circle.class).readValue(new File(fileName));
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
