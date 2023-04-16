package model;

public interface QueuesInterface<T> {



        void enqueue(T item);
        T dequeue();
        boolean isEmpty();





}
