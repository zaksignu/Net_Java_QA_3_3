public class CreditPaymentService {
    double calculate(double interestRate, int timeOfCredit, double creditSize) {
        double interestRateDefine = interestRate / (100 * 12);       //приводим годовую процентную ставку к помесячной
        //Для расчета ежемесячного аннуитетного платежа использовалась формула отсюда - https://www.banki.ru/wikibank/annuitetnyie_plateji_po_kreditu/
        return creditSize * (interestRateDefine * Math.pow((1 + interestRateDefine), timeOfCredit)) / (Math.pow((1 + interestRateDefine), timeOfCredit) - 1);
    }
}
