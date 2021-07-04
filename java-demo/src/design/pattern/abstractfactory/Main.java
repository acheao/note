package design.pattern.abstractfactory;

import design.pattern.abstractfactory.abstarct.Factory;
import design.pattern.abstractfactory.abstarct.Link;
import design.pattern.abstractfactory.abstarct.Page;
import design.pattern.abstractfactory.abstarct.Tray;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Usage: java Main class.name.of.ConcreateFactory");
            System.out.println("Excample 1: java Main listfactory.ListFactory");
            System.out.println("Excample 2: java Main tablefactory.TableFactory");
        }
        Factory factory = Factory.getFactory(args[0]);
        Link people = factory.createLink(" 人民日报", "http://people.com.cn");
        Link gmw = factory.createLink(" 光明日报","http://www.gmw.cm");

        Link us_yahoo = factory.createLink("Yahoo!","http://www.yahoo.com/");
        Link jp_yahpp = factory.createLink("Yahoo!Janpan","http://yahoo.co.jp");
        Link excite = factory.createLink("Excite","http://www.excite.com/");
        Link google = factory.createLink("Google","http://www.google.com/");

        Tray traynews = factory.createTray(" 日报");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahpp);

        Tray traysearch = factory.createTray("搜索引擎");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);
        Page page = factory.createPage("LinkPage","杨文轩");
        page.add(traynews);
        page.add(traysearch);
        page.output();

    }
}
