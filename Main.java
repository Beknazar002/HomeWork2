import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int temperature1 = 20;
        System.out.println(goForWalk(generateRandomAge(), temperature1));

        int temperature2 = 25;
        System.out.println(goForWalk(generateRandomAge(), temperature2));

        int temperature3 = 15;
        System.out.println(goForWalk(generateRandomAge(), temperature3));

        int temperature4 = 10;
        System.out.println(goForWalk(generateRandomAge(), temperature4));

        int temperature5 = 5;
        System.out.println(goForWalk(generateRandomAge(), temperature5));
    }

    public static int generateRandomAge() {
        Random rand = new Random();
        int minAge = 1;
        int maxAge = 100;
        return rand.nextInt(maxAge - minAge + 1) + minAge;
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


