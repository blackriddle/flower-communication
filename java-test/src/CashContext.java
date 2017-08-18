/**
 * Created by Layla on 2017/8/18.
 */
public class CashContext {
    private CashSuper cs;
    public CashContext(String strategy){
        if(strategy == "rebate"){
            cs = new CashRebate(0.8d);
        }
        else if(strategy == "return"){
            cs = new CashReturn(300, 100);
        }
        else if(strategy == "normal"){
            cs = new CashNormal();
        }
    }
    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
