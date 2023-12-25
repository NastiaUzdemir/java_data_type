
public class Main {
    public static void main(String[] args) {

        int ticPrice = 201;
        System.out.println("Cтоимость билета в рублях: " + ticPrice);

        int countMil = ticPrice / 20;

        if (ticPrice % 20 != 0) {
            System.out.println("Внимание! Дробные мили не начисляются.");
        }

        System.out.println("Количество начисленных бонусных миль: " + countMil);
    }
}