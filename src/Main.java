//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        int papers = 1025456;
        System.out.println("Значение переменной листки с типом int = " + papers + " штук");
        byte dogs = 15;
        System.out.println("Значение переменной собаки с типом byte = " + dogs + " штук");
        short sugar = 6230;
        System.out.println("Значение переменной сахар с типом short = " + sugar + " кг");
        long days = 365L;
        System.out.println("Значение переменной дни с типом long = " + days + " дней");
        float water = 1.5f;
        System.out.println("Значение переменной вода с типом float = " + water + " литров");
        double tea = 2.5;
        System.out.println("Значение переменной чай с типом double = " + tea + " кг");


        double a = 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short e = 569;
        System.out.println(e);
        short d = -159;
        System.out.println(d);
        short g = 27897;
        System.out.println(g);
        byte i = 67;
        System.out.println(i);


        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short allPapers = 480;
        int allStudents = studentsLP + studentsAS + studentsEA;
        int paperForOneStudent = allPapers / allStudents;
        System.out.println("На каждого ученика рассчитано " + paperForOneStudent + " листов бумаги");


        byte bottle = 16;
        byte time = 2;
        int bottleFor20Minutes = (bottle / time) * 20;
        System.out.println("За 20 минут машина произвела " + bottleFor20Minutes + " штук бутылок");
        int bottleForDay = ((bottle / time) * 60) * 24;
        System.out.println("За сутки машина произвела " + bottleForDay + " штук бутылок");
        int bottleFor3Days = bottleForDay * 3;
        System.out.println("За трое суток машина произвела " + bottleFor3Days + " штук бутылок");
        int bottleForMonth = bottleForDay * 30;
        System.out.println("За месяц машина произвела " + bottleForMonth + " штук бутылок");


        byte allBottles = 120;
        byte whiteBottleForOneRoom = 2;
        byte brownBottleForOneRoom = 4;
        int allRooms = allBottles / (whiteBottleForOneRoom + brownBottleForOneRoom);
        int allWhiteBottles = whiteBottleForOneRoom * allRooms;
        int allBrownBottles = brownBottleForOneRoom * allRooms;
        System.out.println("В школе, где " + allRooms + " классов, нужно " + allWhiteBottles + " банок белой краски и " + allBrownBottles + " банок коричневой краски");


        byte bananas = 5;
        int weightBanana = bananas * 80;
        short milk = 200;
        int weightMilk = (milk * 105) / 100;
        byte iceCream = 2;
        int weightIceCream = iceCream * 100;
        byte eggs = 4;
        int weightEggs = eggs * 70;
        int allWeightGram = weightBanana + weightMilk + weightIceCream + weightEggs;
        System.out.println("Вес завтрака в граммах = " + allWeightGram);
        float allWeightKilo = allWeightGram / 1000f;
        System.out.println("Вес завтрака в килограммах = " + allWeightKilo);


        byte weight = 7;
        int diet1 = 250;
        int diet2 = 500;
        int daysDiet1 = (weight * 1000) / diet1;
        System.out.println("При похудении на " + diet1 + " грамм ежедневно потребуется " + daysDiet1 + " дней");
        int daysDiet2 = (weight * 1000) / diet2;
        System.out.println("При похудении на " + diet2 + " грамм ежедневно потребуется " + daysDiet2 + " дней");
        int middleDays = (daysDiet1 + daysDiet2) / 2;
        System.out.println("В среднем для похудения потребуется " + middleDays + " день");



    }
}