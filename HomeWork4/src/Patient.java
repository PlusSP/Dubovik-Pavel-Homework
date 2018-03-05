import java.util.Scanner;
public class Patient {
//    Вам необходимо создать программу с 1-м собственным объектом (классом):
//    Пациент (то что мы сделали на занятии, но на примере Студента).
//    В объекте вам нужно описать переменные характерные для данной сущности, например у пациента могут быть переменные ФИО, возраст, диагноз и тд.
//    В классе должны быть обязательно переменные типов int, String, boolean.
//
//    Далее в основном классе(файле) вы должны создать минимум 3 объекта Пациента  и заполнить их данными из консоли (ввод данных сделать в красивом виде).
//
//    После ввода данных вы должны вывести данные на экран в следующем виде:
//    Пациент “ФИО” - Возраст = “возраст”
//
//    Далее вы должны дать пользователю возможность найти пациента по фамилии и по возрасту. Тоесть в консоли должно появится предложение найти пользователя по ФИО или по возрасту,
//    далее пользователь вводит нужное имя, далее программа отображает всех пациентов с данным именем (тоже самое сделать для возраста).

    private int age;
    private String firstName;
    private String lastName;
    private String anamnez;
    private boolean inHospital;

    public Patient (){
        System.out.println("введите имя пациента");
        Scanner scannerFirstName = new Scanner(System.in);
        this.firstName = scannerFirstName.nextLine();
        System.out.println("введите фамилию пациента");
        Scanner scannerLastName = new Scanner(System.in);
        this.lastName = scannerLastName.nextLine();
        System.out.println("введите возраст пациента");
        Scanner scannerAge = new Scanner(System.in);
        this.age = scannerAge.nextInt();
        System.out.println("введите диагноз пациента");
        Scanner scannerAnamnez = new Scanner(System.in);
        this.anamnez = scannerAnamnez.nextLine();
        System.out.println("находится ли пациент в больнице(true/false)");
        Scanner scannerInHospital = new Scanner(System.in);
        this.inHospital = scannerInHospital.nextBoolean();
    }
    public void setAge (int age){this.age = age;}
    public void setFirstName (String firstName){this.firstName = firstName;}
    public void setLastName (String lastName){this.lastName = lastName;}
    public void setAnamnez (String anamnez){this.anamnez = anamnez;}
    public void setInHospital (boolean inHospital){this.inHospital = inHospital;}
    public void info(){
        System.out.println("Пациент: "+ firstName+" "+ lastName + "\n"+ "возраст: "+ age+ "\n"+"диагноз: "+anamnez);
        if(inHospital)
            System.out.println("находится в больнице");
        else System.out.println("выписан");
    }
    public int getAge(){this.age = age;
    return age;}


}
