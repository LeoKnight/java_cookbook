import java.io.Serializable;

public class Person implements Serializable {
  private static final long serialVersionUID = 1747099703121279605L;
  private String gender;
  private int age;
  private String name;
  //ignore setters and getters
public void setName(String string) {
  this.name = string;
}
public void setAge(int i) {
  this.age = i;
}
public void setGender(String string) {
  this.gender = string;
}
public String getName() {
	return this.name;
}
public String getGender() {
	return this.gender;
}
}