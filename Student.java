public class Student {

  private String Name;
  private String Lastname;
  private String Data;
  private int Age;

  public Student(String name,String lastname,String data, int age) {
    Name = name;
    Lastname = lastname;
    Data = data;
    Age = age;
  }

  public String GetName() {return Name;}
  public String GetLastname() {return Lastname;}
  public String GetData() {return Data;}
  public int GetAge() {return Age;}

  public String ToString() {
    return Name + " " + Lastname + " " + Data + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error","Parse Error","Parse Error" ,-1);
    return new Student(data[0],data[1],data[2], Integer.parseInt(data[3]));
  }
}