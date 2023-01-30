public class TestIntBST {
   public static void main(String[] args) {
      IntBST bst = new IntBST();

      bst.add(7);
      bst.add(5);
      bst.add(8);
      bst.inOrderPrintTraversal();
      bst.remove(7);

      bst.inOrderPrintTraversal();

   }
}
