package employee;

import org.springframework.beans.factory.annotation.Value;

public class Salaray {
    private int money;
    protected void moneyAllotted(){
        System.out.println("the money alloted is " +money );
    }

    public int getMoney() {
        return money;
    }

    @Value("${employee.money}")
    public void setMoney(int money) {
        this.money = money;
    }
}
