import java.util.Objects;
class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        String ans="";
        findException(operation);
       
                
            switch(operation) {
                case "+": ans=operand1+" + "+operand2+" = "+(operand1+operand2);
                            break;
                case "*": ans=operand1+" * "+operand2+" = " +(operand1*operand2);
                          break;
                case "/":
                    try {
                        ans=operand1+" / "+operand2+" = "+(operand1/operand2);
                        }
                  catch(ArithmeticException e){
            throw new IllegalOperationException("Division by zero is not allowed", e);
                   }
                        break;
default:throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation ));     
            }
        
        return ans;
    }
    private void findException(String operation) {
        if(Objects.isNull(operation)){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if(operation.isEmpty()){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
    }
}
