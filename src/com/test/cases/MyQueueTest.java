package com.test.cases;

import org.junit.Assert;
import org.junit.Test;

import com.linked.list.problems.INode;
import com.linked.list.problems.MyNode;

public class MyQueueTest {
	
	@Test
	public void given3NumbersInEnqueOperation() {
	
	MyNode<Integer> firstNode = new MyNode<Integer>(56);
	MyNode<Integer> secondNode = new MyNode<Integer>(30);
	MyNode<Integer> ThirdNode = new MyNode<Integer>(70);
	MyQueue	 myQueue = new MyQueue();
	myQueue.enqueu(firstNode);
	myQueue.enqueu(secondNode);
	myQueue.enqueu(ThirdNode); 
	myQueue.printQueue();
	INode dequeue = myQueue.dequeue();
	
	Assert.assertEquals(firstNode, dequeue);
	
	}

	@Test
	public void given3NumbersDequeOperation() {
	
	MyNode<Integer> firstNode = new MyNode<Integer>(56);
	MyNode<Integer> secondNode = new MyNode<Integer>(30);
	MyNode<Integer> ThirdNode = new MyNode<Integer>(70);
	MyQueue	 myQueue = new MyQueue();
	myQueue.enqueu(firstNode);
	myQueue.enqueu(secondNode);
	myQueue.enqueu(ThirdNode); 
	myQueue.dequeue(); 
	myQueue.printQueue();
	INode pop = myQueue.dequeue();
	
	Assert.assertEquals(secondNode, pop);
	
	}
	
	
}
