import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numbers[] = {-43,-53,-3,-13,-38,-4,-24};
        double max = -1.0/0.0; // -infinity
        for (int i = 0; i < numbers.length; i++) {
            if(max < numbers[i] && numbers[i]%2==0) max = numbers[i];
        }
        System.out.println(max);


        /*int numbers[] = {5,4,4,3,5,5,5,5,5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // sum = sum + numbers[i];
        }

        System.out.println(Math.round((float) sum/numbers.length));*/



        /*Scanner scanner = new Scanner(System.in);
        String lastnames[] = {"Иванов","Петров","Сидоров","Козлов"};
        System.out.print("Введите фамилию для поиска: ");
        String lastname = scanner.nextLine();

        for(int i = 0; i<lastnames.length; i++){
            if(lastname.equals(lastnames[i])) {
                System.out.println("Совпадение найдено, индекс элемента: " + i);
                break;
            }
            else if (i==lastnames.length-1)
                System.out.println("Совпадений не найдено");
        }*/


        /*int i = 0;
        while (i<3){
            System.out.println(lastnames[i]);
            i = i + 1;
        }
        */
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите Пароль: ");
        String password = scanner.nextLine();

        if (login.equals("admin") && password.equals("123")) System.out.println("Доступ разрешен");
        else System.out.println("Доступ запрещен");
        */


        /*int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1>num2){
            System.out.println(num1+">"+num2);
        }else if (num1<num2){
            System.out.println(num1+"<"+num2);
        }else{
            System.out.println(num1+"=="+num2);
        }*/
    }
}
