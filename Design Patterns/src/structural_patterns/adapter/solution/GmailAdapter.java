package structural_patterns.adapter.solution;

import structural_patterns.adapter.solution.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    private GmailClient gmailClient;
    public GmailAdapter(GmailClient gmailClient) {
       this.gmailClient = gmailClient;
    }

    @Override
    public void downloadEmails() {
        this.gmailClient.connect();
        this.gmailClient.getEmails();
        this.gmailClient.disconnect();
    }
}
