package javaPractice.interfaces;

public class DevelopingBankClient implements BankClientInterface, InvestClientInterface{

    public static void main (String[] args) {

        DevelopingBankClient devClient = new DevelopingBankClient();
        devClient.checkBalance();
        devClient.payCreditCard();
        devClient.transferBalance();
        devClient.newFeature1();

        BankClientInterface bankClient = new DevelopingBankClient();
        bankClient.checkBalance();
        bankClient.payCreditCard();
        bankClient.transferBalance();

        InvestClientInterface investClient = new DevelopingBankClient();
        investClient.investMoney();

    }

    @Override
    public void payCreditCard() {

        System.out.println("Pay Credit Card");

    }

    @Override
    public void transferBalance() {

        System.out.println("Transfer Balance");

    }

    @Override
    public void checkBalance() {

        System.out.println("Check Balance");

    }

    public void newFeature1() {

        System.out.println("New developing features");

    }

    @Override
    public void investMoney() {

        System.out.println("Invest money from Investment client");

    }
}
