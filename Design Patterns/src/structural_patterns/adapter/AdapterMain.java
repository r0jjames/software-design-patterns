package structural_patterns.adapter;

import structural_patterns.adapter.solution.EmailClient;
import structural_patterns.adapter.solution.Gmail.GmailClient;
import structural_patterns.adapter.solution.GmailAdapter;
import structural_patterns.adapter.thirdPartyFilter.Caramel;

public class AdapterMain {
    public static void main(String[] args) {
        // Example 1:
        /*
        var imageView = new ImageView();
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel())); //  Favor composition than inheritance.
        imageView.apply(new CameralAdapter()); // Another approach but not perfect solution.

         */
        // Example 2:
        var emailClient = new EmailClient();
        emailClient.addProvider(new GmailAdapter(new GmailClient()));
        emailClient.downloadEmails();
    }
}
