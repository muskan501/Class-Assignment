package Assignment;

//import BST.BinarySearchTree.Node;

//import BST.BinarySearchTree.Node;

public class BinarySearchTree {
	class Node
	{
		int data;
		Node left,right;
		
		public Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	static Node root; 
    BinarySearchTree() {  
        root = null;  
    } 
    public void insert(int data) 
    { 
        root = insert1(root, data); 
     } 
    
    public Node insert1(Node root,int data)
    {
    	 if (root == null) { 
             root = new Node(data); 
             return root; 
         } 
         if (data < root.data) 
             root.right = insert1(root.right, data); 
         else if (data > root.data) 
             root.left = insert1(root.left, data); 
   
         return root; 
    }
   public static void inorder()
    {
    	inorder1(root);
    }
   public static void inorder1(Node root)
    {
	   if(root==null)
	   {
		   return ;
	   }
	   else
	   { 
           inorder1(root.left); 
           System.out.print(root.data+" "); 
           inorder1(root.right); 
       } 
	  
    }
   public static void preorder()
   {
   	preorder1(root);
   }
  public static void preorder1(Node root)
   {
	  if(root==null)
	   {
		   return ;
	   }
	  else
	  {
          System.out.print(root.data+" "); 
          preorder1(root.left); 
          preorder1(root.right); 
      } 
	 
   }
  public static void postorder()
  {
  	postorder1(root);
  }
 public static void postorder1(Node root)
  {
	  if(root==null)
	   {
		   return ;
	   }
	  else
	  {
		  postorder1(root.left); 
		  postorder1(root.right);
         System.out.print(root.data+" "); 
     } 
	 
  }
 public static int height() {
	 return height1(root);
 }
 public static int height1(Node root)
 {
	  if(root==null)
	  {
		  return 0;
	  }
	  else
	  {
		  int l=height1(root.left);
		  int r=height1(root.right);
	  
	  if(l>r)
	  {
		  return (l+1);
	  }
	  else
	  {
		  return (r+1);
		  
	  }
	  }
 }
public static void printLevelOrder()
{
	printLevelOrder1(root);
}
public static void printLevelOrder1(Node root)
{
	int h=height();
	for(int i=0;i<=h;i++)
	{
		printLevelOrder2(root,i);
		
	}
}
 public static void printLevelOrder2(Node root, int l)
 {
	 if (root == null) 
         return; 
     if (l == 1) 
         System.out.print(root.data+" "); 
     else if (l> 1) 
     { 
    	 printLevelOrder2(root.left, l-1); 
    	 printLevelOrder2(root.right, l-1); 
    	
    	 
     }  
 }
 public static void printReverseLevelOrder()
 {
 	printReverseLevelOrder1(root);
 }
 public static void printReverseLevelOrder1(Node root)
 {
 	int h=height();
 	for(int i=h;i>=1;i--)
 	{
 		printReverseLevelOrder2(root,i);
 		
 	}
 }
  public static void printReverseLevelOrder2(Node root, int l)
  {
 	 if (root == null) 
          return; 
      if (l == 1) 
          System.out.print(root.data+" "); 
      else if (l> 1) 
      { 
     	 printReverseLevelOrder2(root.left, l-1); 
     	 printReverseLevelOrder2(root.right, l-1); 
     	
     	 
      }  
  }
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree t=new BinarySearchTree();
		t.insert(40);
		t.insert(30);
		t.insert(70);
		t.insert(20);
		t.insert(35);
		t.insert(50);
		t.insert(80);
		System.out.print("inorder=");
		t.inorder();
		System.out.println();
		System.out.print("preorder=");
		t.preorder();
		System.out.println();
		System.out.print("postorder=");
		t.postorder();
		System.out.println();
		//System.out.print(t.height());
		System.out.print("Level order=");
		t.printLevelOrder();
		System.out.println();
		System.out.print("reverse order=");
		t.printReverseLevelOrder();
		
	}
}
