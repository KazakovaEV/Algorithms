
public class AscendingSequence {

    public int [] ascendingSequence(int start, int end, int step) {
        if (step > 0 && start < end) {
            int[] result = new int[(end - start + 1) / step];
//            деление на step добавили после теста stepTwo, потому что иначе шаг
//            менялся (уыеличивался), а длина массива оставалась прежней, получался
//            массив ожидаемый с меньшим количеством ячеек, а по методу ожидался
//            как с шагом 1, последовательно от start до end. Если разделить на шаг,
//            то получим правильное количество ячеек. При делении на 1
//            длина все равно не уменьшится.

            //            если начинать со старта, то инлекс i - это значение, а не индекс массива
//более легкий вариант
            for(int i = 0; i < result.length; i ++) {
                if (start <= end) {
                    result[i] = start;
                    start += step;
                }
//                если мы идем по индексам значений (от старта до энда)
            }
            return result;

        }
        return new int[] {};
//        если условия не выполняются, то создается пустой массив
    }

    //менее легкий, ненужный j
//            int j = 0;
//
//            for(int i = start; i <= end; i += step) {
//                if (j < result.length) {
//                    result [j] = i;
//                    j = ++;
//                }
//            }
//            return result;
//            return new int[] {};


}

