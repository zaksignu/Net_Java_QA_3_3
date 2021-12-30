public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000;              //Размер кредита
        int timeCredit1year = 12;               //Первый расчетный период в месяцах
        int timeCredit2years = 24;              //Второй расчетный период в месяцах
        int timeCredit3years = 36;              //Третий расчетный период в месяцах
        double interestRate = 9.99;             //Годовая процентная ставка
        System.out.print("Для кредита " + credit + " руб. со ставкой " + interestRate + "% годовых на " + timeCredit1year + "мес. платеж будет ");
        System.out.println(service.calculate(interestRate, timeCredit1year, credit));
        System.out.print("Для кредита " + credit + " руб. со ставкой " + interestRate + "% годовых на " + timeCredit1year + "мес. платеж будет ");
        System.out.println(service.calculate(interestRate, timeCredit2years, credit));
        System.out.print("Для кредита " + credit + " руб. со ставкой " + interestRate + "% годовых на " + timeCredit1year + "мес. платеж будет ");
        System.out.println(service.calculate(interestRate, timeCredit3years, credit));
    }
}
