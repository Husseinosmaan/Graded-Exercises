class payment{
    void pay(double amount){
        System.out.println("Processing Payment:"+amount);
    }
}

class creditCard extends payment{
    @Override
    void pay(double amount){
        //super.pay(amount);
        System.out.println("paid $"+amount+"Using creditCard");
    }
}

class paypal extends payment{
    @Override
    void pay(double amount){
        //super.pay(amount);
        System.out.println("paid $"+amount+"Using paypal");
    }
}

public class overloadingexamples {
    static void main(){
        payment p1 = new creditCard();
        payment p2 = new paypal();
        p1.pay(100);
        p2.pay(222);

    }
}
