public class JavaBasic {
    public static void main(String[] args) {
        //данные примитивных типов
        char chara = 'c';

        byte bytea = 3;
        int inta = 10;
        long longa = 30L;

        float floata = 44.2f;
        double doubla = 1.11;

        boolean boolTrue = true;
        boolean boolFalse = false;

        //примеры арифметических действий
        System.out.println("Арифметические действия:");
        System.out.println("Сложение int + long = " + (inta + longa));
        System.out.println("Вычитание int - long = " + (inta - longa));
        System.out.println("Умножение int * long = " + (inta * longa));
        System.out.println("Деление long / int = " + (longa / inta));
        System.out.println("Деление по модулю long % byte = " + (longa % bytea));
        System.out.println("Увеличить на единицу int++   = " +  (inta++));
        System.out.println("Уменьшить на единицу int--   = " +  (inta--));
        System.out.println("Вычесть единицу --int   = " +  (--inta));
        System.out.println("Добавить единицу ++int   = " +  (++inta));

        //примеры сравнений
        System.out.println("Сравнения:");
        System.out.println("Проверка равенства: " + chara + " == " + chara + " = " + (chara == chara));
        System.out.println("Проверка не равенства: " + chara + " != " + chara + " = " + (chara != chara));
        System.out.println("Проверка на больше: " + longa + " > " + longa + " = " + (longa > inta));
        System.out.println("Проверка на меньше: " + longa + " < " + inta + " = " + (longa < inta));
        System.out.println("Проверка на больше либо равно: " + bytea + " >= " + 5*bytea + " = " + (bytea >= 5*bytea));
        System.out.println("Проверка на меньше либо равно: " + bytea + " <= " + 3*bytea + " = " + (bytea <= 3*bytea));

        // и/ или/ не примеры
        System.out.println("Логические операции:");
        System.out.println("Операция 'И': " + boolTrue + " && " + boolFalse + " = " + (boolTrue && boolFalse));
        System.out.println("Операция 'ИЛИ': " + boolTrue + " || " + boolFalse + " = " + (boolTrue || boolFalse));
        System.out.println("Операция 'НЕ': " + "!(" + boolTrue + " && " + boolFalse + ") = " + !(boolTrue && boolFalse));

        //присвоение
        System.out.println("присвоение:");

        inta += longa;
        System.out.println("c += a = " + inta + " или с = с + а");

        inta -= longa;
        System.out.println("c -= a = " + inta+ " или с = с - а");

        inta *= longa ;
        System.out.println("c *= a = " + inta+ " или с = с умножить на а");

        //переполнение overflow
        System.out.println("Переполнение байт:");
        System.out.println("byte min = " + Byte.MIN_VALUE);
        // b = Byte.MIN_VALUE - 1;
        System.out.println("byte max = " + Byte.MAX_VALUE);
        // b = Byte.MAX_VALUE + 1;
    }

}

