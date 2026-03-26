package serialization.ChildSerialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cat extends Animal implements Serializable {

    private String color;
    private String type;

    public Cat(String name, int age, String color,String type) {
        super(name, age);
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private void writeObject(ObjectOutputStream out) throws IOException{
        out.defaultWriteObject();
        out.writeObject(getName());
        out.writeObject(getAge());
        out.writeObject(getColor());
        out.writeObject(getType());
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
        in.defaultReadObject();
        setName((String) in.readObject());
        setAge((int) in.readObject());
        setColor((String) in.readObject());
        setType((String) in.readObject());
    }

    @Override
    public String toString() {
        return "Cat {\n Name: " + getName() + "\n Color: "+ getColor() +" \n Age: "+ getAge() +"\nType: " + getType() +"\n} ";
    }
}
