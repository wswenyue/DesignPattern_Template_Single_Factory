/**
 * 工场设计模式
 * 饮品工场
 * 按照输入的饮品类型调用模板方法模式设计的流程去生产相应的饮品
 * Created by wswenyue
 */
public class DrinkFactory {
    public static final String TEA = "TEA";
    public static final String C_TEA = "C_TEA";
    public static final String COFFEE = "COFFEE";
    public static IDrink ChooseDrink(String drinkType){
        IDrink drink = null;
        switch (drinkType){
            case DrinkFactory.TEA :
                Tea tea = new Tea();
                System.out.println("开始制备>>>>>>>");
                tea.prepareBeverageTemplate();
                System.out.println("茶好了。。。");
                drink = tea;
                break;
            case DrinkFactory.COFFEE :
                Coffee coffee = new Coffee();
                System.out.println("开始制备>>>>>>>");
                coffee.prepareBeverageTemplate();
                System.out.println("咖啡好了！");
                drink = coffee;
                break;
            case DrinkFactory.C_TEA :
                TeaNotAdd cTea = new TeaNotAdd();
                System.out.println("开始制备>>>>>>>");
                cTea.prepareBeverageTemplate();
                System.out.println("中式绿茶好了！");
                drink = cTea;
                break;
        }
        return drink;
    }
}
