/**
 * Created by Layla on 2017/8/18.
 */
public class CashReturn extends CashSuper {
    private double condition = 0;
    private double rtn = 0;
    public CashReturn(double condition, double rtn){
        this.condition = condition;
        this.rtn = rtn;
    }
    public double acceptCash(double money){
        return money - Math.floor(money/condition) * rtn;
    }
}
