package structural_patterns.facade.solution;

import java.util.List;

public class TwitterAPI {
    private String apiKey;
    private String secret;

    public TwitterAPI(String apiKey, String secret) {
        this.apiKey = apiKey;
        this.secret = secret;
    }

    public List<Tweet> getRecentTweets() {
        TwitterClient client = new TwitterClient();
        return client.getRecentTweets(getAccessToken());
    }

    public String getAccessToken() {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(apiKey, secret);
        return oauth.getAccessToken(requestToken);
    }
}

