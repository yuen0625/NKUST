import java.util.ArrayList;
public class game {
    public static void main(String[] args) {
        human du = new human("弓箭手");
        du.hp = 15;
        du.att = 30;
        du.mp = 10;
        du.show();
        du.skill("攻擊");
        du.skill("詠唱", "123");
        du.skill("裝備","456");
        System.out.println();
    }
}

