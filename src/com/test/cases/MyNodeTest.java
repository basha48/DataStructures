package com.test.cases;
import org.junit.Test;

import com.linked.list.problems.MyNode;

//
import org.junit.Assert;

public class MyNodeTest {
	@Test
	public  void given3NumbersWhenLinkedShouldPassedLinkedListTest() {
			MyNode<Integer> firstNode = new MyNode<Integer>(56);
			MyNode<Integer> secondNode = new MyNode<Integer>(30);
			MyNode<Integer> ThirdNode = new MyNode<Integer>(70);
			firstNode.setNext(secondNode);
			secondNode.setNext(ThirdNode);
			
			boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(ThirdNode) ;
			//System.out.println("The result is :" +result);
			Assert.assertTrue(result);
	
	}

	}


