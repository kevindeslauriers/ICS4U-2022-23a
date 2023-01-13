public class IntArrayStack {
   private static final int DEFAULT_CAPACITY = 10;

   private Integer[] data;
   private int top;

   public IntArrayStack() {
      data = new Integer[DEFAULT_CAPACITY];
      top = -1;
   }

   public void push(Integer el) {
      if (top + 1 == data.length) {
         Integer[] temp = new Integer[data.length * 2];
         for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
         }
         data = temp;
      }

      data[top++] = el;
   }

   public Integer pop() {
      if (top < 0) {
         return null;
      } else {
         top--;
         return data[top + 1];
      }
   }

   public boolean isEmpty() {
      return top < 0;
   }

   public Integer peek() {
      if (top < 0) {
         return null;
      } else {
         return data[top];
      }
   }

}
