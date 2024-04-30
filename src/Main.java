//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 13_678;
        int miles = service.calculate(price); // должно получиться 500
        // получается) price заменил на значение из первого задания для проверки, как видно, тоже получается))
        System.out.println(miles);

    }
}