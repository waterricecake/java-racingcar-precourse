package view;

import java.util.List;

public class OutputView {
    public static void resultOutputView(){
        System.out.println("실행 결과");
    }
    public static void playerOutputView(String player, Integer position){
        System.out.print(player + " : ");
        positionOutputView(position);
        System.out.println();
    }
    private static void positionOutputView(Integer position){
        for(int i = 0;i<position;i++){
            System.out.print("-");
        }
    }
    public static void winnersOutputView(String winners){
        System.out.print("최종 우승자: " + winners);
    }
    public static void changeLine(){
        System.out.println();
    }
}
