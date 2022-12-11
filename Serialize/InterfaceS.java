package Models.Serialize;

import java.util.List;
import java.io.IOException;

public interface InterfaceS<T> {
    void writeObject(String fileName, T object) throws IOException;

    T readObject(String fileName) throws IOException, InstantiationException, IllegalAccessException;

    void writeList(String fileName, List<T> object);

    List<T> readObjectsList(String fileName, Class<T> tClass);


}
