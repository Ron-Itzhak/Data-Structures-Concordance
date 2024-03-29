public class LinkedList { 
  
    Node head; // head of list 
    ///
        // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        char data; 
        Node next; 
        BinarySearchTree tree;
        
        // Constructor 
        Node(char d){
        	
        	tree= new BinarySearchTree();
            data = d; 
            next = null; 
        } 
    }
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, char data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
  
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
  
        // Return the list by head 
        return list; 
    } 
    
    
    
    public void wordInsert(Word word) {
    	//fix this
        Node currNode = this.head; 

        while(this.head.data!=word.data.charAt(0)) {
    		currNode = head.next;

    	}
        currNode.tree.insert(word);
    }

    
    
    
    
  
    // Method to print the LinkedList. 
    public void printList() 
    { 
        Node currNode = this.head; 
   
        System.out.println("Concordance:"); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
           // System.out.print(currNode.data + " "); 
             currNode.tree.inOrderPrint(currNode.tree.getRoot());; 

   
            // Go to next node 
            currNode = currNode.next; 
        } 

}
    
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 'a'); 
        list = insert(list, 'b'); 
        list = insert(list, 'c'); 
        list = insert(list, (char)65); 
        list = insert(list, (char)5); 
        list = insert(list,(char) 6); 
        list = insert(list, (char)7); 
        list = insert(list,(char) 8); 
  
        // Print the LinkedList 
        list.printList(); 
    } 
    
    }
