package main;

import java.util.HashSet;
import java.util.Set;

public class LinkedListExample {
	
	static class Node{
		int data;
		Node next;
		
		public Node(int d){
			this.data=d;
			this.next=null;
		}
		
	}
	
	Node root=null;
	Node head=null;
	
	void addNode(int data) {
		
		Node node = new Node(data);
		if(head!=null) {
			root.next=node;
			root=node;
		}
		else {
			root=node;
			head=node;
			
		}
		
		
		
	}
	
	public void display() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    } 
	
	public void displayUnique() {
		Set <Integer>set = new HashSet();
		Node start = head;
		Node traverse=head;
		Node last= head;
		while(traverse!=null) {
			if(!set.contains(traverse.data)) {
		
				set.add(traverse.data);
				if(traverse!=head) {
				last.next=traverse;	
				last=traverse;
				
				}
				traverse=traverse.next;
				
			}
			else {
				
				traverse=traverse.next;
				last.next=traverse;
				
			}
			
		}
		display();
		
	}
	
	public static void main(String[] args) {
		
		//Node head=node;
		Node root;
		
		LinkedListExample example = new LinkedListExample();
		example.addNode(1);
		example.addNode(2);
		example.addNode(3);
		example.addNode(4);
		example.addNode(4);
		example.addNode(4);
		example.addNode(4);
		example.addNode(5);
		example.addNode(6);
		example.addNode(7);
		example.addNode(6);
		example.addNode(7);
		example.addNode(4);
		example.addNode(4);
		
		example.display();
		example.displayUnique();
			
		}
	
		
		
		
	}
	
	


