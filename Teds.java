public class Teds {
 static class cell {
      int x;
      int y;
        cell (int x, int y) {
          this.x = x;
          this.y = y;
        }
      @Override
      public boolean equals(Object obj) {
        if (this == obj) {
          return true;
        }
        cell t = (cell) obj;
        if ((this.x == t.x && this.y == t.y) || (this.x== t.y && this.y == t.x)) {
          return true;
        }
        return false;
      }
      @Override
      public int hashCode() {
        return x * 101 + y * 101 * 101; 
      }
    }

    public static void main(String[] args) {
    	cell a = new cell(2, 4);
    	cell b = new cell(4, 2);
    	System.out.println(a.equals(b));
    }
}