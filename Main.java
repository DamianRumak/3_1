import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service1 s = new Service1();
      s.addStudent(new Student("Krzysztof","aa","data", 20));
      s.addStudent(new Student("Janusz", "bb","data",40));

      String imie;
      String nazwisko;
      String data;
      int wiek;
      int i=0;
      while(i==0){
        System.out.println("Dodawanie studenta WYBIERZ 1:  ");
        System.out.println("Lista studentów WYBIERZ 2: ");
        System.out.println("Koniec programu WYBIERZ 3: ");
        int wybierz;
        Scanner sc = new Scanner(System.in);
        wybierz =sc.nextInt();
          switch(wybierz){
            case 1:
              System.out.println("Podaj imie: ");
              imie=sc.next();
              System.out.println("Podaj nazwisko: ");
              nazwisko=sc.next();
              System.out.println("Podaj date: ");
              data=sc.next();
              System.out.println("Podaj wiek: ");
              wiek=sc.nextInt();
              s.addStudent(new Student(imie,nazwisko,data,wiek));
              break;
            
            case 2:{
              var students = s.getStudents();
              for(Student current : students) {
              System.out.println(current.ToString());
                }
            break;}
            case 3:{
              i++;
              System.out.println("KONIEC PROGRAMU");
              break;
      
            }
          }  
      }
      
    } catch (IOException e) {

    }
  }
}