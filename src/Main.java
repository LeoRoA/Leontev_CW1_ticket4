public class Main {
    public static void main(String[] args) {
        System.out.println("Задание для курсовой: \n" +
                "Дан массив строк, необходимо удалить из него все дубли, " +
                "оставшиеся строки объединить в одну в порядке следования в массиве.");
        String[] arr = {"arr", "vddd", "arr", "vddd", "aaa", "aaa" };
        String result = "";
        for (int i = 0; i < arr.length; i++) {                                                          //проходим по всем элементам массива
            for (int j = i+1; j < arr.length; j++) {                                                    //еще один цикл для взаимодействия со всеми последующими элементами массива
                System.out.printf("(arr[%d].equals(arr[%d])) = %b\n",i, j, (arr[i].equals(arr[j])));    //выводим значения сравнение для всего массива
                if (arr[j].equals(arr[i])){
                    arr[j] = "";                                                                        //для одинаковых 2ую делаем пустой, null нельзя, т.к. будет вызвано исключение
                }
            }
            result=result+arr[i];                                                                       //получаем результующую строку путем склеивания
        }
        System.out.println("result = " + result);
    }
}