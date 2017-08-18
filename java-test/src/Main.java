/**
 * Created by Layla on 2017/6/15.
 */
public class Main{
    static public void main(String[] args){
        /*
        strategy : normal, rebate, return
         */
        String strategy = "rebate";
        double payment = 1000;
        double rs;
        CashContext cc = new CashContext(strategy);
        rs = cc.getResult(payment);
        System.out.println(rs);
    }
}
