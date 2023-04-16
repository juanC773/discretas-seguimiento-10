package model;

import exceptions.QueueNullInvalidException;
import model.Node;
import model.Queues;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




public class QueuesTest {

    Queues queues=new Queues();

    @Test
    public void validIsEmptyTest(){


        boolean pass=false;

        //Arrange is use the obj, since it is empty every time it is called

        //act
        if(queues.isEmpty()){
            pass=true;
        }

        assertTrue(pass);

    }


    @Test
    public void validIsNotEmptyTest(){

        boolean pass=true;

        //Arrange
        queues.enqueue(1);

        //act
        if(queues.isEmpty()==false){
            pass=false;
        }

        assertFalse(pass);

    }

    @Test
    public void  verifyThatTheQueueIsEmptyLaterExtractingElementsTest(){

        boolean pass=false;

        //arrange
        queues.enqueue(1);
        queues.dequeue();

        //act
        if(queues.isEmpty()){
            pass=true;
        }

        //assert
        assertTrue(pass);


    }

    @Test
    public void getFirstInTheQueueValidTest(){

        boolean pass=false;

        //arrange
        queues.enqueue(1);

        //act
        if(queues.getFirstInQueues().getKey().equals(1)){
            pass=true;
        }

        assertTrue(pass);

    }

    @Test
    public void checkIfItChangeTheFirstInTheQueueTest(){

        boolean pass=false;

        //Arrange
        queues.enqueue(1);
        queues.enqueue(2);
        queues.dequeue();

        //act
        if(queues.getFirstInQueues().getKey().equals(2)){

            pass=true;
        }

        assertTrue(pass);


    }


    @Test
    public void getTheFirstInTheQueueIfIsEmptyTest() throws QueueNullInvalidException {

        boolean pass=true;

        //Arrange (the queue is already empty)

        //act
        try {
            queues.getFirstInQueues();
        }catch (QueueNullInvalidException ex){
            ex.printStackTrace();
            pass=false;
        }

        //assert
        assertFalse(pass);


    }



    @Test
    public void enqueueSuccessfullyTest(){

        boolean pass=false;
        //Arrange
        queues.enqueue(1);

        //act
        if(queues.getFirstInQueues().getKey().equals(1)){
            pass=true;
        }

        //assert
        assertTrue(pass);


    }


    @Test
    public void enqueueMoreElementsTest(){

        boolean pass=false;
        //arrange
        queues.enqueue("hola");
        queues.enqueue(1);
        queues.enqueue("si");

        //act
        if(queues.getFirstInQueues().getKey().equals("hola")){
            pass=true;
        }

        //asert
        assertTrue(pass);

    }


    @Test
    public void enqueueLaterToExtractElements(){

        boolean pass=false;

        //arrange
        queues.enqueue(5);
        queues.enqueue(6);
        queues.dequeue();
        queues.dequeue();
        queues.enqueue(10);

        //act
        if(queues.getFirstInQueues().getKey().equals(10)){
            pass=true;
        }

        //assert
        assertTrue(pass);



    }

    //desencuecar si esta vacio exception

    @Test
    public void dequeueSuccessfullyTest(){

        boolean pass=false;


        //arrange
        queues.enqueue(5);


        //act
        queues.dequeue();
        if(queues.isEmpty()){
            pass=true;
        }

        //assert
        assertTrue(pass);

    }

    @Test
    public void dequeueIfIsEmptyTest() throws QueueNullInvalidException{

        boolean pass=true;
        //arrange

        //act
        try{
            queues.dequeue();
        }catch (QueueNullInvalidException ex){
            ex.printStackTrace();
            pass=false;
        }
        assertFalse(pass);

    }


    @Test
    public void dequeueAfterTheQueueHasBeenEmpty(){

        boolean pass=false;
        //arrange
        queues.enqueue(1);
        queues.dequeue();
        queues.enqueue(1);
        queues.enqueue(2);
        queues.dequeue();

        //act
        if(queues.getFirstInQueues().getKey().equals(2)){
            pass=true;
        }

        //assert
        assertTrue(pass);
    }














}
