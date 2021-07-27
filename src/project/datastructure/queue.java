package project.datastructure;


import java.util.ArrayList;
import java.util.Iterator;

public class queue <T> implements queueInterface<T>,Iterable<T>{
    private ArrayList<T> arr;


    private class implement implements Iterator<T>{

        private int last=-1;
        private int next=0;
        @Override
        public boolean hasNext() {
           return last<arr.size()-1;
        }

        @Override
        public T next() {
                last = next;
                next++;
            return arr.get(last);
        }
    }
    public queue(){
        this.arr=new ArrayList<T>();
    }

    @Override
    public void enqueue(T insert) {
        arr.add(insert);
    }

    public T dequeue(){


            T q=arr.get(0);
            arr.remove(0);
            return q;


    }



    @Override
    public Iterator<T> iterator() {
        return new implement();
    }

}
