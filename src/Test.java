import java.util.Scanner;

/**
 * 模拟一个饮品店
 * 制作饮品过程--> 使用模板方法设计模式
 * 顾客点饮 饮单设计--->使用工场设计模式
 * 饮品店账户记账 考虑到记账的员工可能有多个，而账户只有唯一的一个
 * 所以设计账户对象使用--->单例模式
 *
 * Created by wswenyue
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎您来到“高兴”饮品");
            System.out.println("您需要喝点什么-->茶(请输入：1)？中式绿茶(请输入：2)？还是咖啡(请输入：3)?");
            int order = scanner.nextInt();
            switch (order) {
                case 1:
                    drinkTea();
                    break;
                case 2:
                    drinkCoffee();
                    break;
                case 3:
                    drinkCTea();
                    break;
            }
        }


    }

    private static void drinkTea() {
        System.out.println("请交费5元");
        Account.getInstance().addMoney(5);

        IDrink drink = DrinkFactory.ChooseDrink(DrinkFactory.TEA);

        drink.drinking();
    }

    private static void drinkCoffee() {
        System.out.println("请交费5元");
        Account.getInstance().addMoney(5);

        IDrink drink = DrinkFactory.ChooseDrink(DrinkFactory.COFFEE);

        drink.drinking();
    }

    private static void drinkCTea() {
        System.out.println("请交费6元");
        Account.getInstance().addMoney(6);

        IDrink drink = DrinkFactory.ChooseDrink(DrinkFactory.C_TEA);

        drink.drinking();
    }


}
