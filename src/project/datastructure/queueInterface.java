package project.datastructure;

import java.util.Iterator;

public interface queueInterface <T> {
     void enqueue(T insert);
     Object dequeue();
     Iterator<T> iterator();
}
