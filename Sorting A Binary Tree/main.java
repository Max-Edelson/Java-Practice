class main {
  public static void main(String args[]) {
    BinaryTree tree = new BinaryTree();
    tree.add(5);
    tree.add(2);
    tree.add(7);
    tree.add(3);
    tree.add(9);
    tree.add(1);

    //System.out.println("Search for 9: " + tree.search(9) + "\n");
    tree.print();
    System.out.println("Delete 7");
    tree.print();

    //System.out.println("Root: " + tree.root.value);
  }
}
