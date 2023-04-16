package model;

import exceptions.QueueNullInvalidException;

public class Queues<T> implements QueuesInterface<T> {

    private Node<T> firstInQueues;
    private Node<T> lastInQueues;

    public void enqueue(T item) {

        if (isEmpty()) {
            Node<T> node = new Node<>(item);
            firstInQueues = node;
            lastInQueues = node;
        } else {
            Node<T> first = getFirstInQueues();
            Node<T> nodeToAdd = new Node<>(item);
            first.setNext(nodeToAdd);
            nodeToAdd.setPrevious(first);
            lastInQueues = nodeToAdd;
        }
    }

    public T dequeue() throws  QueueNullInvalidException{
        Node<T> first = getFirstInQueues();

        if (first == null) {

            throw  new QueueNullInvalidException();
        } else {
            Node<T> tempNextOfTheFirst = first.getNext();
            if (tempNextOfTheFirst != null) {
                tempNextOfTheFirst.setPrevious(null);
            }
            firstInQueues = tempNextOfTheFirst;
        }
        return first.getKey();
    }

    public boolean isEmpty() {
        if(firstInQueues==null){
            return true;
        }
        return false;

    }

    public Node<T> getFirstInQueues() throws QueueNullInvalidException {

        if(firstInQueues==null){
            throw new QueueNullInvalidException();
        }
        else {

            return firstInQueues;
        }


    }




}
