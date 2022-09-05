package vtalent_Practise;

import java.util.Stack;

public class StackPractise {

	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push(10);        //push is adding element into stack
		s.push(9);
		s.push(8);
		s.push(7);
		s.push(6);
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(10);
		
		System.out.println(s);

		s.pop();   //pop is removing latest added element
		
		System.out.println(s);
		
	//	s.peek();  peek is reading last element or lastest added element
		
		System.out.println(s.peek());
		
		System.out.println(s.isEmpty());  //isEmpty is checking empty value in our list
		
		System.out.println(s.search(5));  // search is showing provided value index in added list
		
	}

}
