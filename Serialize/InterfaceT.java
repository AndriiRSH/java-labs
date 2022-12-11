package Models.Serialize;

import java.util.List;
import java.io.IOException;
public interface InterfaceT<T> {
    void writeObject(String fileName, T object) throws IOException;

    T readObject(String fileName, Class<T> tClass) throws IOException, InstantiationException, IllegalAccessException;

    void writeList(String fileName, List<T> object) throws IOException;

    List<T> readObjectsList(String fileName);
}
