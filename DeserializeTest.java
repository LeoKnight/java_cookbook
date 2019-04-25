import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeTest {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
      FileInputStream fos = new FileInputStream("person");
      ObjectInputStream oos = new ObjectInputStream(fos);
      Person person =(Person) oos.readObject();

      System.out.println(person.getName());
      System.out.println(person.getGender());
  }
}