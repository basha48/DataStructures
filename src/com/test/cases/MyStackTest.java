package com.test.cases;

import org.junit.Test;

import com.linked.list.problems.INode;
import com.linked.list.problems.MyNode;

import org.junit.Assert;

public class MyStackTest {
	
	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
	
	MyNode<Integer> firstNode = new MyNode<Integer>(70);
	MyNode<Integer> secondNode = new MyNode<Integer>(30);
	MyNode<Integer> ThirdNode = new MyNode<Integer>(56);
	MyStack	 mystack = new MyStack();
	mystack.push(firstNode);
	mystack.push(secondNode);
	mystack.push(ThirdNode);
	mystack.printStack();
	
	INode peak = mystack.peak();
	
	Assert.assertEquals(ThirdNode, peak);
	
	}

	
	@Test
	public void given3NumbersInStackWhenPopedShouldMatchWithLastAddedNode() {
	
	MyNode<Integer> firstNode = new MyNode<Integer>(70);
	MyNode<Integer> secondNode = new MyNode<Integer>(30);
	MyNode<Integer> ThirdNode = new MyNode<Integer>(56);
	MyStack	 mystack = new MyStack();
	mystack.push(firstNode);
	mystack.push(secondNode);
	mystack.push(ThirdNode);
	INode pop = mystack.pop(); 
	mystack.printStack();
	//System.out.println("the amount is "+ mystack.peak());
	Assert.assertEquals(ThirdNode, pop);
	
	}

	
	
	
}
