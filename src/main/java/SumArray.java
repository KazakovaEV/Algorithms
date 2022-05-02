public class SumArray {
//    Написать алгоритм SumArray, который возвращает сумму всех чисел массива
//

    public double SumArrayAlgorithm (double array[]) {
        if (array.length == 0) {

            return 0;
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
//            sum += array[i]; Это аналог предыдущей строки
        }
        return sum;
    }
//    проверка для гита
}
