import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTest {
  public static void main(String[] args) throws IOException {
      Person person = new Person();
      person.setName("乡盛");
      person.setAge(30);
      person.setGender("male");

      File file = new File("person");

      FileOutputStream fos = new FileOutputStream(file);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(person);
      oos.close();
  }
}