package project.datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class stack <T> implements stackInterface<T>,Iterable<T>{

    private ArrayList<T> arr;
    private int size;


    private class implement implements Iterator<T>{

        private int next=0;
        private int last=-1;
        @Override
        public boolean hasNext() {
            return last<arr.size()-1;
        }

        @Override
        public T next() {
            last=next;
            next++;
            return arr.get(last);
        }
    }
    public stack(){

        this.arr=new ArrayList<T>();
    }

    public void clear(){
        arr.clear();
    }


    public void push(T insert){
        this.arr.add(insert);
    }

    public T pop(){
        int s=this.arr.size()-1;

            T q = arr.get(s);
            arr.remove(s);
            size--;
            return q;


    }


    @Override
    public Iterator<T> iterator() {
        return new implement();
    }


    }

