package view;

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
}
