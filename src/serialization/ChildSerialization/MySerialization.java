package serialization.ChildSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
            e.printStackTrace();
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
            e.printStackTrace();
        }
    }
}
