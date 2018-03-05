import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
// далее пользователь вводит нужное имя, далее программа отображает всех пациентов с данным именем (тоже самое сделать для возраста).
        Patient patient0 = new Patient();

        Patient patient1 = new Patient();

        Patient patient2 = new Patient();

        patient0.info();
        patient1.info();
        patient2.info();
        System.out.println("\n"+ "для поиска введите возраст пациента");
        Scanner searchByAge = new Scanner(System.in);
        int patientAge = searchByAge.nextInt();
        if (patientAge == patient0.getAge()){
            patient0.info();
        }else if (patientAge == patient1.getAge()){
            patient1.info();
        }else if (patientAge == patient2.getAge()){
            patient2.info();
        }else System.out.println("никого не найдено");

    }

}
