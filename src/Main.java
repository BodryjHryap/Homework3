public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int first = 1014134;
        System.out.println("Значение переменной first с типом: int равно " + first);
        byte second = 127;
        System.out.println("Значение переменной second с типом: byte равно " + second);
        short third = 12911;
        System.out.println("Значение переменной third с типом: short равно " + third);
        long fourth = 1431418881;
        System.out.println("Значение переменной fourth с типом: long равно " + fourth);
        float fifth = 3.12F;
        System.out.println("Значение переменной fifth с типом: float равно " + fifth);
        double sixth = 3.5451;
        System.out.println("Значение переменной sixth с типом: double равно " + sixth);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float first = 27.12F;
        System.out.println("Значение переменной first равно " + first);
        long second = 987678965549L;
        System.out.println("Значение переменной second равно " + second);
        float third = 2.786F;
        System.out.println("Значение переменной third равно " + third);
        short fourth = 569;
        System.out.println("Значение переменной fourth равно " + fourth);
        short fifth = -159;
        System.out.println("Значение переменной fifth равно " + fifth);
        short sixth = 27897;
        System.out.println("Значение переменной sixth равно " + sixth);
        byte seventh = 67;
        System.out.println("Значение переменной seventh равно " + seventh);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte firstTeacherStudents = 23;
        byte secondTeacherStudents = 27;
        byte thirdTeacherStudents = 30;
        short paperQuantity = 480;
        System.out.println("На каждого ученика рассчитано " + paperQuantity/(firstTeacherStudents+secondTeacherStudents+thirdTeacherStudents) + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte performancePerMinute = 16 / 2;
        int performancePerDay = performancePerMinute * 60 * 24;
        int performancePerMonth = performancePerDay * 30;
        System.out.println("За 20 минут машина произвела " + performancePerMinute * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + performancePerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + performancePerDay * 3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + performancePerMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte cansOfPaint = 120;
        byte brownPaintOnGrade = 4;
        byte whitePaintOnGrade = 2;
        int totalGrades = cansOfPaint/(brownPaintOnGrade + whitePaintOnGrade);
        int totalBrownPaint = totalGrades * brownPaintOnGrade;
        int totalWhitePaint = totalGrades * whitePaintOnGrade;
        System.out.println("В школе, где " + totalGrades + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggsWeight = 70;
        byte bananaCount = 5;
        byte milkCount = 2;
        byte iceCreamCount = 2;
        byte eggsCount = 4;
        int totalWeight = bananaWeight * bananaCount + milkWeight * milkCount + iceCreamWeight * iceCreamCount + eggsWeight * eggsCount;
        float totalWeightInKilos = totalWeight/1000F;
        System.out.println("Вес " + totalWeight + " граммов такого спортзавтрака");
        System.out.println("Вес " + totalWeightInKilos + " килограммов такого спортзавтрака");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        short aMethod = 250;
        short bMethod = 500;
        short needToLoseWeightBy = 7;
        System.out.println(needToLoseWeightBy/(aMethod/1000F) + " дней понадобиться на сброс 7кг, худея на 250 грамм в день");
        System.out.println(needToLoseWeightBy/(bMethod/1000F) + " дней понадобиться на сброс 7кг, худея на 250 грамм в день");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int mariaSallary = 67760;
        int denisSallary = 83690;
        int kristinaSallary = 76230;
        float sallaryFactor = 1.1F;
        float newMariaSallary = mariaSallary * sallaryFactor;
        float newDenisSallary = denisSallary * sallaryFactor;
        float newKristinaSallary = kristinaSallary * sallaryFactor;
        System.out.println("Маша теперь получает " + newMariaSallary + " рублей. Годовой доход вырос на " + (newMariaSallary * 12 - mariaSallary * 12) + " рублей");
        System.out.println("Денис теперь получает " + newDenisSallary + " рублей. Годовой доход вырос на " + (newDenisSallary * 12 - denisSallary * 12) + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSallary + " рублей. Годовой доход вырос на " + (newKristinaSallary * 12 - kristinaSallary * 12) + " рублей");
    }
}