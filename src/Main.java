public class Main {
    public static void main(String[] args) {

        // 1
        byte a = 4;
        short b = 32000;
        int c = 2000000000;
        long d = 9000000000000000000L;

        float e = -2.326458276f;
        double f = 57.5867498567490385739458367898;

        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        // 2
        float aa = 27.12f;
        long bb = 987678965549L;
        double cc = 2.786f;
        short dd = 569;
        short ee = -159;
        int ff = 27897;
        byte gg = 67;

        // 3
        byte classLudmila = 23;
        byte classAnna = 27;
        byte classEkaterina = 30;
        short totalPaper = 480;
        int paperForStudent = totalPaper / (classLudmila + classAnna + classEkaterina);

        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");

        // 4
        int bottleNumber = 16;
        int time = 2;
        int bottleInTime = bottleNumber / time;
        int time20Min = 20;
        int timeDay = 24 * 60;
        int timeDay3 = 3 * 24 * 60;
        int timeMonth = 30 * 24 * 60;

        int bottleTime20 = time20Min * bottleInTime;
        int bottleTimeDay = timeDay * bottleInTime;
        int bottleTimeDay3 = timeDay3 * bottleInTime;
        int bottleTimeMonth = timeMonth * bottleInTime;

        System.out.println("За 20 минут машина произвела " + bottleTime20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleTimeDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleTimeDay3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottleTimeMonth + " штук бутылок");

        // 5
        int totalPaint = 120;
        int classWhitePaint = 2;
        int classBrownPaint = 4;

        int classNumber = totalPaint / (classWhitePaint + classBrownPaint);
        int totalWhitePaint = classNumber * classWhitePaint;
        int totalBrownPaint = classNumber * classBrownPaint;

        System.out.println("В школе, где " + classNumber + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        // 6
        int bananaNumber = 5;
        int bananaWeight = 80;
        int milkNumber = 2;
        int milkWeight = 105;
        int iceCreamNumber = 2;
        int iceCreamWeight = 100;
        int eggNumber = 4;
        int eggWeight = 70;

        int totalWeightG = bananaNumber * bananaWeight + milkNumber * milkWeight + iceCreamNumber * iceCreamWeight + eggNumber * eggWeight;
        float totalWeightKg = totalWeightG / 1000f;

        System.out.println("Вес спортзавтрака " + totalWeightG + " грамм, что составляет " + totalWeightKg + " килограмм");

        // 7
        int weightLostKg = 7;
        int lostMin = 250;
        int lostMax = 500;

        int dayLost250g = weightLostKg * 1000 / lostMin;
        int dayLost500g = weightLostKg * 1000 / lostMax;
        float dayLostAverage = (dayLost250g + dayLost500g) / 2f;

        System.out.println("При потере " + lostMin + " грамм в день на похудение потребуется " + dayLost250g + " дней");
        System.out.println("При потере " + lostMax + " грамм в день на похудение потребуется " + dayLost500g + " дней");
        System.out.println("В среднем похудение займет " + dayLostAverage + " дней");

        // 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int extraPay = 10;

        int newSalaryMasha = salaryMasha / 100 * extraPay + salaryMasha;
        int newSalaryDenis = salaryDenis / 100 * extraPay + salaryDenis;
        int newSalaryKristina = salaryKristina / 100 * extraPay + salaryKristina;

        int diffMasha = (newSalaryMasha - salaryMasha) * 12;
        int diffDenis = (newSalaryDenis - salaryDenis) * 12;
        int diffKristina = (newSalaryKristina - salaryKristina) * 12;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + diffMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + diffDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + diffKristina + " рублей");
    }
}

