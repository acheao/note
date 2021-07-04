package design.pattern.builder;

public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItens(String[] items);
    public abstract void close();

}
