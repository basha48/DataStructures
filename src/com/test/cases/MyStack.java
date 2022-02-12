package com.test.cases;

import com.linked.list.problems.INode;
import com.linked.list.problems.MyNode;
import com.linked.list.problems.MyLinkedList;

public class MyStack {
	private MyLinkedList MyLinkedList;

	public MyStack() {
		this.MyLinkedList = new MyLinkedList();
	}

	public void push(INode myNode) {
		MyLinkedList.add(myNode);
	}

	public void printStack() {
		MyLinkedList.printMyNodes();
		
	}

	public INode peak() {
		return MyLinkedList.head;
		
	}

	public INode pop() {
		
	return	MyLinkedList.pop();
	}

	
}
