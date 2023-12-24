public class Main {
    public static void main(String[] args) {
        int age1 = 25;
        int temperature1 = 20;
        System.out.println(goForWalk(age1, temperature1));

        int age2 = 18;
        int temperature2 = 25;
        System.out.println(goForWalk(age2, temperature2));

        int age3 = 50;
        int temperature3 = 15;
        System.out.println(goForWalk(age3, temperature3));

        int age4 = 30;
        int temperature4 = 10;
        System.out.println(goForWalk(age4, temperature4));

        int age5 = 40;
        int temperature5 = 5;
        System.out.println(goForWalk(age5, temperature5));
    }

    public static String goForWalk(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}









