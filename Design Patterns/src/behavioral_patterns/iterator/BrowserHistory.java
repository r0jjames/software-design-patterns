package behavioral_patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        int lastIndex = urls.size() - 1;
        String url = urls.get(lastIndex);
        urls.remove(url);
        return url;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public ListIterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator {

        private BrowserHistory history;
        private int index;

        public ListIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.getUrls().size();
        }

        @Override
        public String current() {
            return history.getUrls().get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
