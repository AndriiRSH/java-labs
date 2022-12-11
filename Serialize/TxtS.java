package Models.Serialize;
import Models.Circle;

import java.io.*;
import java.io.IOException;
import java.util.List;
import java.lang.*;
public class TxtS implements InterfaceT<Circle> {

    @Override
    public void writeObject(String fileName, Circle object) throws IOException{
        try(FileWriter fos = new FileWriter(fileName)) {
            fos.write(object.toString());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


    @Override
    public Circle readObject(String fileName, Class<Circle> tClass) throws IOException, InstantiationException, IllegalAccessException{

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while(line != null){
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }

        String everything = sb.toString();
        return (Circle) tClass.newInstanse().toObject(everything);

    }

    @Override
    public void writeList(String fileName, List<Circle> object) throws IOException {
        FileOutputStream f = new FileOutputStream(new File(fileName));
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(object.toString());
        o.close();
        f.close();
    }

    @Override
    public List<Circle> readObjectsList(String fileName){
        return null;
    }
}
