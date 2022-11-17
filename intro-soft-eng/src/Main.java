import java.util.*;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList();

        list.add("Sample sting");
        list.add("Another sample string");

/*        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String el = it.next();
            System.out.println(el);
        }*/

        for (Iterator<String> it = list.iterator(); it.hasNext();){
            String el = it.next();
            System.out.println(el);
        }




        for(int i = 0; i <= list.size(); i++) {
            System.out.println(list.get(i));
        }





        for (String el: list) {
            System.out.println(el);
        }



        Game game = new Game();
        game.addPlayer(new PlayerComputer("SampleName"));
        game.play();

    }
}