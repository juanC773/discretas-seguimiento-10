
package model;

import exceptions.EmptyStackInvalidException;



public class Stack<T> implements StackInterface<T>{


    private Node<T> node;
    private Node<T> leader;



    @Override
    public Node peek() throws EmptyStackInvalidException{

        if(leader==null){

            throw new EmptyStackInvalidException();
        }

        return leader;
    }



    public void push(T key) {

        if(isEmpty()){
            Node<T> nodeToAdd = new Node<>(key);
            leader = nodeToAdd;
        }
        else {
            Node<T> nodeToAdd = new Node<>(key);
            Node<T> temp = peek();
            temp.setPrevious(nodeToAdd);
            nodeToAdd.setNext(temp);
            leader = nodeToAdd;
        }

    }


    @Override
    public Node<T> pop() throws EmptyStackInvalidException {

        Node<T> first = peek();

        if (first == null) {
            throw new EmptyStackInvalidException();
        }
        else {
            Node<T> nextPop = first.getNext();
            leader = nextPop;
            if(nextPop != null) {
                nextPop.setPrevious(null);
            }
        }
        return first;
    }

    @Override
    public boolean isEmpty() {


        if(leader == null) {
            return true;
        }
        return false;

    }



    }








