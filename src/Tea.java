import static java.lang.Thread.sleep;

/**
 * 具体子类，提供了制备茶的具体实现
 * Created by wswenyue
 */
public class Tea extends RefreshBeverage implements IDrink {
    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    @Override
    protected void brew() {
        System.out.println("用80度的热水浸泡茶叶5分钟");
    }

    @Override
    public void drinking() {
        System.out.print("喝茶");
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
