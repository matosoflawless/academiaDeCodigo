public class Main {
    public static void main(String[] args) {


        Bank creditcard = new Bank(20);
        Person person1 = new Person("João",0,creditcard);
        Wallet saco = new Wallet();
        System.out.println("O João foi ao banco e levantou 20 euros");
        creditcard.withrall(20);
        saco.setMoneyInWallet(20);
        System.out.println("Na sua conta bancária ficaram " + creditcard.getActualMoneyMoney() + " euros");
        System.out.println("Na sua carteira contem agora " + saco.getCurrentMoney());
        System.out.println("Recebeu um bonus do banco de 40 euros ficando assim com " + creditcard.deposit(40) + " na sua conta");
        System.out.println("Sendo assim o " + person1.getName() + " levantou mais 40 euros para gastar");
        creditcard.withrall(80);
        System.out.println("A conta ficou com " + creditcard.getActualMoneyMoney());
        System.out.println("Por ter levantado um total de 100 euros o seu banco oferece mais 200");
        creditcard.deposit(100);
        System.out.println("Sendo assim a sua conta ficou com " + creditcard.getActualMoneyMoney());
        creditcard.withrall(100);
        System.out.println("E o João levanta mais 100 e a conta fica com " + creditcard.getActualMoneyMoney());



    }
}