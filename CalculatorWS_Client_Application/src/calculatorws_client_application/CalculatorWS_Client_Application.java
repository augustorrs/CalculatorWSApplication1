package calculatorws_client_application;

/**
 *
 * @author Augusto Souza 2017376
 */
public class CalculatorWS_Client_Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 3;
        int j = 4;
        int result = add(i, j);
        
        
    System.out.println("Result = " + result);
    }

    private static int add(int i, int j) {
        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.add(i, j);
    }
    
}
