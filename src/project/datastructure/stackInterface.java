package project.datastructure;

import java.util.Iterator;

public interface stackInterface<T> {
     void push(T insert);
     Object pop();
    Iterator<T> iterator();
}
