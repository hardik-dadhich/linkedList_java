class LinkedList
 {
    Node head;
	class Node
	 {
	   int node;
	   Node next;
	   
	   Node(int d)
	    {
		    node = d;
			next= null;
			
			
			
		}
	 }
	 
	 public void push(int new_data)
	    {
		    Node new_node = new Node(new_data);
			new_node.next = head;
			head= new_node;
		
		}
		public void addAfter(Node prev_node , int data)
		   {
		      if(prev_node == null)
			   {
			     System.out.println("the given node is null");
				 return;
				 
			   }
		   
		       Node new_node = new Node(data);
			   new_node.next = prev_node.next;
			   prev_node.next = new_node;

		   
		   }
		   
		   public void append(int data)
		      {
			      Node new_node = new Node(data);
				  if(head == null)
				   {
				      head = new Node(data);
					  return;
				  }
				  new_node.next= null;
				  Node last = null;
				  try
				  {
				  while(last.next != null)
				    {
					  last = last.next;
					}
					last.next = new_node;
				  return;
			        }
					catch (Exception e)
					{
					   
					}
			  }
			  
			  
			 public void printList()
                   {
				   int a = 0;
				     Node tnode = head;
					 while(tnode!=null)
					   {
					      System.out.println("----->"+tnode.node );
						  tnode = tnode.next;
						  a++;
					   }
				     System.out.println("the count is" + a);
				   }		
           public Node reverse(Node node)
              {
					Node Next = null;
					Node prev = null;
					Node current=head ;
					while(current!=null)
					 {
					    Next= current.next;
						current.next = prev;
                        prev = current;
						current =Next;
						
					 
					 }
					 node = prev;
					 return node;
			  
	
			  }		 
			  
			  
		public static void main(String args[])
		  {
		    LinkedList list = new LinkedList();
			list.append(6);
			list.push(7);
			list.push(1);
			list.append(4);
			list.addAfter(list.head.next,8);
			
		     list.printList();
			 System.out.println("reverse likedlist is:");
			list.reverse(list.head);
			list.printList();
		  }
	 
 
 
 }