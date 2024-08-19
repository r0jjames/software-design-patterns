package structural_patterns.facade.solution;

public class Demo {
  public static void show() {

    var twitterAPI = new TwitterAPI("appKey", "secret");
    var tweets = twitterAPI.getRecentTweets();
  }
}
