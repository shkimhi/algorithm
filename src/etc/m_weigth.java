package etc;

import java.util.Scanner;

public class m_weigth {
    public static int weight() {
        Scanner sc = new Scanner(System.in);
        double age = sc.nextInt();
        double gender = sc.nextInt();
        double height = sc.nextInt();
        double weight = sc.nextInt();
        double standard = 0;
        double standardIndex = 0;

        if(age <= 35){
            if(gender == 1){
                standard = (height-100)*0.90;
            }else{
                standard = (height-100)*0.85;
            }
        }else {
            if(gender ==1 ){
                standard = (height-100)*0.95;
            }else {
                standard = (height-100)*0.90;
            }
        }

        standardIndex = (weight/standard) * 100;

        if(standardIndex <= 85){
            System.out.println("표준체중 = " + standard);
            System.out.println("당신의 표준체중지수는" + Math.floor(standardIndex) + "으로 마른형입니다.");
        }else if(standardIndex >= 86 && standardIndex <= 96){
            System.out.println("표준체중 = " + standard);
            System.out.println("당신의 표준체중지수는" + (Math.floor(standardIndex*1000)/1000.0) + "으로 조금마른형입니다.");
        }else if(standardIndex >= 96 && standardIndex <= 115){
            System.out.println("표준체중 = " + standard);
            System.out.println("당신의 표준체중지수는" + standardIndex + "으로 표준형입니다.");
        }else if(standardIndex >= 116 && standardIndex <= 125){
            System.out.println("표준체중 = " + standard);
            System.out.println("당신의 표준체중지수는" + standardIndex + "으로 조금 비만형입니다.");
        }else {
            System.out.println("표준체중 = " + standard);
            System.out.println("당신의 표준체중지수는" + standardIndex + "으로 비만형입니다.");
        }

        return 0;
    }

}
