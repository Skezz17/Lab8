@FunctionalInterface
interface StringBuilder {
    String apply(String str);
}

class StringBuilderUtil {
    public static String processString(String str, StringBuilder operation) {
        return operation.apply(str);
    }
}

public class Main {
    public static void main(String[] args) {
        String input = "  Hello, World!  ";

        StringBuilder toUpper = str -> str.toUpperCase();
        StringBuilder toLower = str -> str.toLowerCase();
        StringBuilder trim = str -> str.trim();
        StringBuilder reverse = str -> new java.lang.StringBuilder(str).reverse().toString();

        System.out.println("Исходная строка: \"" + input + "\"");
        System.out.println("Верхний регистр: \"" + StringBuilderUtil.processString(input, toUpper) + "\"");
        System.out.println("Нижний регистр: \"" + StringBuilderUtil.processString(input, toLower) + "\"");
        System.out.println("Удаление пробелов: \"" + StringBuilderUtil.processString(input, trim) + "\"");
        System.out.println("Обратный порядок: \"" + StringBuilderUtil.processString(input, reverse) + "\"");
    }
}