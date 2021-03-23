import java.lang.Math;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.time.format.DateTimeFormatter;
// import java.lang.Thread;

public class Main {
  public static void main(String[] args) {
    System.out.println("working java");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int birdCount = 0;
    System.out.println("I own " + birdCount + " " + pluralize("bird", birdCount) + ".");

    flipNHeads(2);

    clock();
  }

  public static String pluralize(String word, int num) {
    if (num == 0 || num > 1) {
      return word = word + "s";
    }
    else return word;
  }

  public static void flipNHeads(int n) {
    int flips = 0;
    int heads = 0;
    while (heads < n){
      flips++;
      double random = Math.random();
      String answer = random > .5 ? "heads" : "tails";
      System.out.println(answer);
      heads += answer == "heads" ? 1 : 0;
      if(answer == "tails"){heads = 0;}
      if(heads == n){break;}
    }
    
    System.out.println("It took " + flips + " flips to flip " + heads + " heads in a row.");
  }


  public static void clock(){
    while(true){
        LocalDateTime now = LocalDateTime.now();
          int hour = now.getHour();
          int minute = now.getMinute();
          int second = now.getSecond();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        try {
          TimeUnit.SECONDS.sleep(1);
        } catch (Exception e){}
        System.out.println(time);
      }
  }

}
