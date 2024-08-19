package structural_patterns.facade.solution;

import java.util.ArrayList;
import java.util.List;

public class TwitterClient {
  public List<Tweet> getRecentTweets(String accesskey) {
    System.out.println("Getting recent tweets");
    return new ArrayList<>();
  }



}
