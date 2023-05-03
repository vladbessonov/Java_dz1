package dz1;
import java.util.*;
public class z1 {
    public static void main(String[] args) {
        String s = "  the    sky is blue    ";
        System.out.println(s);
        String filtered = s.trim().replaceAll("\\s+", " ");
        //System.out.println(filtered);
        String[] arr = filtered.split(" ");
        //System.out.println(Arrays.toString(arr));
        revers(arr);
        //System.out.println(Arrays.toString(arr));
        String arrayToString = String.join(" ", arr);
        System.out.println(arrayToString);
    }
    public static void revers(String[] arr) {
        String[] temp = new String[arr.length];
        for (int i = 0; i< arr.length; i++) {
            temp[arr.length - 1 - i] = arr[i];
        }
        for (int i = 0; i< arr.length; i++) {
            arr[i] = temp[i];
        }
    }

}
/**
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
 * The returned string should only have a single space separating the words. Do not include any extra spaces.
 *
 * Получив входную строку s, измените порядок слов в обратном порядке.
 * Слово определяется как последовательность символов без пробелов.
 * Слова в s должны быть разделены по крайней мере одним пробелом.
 * Возвращает строку слов в обратном порядке, объединенную одним пробелом.
 * Обратите внимание, что s это может содержать начальные или конечные пробелы или несколько пробелов между двумя словами.
 * Возвращаемая строка должна содержать только один пробел, разделяющий слова. Не добавляйте никаких дополнительных пробелов.
 */