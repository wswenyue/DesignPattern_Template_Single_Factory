import static java.lang.Thread.sleep;

/**
 * 具体子类，提供了咖啡制备的具体实现
 * Created by wswenyue
 */
public class Coffee extends  RefreshBeverage implements IDrink {
    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }

    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");

    }

    @Override
    public void drinking() {
        System.out.print("喝咖啡");
        for (int i = 0; i < 8; i++) {
            try {
                sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("@");
        }
        System.out.println();
    }
}
