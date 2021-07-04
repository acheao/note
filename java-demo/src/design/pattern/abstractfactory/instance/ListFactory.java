package design.pattern.abstractfactory.instance;

import design.pattern.abstractfactory.abstarct.Factory;
import design.pattern.abstractfactory.abstarct.Link;
import design.pattern.abstractfactory.abstarct.Page;
import design.pattern.abstractfactory.abstarct.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }
    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
