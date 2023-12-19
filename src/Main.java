
public class Main {
    public static void main(String[] args) {

        int tic_price = 201;
        System.out.println("Cтоимость билета в рублях: " + tic_price);

        int count_mil = tic_price / 20;

        if (tic_price % 20 != 0) {
            System.out.println("Внимание! Дробные мили не начисляются.");
        }

        System.out.println("Количество начисленных бонусных миль: " + count_mil);
    }
}