public class Person {

    // precisamos do nome e do moneyInWallet para poder receber e enviar dinheiro para a carteira
    String name;
    int money;
    Bank creditCard;
    Wallet moneyInWallet;




    //construtor
    public Person(String name, int moneyInWallet, Bank creditCard) {
        this.name = name;
        this.money = moneyInWallet;
        this.creditCard = creditCard;

    }

    public String getName() {
        return name;
    }
        public int getMoneyInWallet() {
            return money;
        }


        public static int comprar() {
                // este metodo vai realizar compras ou seja vamos SUBTRAIR à variavel moneyInWallet algum valor
return 0;
        }
        public int goBankGetMoney() {
            creditCard.withrall(0);
            return creditCard.getActualMoneyMoney();
        }

    public int insertMoneyInWallet() {
        ;
        return moneyInWallet.getCurrentMoney();
    }

    }

    //este metodo vai servir para ir ao banco e recarregar dinheiro, levantar dinheiro


