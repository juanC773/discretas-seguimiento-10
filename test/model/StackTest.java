package model;


import exceptions.EmptyStackInvalidException;
import model.Stack;
import model.Node;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    Stack stack=new Stack();





    @Test
    public void isEmptyValidTest(){

        boolean pass=false;
        //arrange
        if(stack.isEmpty()){

            pass=true;
        }

        assertTrue(pass);

    }


    @Test
    public void AfterEmptyingTest(){

        boolean pass=false;
        //arrange

        stack.push(1);
        stack.pop();

        //act
        if(stack.isEmpty()==true){

            pass=true;
        }

        assertTrue(pass);

    }

    @Test
    public void theStackIsNotEmpty(){

        boolean pass=false;

        //arrange
        stack.push(1);

        if (stack.isEmpty()==false){

            pass=true;

        }

        assertTrue(pass);

    }

    //------


    @Test
    public void successfullyPushIfIsEmptyTest(){


        boolean pass=false;
        //Arrange



        stack.push(2);

        if(stack.pop().getKey().equals(2)){
            pass=true;
        }

      assertTrue(pass);

    }

    @Test
    public void successfullyPushIfIsNotEmptyTest(){


        boolean pass=false;
        //Arrange


        stack.push(1);
        stack.push(2);

        if(stack.pop().getKey().equals(2)){
            pass=true;
        }

        assertTrue(pass);

    }



    @Test
    public void usePushLaterAfterExtractingAnElement(){


        boolean pass=false;
        //Arrange


        stack.push(1);
        stack.push(2);
        stack.pop();

        if(stack.pop().getKey().equals(1)){
            pass=true;
        }

        assertTrue(pass);

    }

//--------


    @Test
    public void successfullyGetPeekTest(){

        boolean pass=false;
        //arrange
        stack.push(10);

        //act
        Node node=stack.peek();
        if(node.getKey().equals(10)){
            pass=true;
        }

        //assert
        assertTrue(pass);



    }


    @Test
    public void getPeekLaterToExtractAnElement(){

        boolean pass=false;
        //arrange
        stack.push(2);
        stack.push(1);
        stack.pop();

        //act
        if(stack.peek().getKey().equals(2)){
            pass=true;
        }
        //assert
        assertTrue(pass);

    }


    @Test
    public void getInvalidPeekTest() throws EmptyStackInvalidException {

        boolean pass=true;

        //Arrange
        try {
            stack.peek();
            //act
        }catch (EmptyStackInvalidException ex){

            ex.printStackTrace();
            pass=false;

        }

        //assert
        assertFalse(pass);



    }

    //-----


    @Test
    public void popValidTest(){

        boolean pass=false;
        //arrange
        stack.push(1);

        if(stack.pop().getKey().equals(1)){
            pass=true;
        }

        assertTrue(pass);

    }


    @Test
    public void popEmptyTest() throws EmptyStackInvalidException{

        boolean pass=true;

        //arrange
        try {
            stack.pop();
        }catch (EmptyStackInvalidException ex){
            ex.printStackTrace();
            pass=false;
        }

        //assert
        assertFalse(pass);


    }

    @Test
    public void usePopAfterEnteringManyElements(){

        boolean pass=false;

        //Arrange
        stack.push(2);
        stack.push("hola");

        //act
        if (stack.pop().getKey().equals("hola")){
            pass=true;
        }

        //assert
        assertTrue(pass);

    }


}
