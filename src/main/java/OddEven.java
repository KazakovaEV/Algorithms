public class OddEven {

//    Создать алгоритм OddEven, который принимает на вход целое число,
//    возвращает “Odd”,  если число нечетное, и “Even”, если число четное.
//    Во всех остальных случаях результат будет “Undefined”.
//
//Test Data:
//-345 →  “Odd”
//0 →  “Even”
//222222 →  “Even”
//2147483647 + 1 →  “Undefined”

    public String OddEvenAlgorithm (long number) {
        String result = " ";
        if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE) {
            result = "Undefined";
        } else if (number % 2 == 0) {
            result = "Even";
        } else if (number % 2 !=0) {
            result = "Odd";
        }
        return result;
    }
//
//    public void OddEvenAlgorithm(int number) {
//        if (number > Integer.MAX_VALUE && number < Integer.MIN_VALUE) {
//            System.out.println("Undefined");
//        } else if (number % 2 == 0) {
//            System.out.println("Even");
//        } else if (number % 2 !=0) {
//            System.out.println("Odd");
//        }
//    }
}
