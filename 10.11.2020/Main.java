import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getChange(23);
    }

    public static void getChange(int money){
        if(money >= 10){
            System.out.println(10);
            getChange(money-10);
        }else if(money>=5){
            System.out.println(5);
            getChange(money-5);
        }else if(money>=2){
            System.out.println(2);
            getChange(money-2);
        }else if(money>=1){
            System.out.println(1);
        }
        System.out.println("Метод getChange("+money+") выполнен");
    }
    //getChange(23)->getChange(13)->getChange(3)->getChange(1)


    /*public static void main(String[] args) {
        System.out.println(sum(654234)); //
        System.out.println(sum(1231)); //
        System.out.println(sum(234)); //
        System.out.println(sum(257432143)); //
    }

    public static int sum(int num){
        int result = 0;
        String str = Integer.toString(num);
        for (int i = 0; i < str.length(); i++) {
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return result;
    }*/

/*    public static void main(String[] args) {
        int oleg[] = {4,4,5,5,3,4,5,5,5,5};
        int olga[] = {3,3,5,5,5,5,5,5,5,5};
        int maks[] = {4,4,4,4,4,3,3,4,4,4};
        int ivan[] = {4,5,5,5,5,4,5,5,5,5};
        System.out.println(
                "Оценки за четверть: \n"+
                "Олег: "+average(oleg)+"\n" +
                "Ольга: "+average(olga)+"\n" +
                "Макс: "+average(maks)+"\n" +
                "Иван: "+average(ivan)+"\n" +
                "Журнал оценок за II четверть"
        );
    }
    public static double average(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return Math.round((double) sum / numbers.length);
    }*/


/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 4.2;
        double num2 = 4.6;
        int num3 = 58;
        int num4 = 54;
        System.out.println(getMin(num3,num4));
        System.out.println(getMin(num1,num2));
        System.out.println(getMin(num1,num4));
    }
    public static double getMin(double a,double b){
        if(a<b) return a;
        else if (a>b) return b;
        else return a; // Если равны вернём любое
    }
    public static int getMin(int a,int b){
        if(a<b) return a;
        else if (a>b) return b;
        else return a; // Если равны вернём любое
    }*/

}
