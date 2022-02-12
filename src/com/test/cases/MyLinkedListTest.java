package com.test.cases;
import org.junit.Assert;
import org.junit.Test;

import com.linked.list.problems.MyLinkedList;
import com.linked.list.problems.MyNode;

public class MyLinkedListTest {

	@Test
	 public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
		MyNode<Integer> firstNode = new MyNode<Integer>(60);
		MyNode<Integer> secondNode = new MyNode<Integer>(50);
		MyNode<Integer> ThirdNode = new MyNode<Integer>(40);
		
		MyLinkedList myLinkedList =	new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.add(secondNode);
		myLinkedList.add(ThirdNode);
		
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(ThirdNode) 
			&& myLinkedList.head.getNext().equals(secondNode) 
			&& myLinkedList.tail.equals(firstNode);
	
	Assert.assertTrue(result);
	}
	
	@Test
	 public void given3NumbersWhenAppendShouldBeAddedToLast() {
		MyNode<Integer> firstNode = new MyNode<Integer>(140);
		MyNode<Integer> secondNode = new MyNode<Integer>(120);
		MyNode<Integer> ThirdNode = new MyNode<Integer>(100);
		
		MyLinkedList myLinkedList =	new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(ThirdNode);
		
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(firstNode) 
			&& myLinkedList.head.getNext().equals(secondNode) 
			&& myLinkedList.tail.equals(ThirdNode);
	
	Assert.assertTrue(result);
	}
	
	
	@Test
	 public void given3NumbersWhenInsertInBetweenSouldPassedLinkListResults() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> ThirdNode = new MyNode<Integer>(70);
		
		MyLinkedList myLinkedList =	new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.append(ThirdNode);
		myLinkedList.insert(firstNode, secondNode);
		
		myLinkedList.printMyNodes();
	boolean result = myLinkedList.head.equals(firstNode) 
			&& myLinkedList.head.getNext().equals(secondNode) 
			&& myLinkedList.tail.equals(ThirdNode);
	
	Assert.assertTrue(result);
	}
	
	@Test
	 public void DeleteFirstElementInLinkedList() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> ThirdNode = new MyNode<Integer>(70);
		
		MyLinkedList myLinkedList =	new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(ThirdNode);
		myLinkedList.pop();
		
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(secondNode) 
			&& myLinkedList.tail.equals(ThirdNode) ;
			
	
	Assert.assertTrue(result);
	}
	
//	@Test
//	 public void DeleteLastElementInLinkedList() {
//		MyNode<Integer> firstNode = new MyNode<Integer>(120);
//		MyNode<Integer> secondNode = new MyNode<Integer>(30);
//		MyNode<Integer> ThirdNode = new MyNode<Integer>(70);
//		
//		MyLinkedList myLinkedList =	new MyLinkedList();
//		myLinkedList.append(firstNode);
//		myLinkedList.append(secondNode);
//		myLinkedList.append(ThirdNode);
//		myLinkedList.popLast();
//		
//		myLinkedList.printMyNodes();
//		boolean result = myLinkedList.head.equals(firstNode) 
//			&& myLinkedList.tail.equals(secondNode) ;
//			
//	
//	Assert.assertTrue(result);
//	}
	
	
	
}



