package org.jsoup.nodes;

public abstract class MakeFactory<T> {

    protected abstract Node createnode(T params);
}
