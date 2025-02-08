
public class PaymentGatewayAPI {

    private static PaymentGatewayAPI paymentGatewayAPIInstance = null;

    private PaymentGatewayAPI() {

    }

    public static PaymentGatewayAPI getInstance() {

        if(paymentGatewayAPIInstance == null ) {

            synchronized (PaymentGatewayAPI.class){

                if(paymentGatewayAPIInstance == null) {
                    paymentGatewayAPIInstance = new PaymentGatewayAPI();
                }
            }
        }

        return paymentGatewayAPIInstance;
    }
}



/**
I was writing this Singleton java class for the first time ,  
and i came across a compilation error . 

In the static method of getInstance() ----> 
 synchronized (this)  : I was using (this) and it was throwing me a compilation error . 

******
 Upon googling I found out that i was using the static method of the class and I cannot reference "this" keyword . Because its an instance level keyword . 
 Hence I need to use synchronized (PaymentGatewayAPI.class) instead to using synchronised in the static keyword .

**/
