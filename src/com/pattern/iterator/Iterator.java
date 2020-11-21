package com.pattern.iterator;

/**
 * Iterator 接口：遍历集合的接口
 */
public interface Iterator {
    public abstract boolean hasNext();
    public abstract Object getNext();
}
