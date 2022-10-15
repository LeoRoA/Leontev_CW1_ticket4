import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание для курсовой: \n" +
                "Дан массив строк, необходимо удалить из него все дубли, " +
                "оставшиеся строки объединить в одну в порядке следования в массиве.");
        String[] arr = {"arr", "vddd", "arr", "vddd", "aaa", "aaa"};
        //Вариант 1
        String result1 = "";
        for (int i = 0; i < arr.length; i++) {                                                              //проходим по всем элементам массива
            for (int j = i + 1; j < arr.length; j++) {                                                      //еще один цикл для взаимодействия со всеми последующими элементами массива
                //System.out.printf("(arr[%d].equals(arr[%d])) = %b\n", i, j, (arr[i].equals(arr[j])));     //выводим значения сравнение элемента на позиции  для всего массива
                if (j!=i && arr[j].equals(arr[i])) {                                                        //сравниваем текущий элемент i с другими элементами, с позицией отличной от i
                    arr[j] = "";                                                                            //для одинаковых j-ую позицию делаем пустой, null нельзя, т.к. будет вызвано исключение
                }
            }
            result1 += arr[i];                                                                               //получаем результующую строку путем склеивания
        }
        System.out.println("result1 = " + result1);

        //Вариант 2
        String result2 = "";
        for (int i = 0; i < arr.length; i++) {                                                              //проходим по всем элементам массива
            if (!result2.contains(arr[i])) {                                                                //проверяем наличие в строке result2 подстраки из элемента массива
                result2 += arr[i];                                                                          //при его отсуствтии добавлем путем склеивания
            }
        }
        System.out.println("result2 = " + result2);

        //Вариант 3
        String result3 = "";
        String arrStr = Arrays.toString(arr);                                                               //переводим весь массив в строку
        arrStr = arrStr.replace(" ", "");                                                   //исключаем из строки пробелы
        //System.out.println("Start arrStr = " + arrStr);                                                   //выводим строку на экран
        for (int i = arr.length - 1; i > 0; i--) {                                                          //проходим по всем элементам массива в обратном порядке
            arrStr = arrStr.substring(0, arrStr.length() - arr[i].length() - 1);                            //обрезаем строку на длину равную длине подстроки в элементе массива
            //System.out.println("arrStr = " + arrStr);                                                     //выводим на экран для проверки корректного получения новой строки
            if (arrStr.contains(arr[i])) {                                                                  //проверка в новой строке наличия подстроки из элемента массива
                arr[i] = "";                                                                                //в случае наличия, обнуляем элемент
            }
        }
        for (int i = 0; i < arr.length; i++) {
            result3 += arr[i];                                                                              //для вывода путем склеивания используем цикл в прямом порядке перебора элементов
        }
        System.out.println("result3 = " + result3);
    }
}
