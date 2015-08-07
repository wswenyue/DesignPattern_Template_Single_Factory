/**单例模式
 * 这是饮品店的账户
 * 主要记录各个收银员收银之后，账户的金额
 * 因为账户是唯一的，所以每个收银员必须拿到同一个账户对象，进行收银操作。
 * Created by wswenyue
 */
public class Account {
    private static int balance;
    static {
        //初始化账户金额
        balance = 1000;
    }
    private Account(){}

    private static Account account = new Account();

    public static Account getInstance(){
        return account;
    }
    protected void addMoney(int money){
        if(money>0){
            balance+=money;
            System.out.println("记账成功，账户金额："+balance+"元");
        }else {
            System.out.println("您的输入有误！！！");
        }
    }
}

