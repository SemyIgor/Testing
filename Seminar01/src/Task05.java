import java.util.ArrayList;

public class Task05 {
    /**
     * Утверждение предупреждает об ошибке, нужно исправить код, чтобы
     * утверждение не выбрасывало ошибку
     */
    public static void checkingShoppingCart() {
        System.out.println("Task05");
        ArrayList<String> productCategories = new ArrayList<>();
        productCategories.add("fruits");
        productCategories.add("vegetables");
        productCategories.add("bakery");
        productCategories.add("drinks");

        ArrayList<String> products = new ArrayList<>();
        products.add("apple");
        products.add("tomato");
        products.add("bread");
        products.add("water");

        for (String product : products) {
            switch (product) {
                case "apple" -> System.out.println("category: " + productCategories.get(0));
                case "tomato" -> System.out.println("category: " + productCategories.get(1));
                case "bread" -> System.out.println("category: " + productCategories.get(2));
                case "water" -> System.out.println("category: " + productCategories.get(3));
                default -> {
                    assert false : "Unknown category for the product " + product;
                }
/*              Для того, чтобы утверждение не выбрасывало ошибку,
                заменим предыдущую строку на следующую:
                assert true : "Unknown category for the product " + product;
                Но лучше исправить сам код, а именно, добавить категорию "drinks"
                (строки 13, 28, 29)
                Примечание: по совету IDEA (Alt + Enter) конструкция if была заменена
                на switch - case, поэтому строки 13 и 26 */
            }
        }
    }
}
