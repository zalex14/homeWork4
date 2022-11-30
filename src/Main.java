public class Main {
    public static void main(String[] args) {
        // Условный оператор. Часть 2 Домашняя работа
        // Задание 1 Определяем, чем пользуется клиент (iOS или Android)
        System.out.println("Условный оператор. Часть 2 Домашняя работа. Задание 1 ");
        int clientOS = 1;   // 0 — iOS, 1 — Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    // Задание 2
    // Cообщение клиенту при наличии двух условий — операционной системы телефона (iOS или Android) и года производства
        System.out.println("Задание 2 ");
        int clientDeviceYear = 2015;
        String versionOperationSystem;
        String versionFull;
        clientOS = 0;

        if (clientOS == 0) {
            versionOperationSystem = "iOS" ;
        }
        else {
            versionOperationSystem = "Android" ;
        }

        if ( clientDeviceYear < 2015 )  {
            versionFull = " облегченную ";
        }
        else {
            versionFull = " ";
        }
        System.out.println( "Установите" + versionFull + "версию приложения для " + versionOperationSystem + " по ссылке");

    // Задание 3
    // Является ли год високосным или нет
        System.out.println("Задание 3 ");
        int year = 2021;
        if ( (year %4 == 0 && year % 100 !=0 ) || (year %100==0 && year %400 ==0) ) {
            System.out.println( year + " год является високосным" );
        }
        else {
            System.out.println( year + " год не является високосным" );
        }

    // Задание 4
    // Срок доставки банковских карт на дом
        System.out.println("Задание 4 ");
        int deliveryDistance = 95 ;
        int deliveryDays = 1 ;
        if ( deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays += 1;
        }
        else if ( deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays += 2;
        }
        System.out.println("Потребуется дней: " + deliveryDays );

    // Задание 5
    // К какому сезону принадлежит месяц по номеру
        System.out.println("Задание 5 ");
        int monthNumber = 12 ;
        switch (monthNumber) {
            case 1: case 2: case 12:
                System.out.println( monthNumber + " месяц принадлежит к сезону зима");
            break;
            case 3: case 4: case 5:
                System.out.println( monthNumber + " месяц принадлежит к сезону весна");
            break;
            case 6: case 7: case 8:
                System.out.println( monthNumber + " месяц принадлежит к сезону лето");
            break;
            case 9: case 10: case 11:
                System.out.println( monthNumber + " месяц принадлежит к сезону осень");
            break;
            default:
            break;
        }

    }
}