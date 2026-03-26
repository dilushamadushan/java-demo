package serialization.ParentSerialization;

import java.io.*;

public class MySerialization {

    public void serializer(Cat cat){
        try {
            FileOutputStream fos = new FileOutputStream("cat.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(cat);
            oos.flush();
            oos.close();
            fos.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void deserializer(){
        try {
            FileInputStream fis = new FileInputStream("cat.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Cat cat = (Cat) ois.readObject();
            ois.close();
            fis.close();
            System.out.println(cat);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
