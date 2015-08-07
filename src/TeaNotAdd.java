import static java.lang.Thread.sleep;

/**
 * 具体子类，提供了制备茶的具体实现
 * 制备一杯中式的茶，不加柠檬
 * 复写钩子方法
 * Created by wswenyue
 */
public class TeaNotAdd extends RefreshBeverage implements IDrink{
    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    /**
     * 复写钩子方法
     * */
    @Override
    protected boolean isCustomerWantsConiments() {
        return false;
    }

    @Override
    protected void brew() {
        System.out.println("用80度的热水浸泡茶叶5分钟");
    }

    @Override
    public void drinking() {
        System.out.print("喝纯正的中式绿茶");
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
