class BinaryTree {
    Node root = null;

    BinaryTree();

    public void add(int val) {
      addRecursive(root, val);
    }

    private node addRecursive(Node curr, int val) {
      if (!curr)
        return new Node(val);

      if (curr.value > val) {
        addRecursive(curr.left, val);
      }
      else if (curr.value < val) {
        addRecursive(curr.right, val);
      }

      return curr;
    }

    public bool search(int val) {
      return search(root, val);
    }

    private bool search(Node curr, int val) {
      if (!curr)
        return false;
      if (curr.value == val)
        return true;

      if (curr.value > val)
        search(curr.left, val);
      else if (curr.value < val)
        search(curr.right, val);

      return false;
    }

    public bool remove(int val) {
      return remove(root, val);
    }

    private bool remove(Node curr, int val) {
      if (!curr)
        return false;
      if (curr.value == val) {
        
      }
    }

    print();
}
