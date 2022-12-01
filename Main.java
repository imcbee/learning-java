class Main {
    public static void main(String[] args) {
        //? Implicit Type Conversion
        int number1 = 5;
        double number2 = number1;
    
        System.out.println(number2); //this will print 5.0

        //? Explicit Type Conversion
        double number3 = 5.8;
        int number4 = number3;
    
        System.out.println(number3); //this will print an error
      // but you can print explicitly below

    }
  }