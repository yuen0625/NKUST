import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public class human {
        String name1;
        int hp=0;
        int att=0;
        int mp=0;
        private List<String> weapon =new ArrayList<>();//集合陣列
        human(String name){name1= name;}
        private  String get (String value){
                switch (value) {
                        case "name":
                                return this.name1;
                        case "hp":
                                return String.valueOf(this.hp);
                        case "mp":
                                return String.valueOf(this.mp);
                        case "att":
                                return String.valueOf(this.att);
                        default:        //當沒有這些字篡選擇的時候就會break switch到return"錯誤"
                                break;
                }
                return "err"; //錯誤
        }

        public void show() {//顯示
                System.out.printf("%s(hp=%s,att=%s,mp=%s)", get("name"), get("hp"), get("mp"), get("att"));
                System.out.printf("武器");
                for (String x : weapon)
                        System.out.printf(x+"");
                System.out.println();
        }

        public void wear(String wear_name){
        weapon.add(wear_name);
        System.out.println(get("name")+"==>裝備"+wear_name);
        show();
        }
        public void skill(String type){
                if (type=="攻擊")
                        System.out.printf("%s!!發動攻擊\n",get("name"));
                else
                        System.out.printf("技能錯誤");
        }
        public void  skill(String type,String skillname){
                if(type=="詠唱"&&!(skillname.isEmpty()))
                        System.out.printf("%s 使用%s!!\n",get("name"),(skillname));
                else
                        System.out.printf("技能錯誤");


        }
}




