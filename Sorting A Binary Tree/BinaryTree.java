class BinaryTree {
    Node root;

    BinaryTree() {}

    public void add(int val) {
      addRecursive(root, val);
    }

    private Node addRecursive(Node curr, int val) {
      if (root == null) {
        root = new Node(val);
      }
      else if (curr == null) {
        Node temp = new Node(val);
        return temp;
      }
      else {
        if (curr.value >= val) {
          curr.left = addRecursive(curr.left, val);
        }
        else if (curr.value < val) {
          curr.right = addRecursive(curr.right, val);
        }
      }
      return curr;
    }

    public boolean search(int val) {
      return search(root, val);
    }

    private boolean search(Node curr, int val) {
      if (curr == null)
        return false;
      if (curr.value == val)
        return true;

      boolean left = search(curr.left, val);
        if (left == true)
          return left;

      boolean right = search(curr.right, val);
      return right;
    }

    //find the node with the greatest value in the left subtree
    private Node findGreatest(Node root) {
      if (root.right == null)
        return null;

      return root.right;
    }

    public void remove(int val) {
      root = remove(root, val);
    }

    private Node remove(Node curr, int val) {
      if (curr == null)
        return null;
      if (curr.value == val) {
        //found value
          if (curr.left == null && curr.right == null) {
            //node is a leaf Node
            return null;
          }
          else if (curr.left == null) {
            //check right subtree
            return curr.right; //get rid of remove
          }
          else if (curr.right == null) {
            //check left subtree
            return curr.left; //get rid of remove
          }
          else {
            //node has two children
            //find the greatest value in the left subtree of curr
            int greatest = findGreatest(curr.left).value;
            curr.value = greatest;
            curr.left = remove(curr.left, greatest);
            return curr;
          }
      }
      else if (curr.value > val) {
        //check left subtree
        curr.left = remove(curr.left, val);
        return curr;
      }
      else {
        //check right subtree
        curr.right = remove(curr.right, val);
        return curr;
      }
    }

    public void print() {
      print(root);
    }

    private void print(Node root) {
      if (root != null) {
        System.out.println(root.value + "   ");
        print(root.left);
        print(root.right);
      }
    }
}
