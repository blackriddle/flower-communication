/**
 * Created by Layla on 2017/8/18.
 */
public class CashRebate extends CashSuper{
    private double discount = 0;
    public CashRebate(double discount){
        this.discount = discount;
    }
    public double acceptCash(double money, double discount){
        return money * discount;
    }
}
