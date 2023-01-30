<!--
1. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

2. Дана json строка (читать из файла и сохранить в файл) (ЕСЛИ НЕ ПОЛУЧАЕТСЯ JSON, то сделайте получение через обычный текстовый файл!!!)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова",
"оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Если .txt
"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.

3. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
4*. К калькулятору из предыдущего дз добавить логирование. -->


public class home_work_2 {

    public static void main(String[] args) {
        String result = read_File("text_hw2.txt");
        // String[] array = result.split(":");
        // System.out.println(Arrays.toString(array));
        result = result.replaceAll("[{}]", "");
        System.out.println(result);

    }

    static String read_File(String file_name) {
        String string_Result = new String();
        try (FileReader reader = new FileReader(file_name)) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                string_Result += scanner.nextLine();
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return string_Result;
    }