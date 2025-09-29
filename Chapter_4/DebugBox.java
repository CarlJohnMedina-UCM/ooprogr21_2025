import java.util.Scanner;

public class DebugBox {
    private int width;
    private int length;
    private int height;'


    public DebugBox() {
        length = 1;
        width = 1;
        height = 1;
    }

    public DebugBox(int width, int length, int height) {
      this.width = width;
      this.length = length;
      this.height = height;
    }

    public void showData() {
        System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
    }

    public double getVolume() {
        return length * width * height;
    }

    public int getWidth() { return width; }
    public int getLength() { return length; }
    public int getHeight() { return height; }

    public void setWidth(int width) { this.width = width; }
    public void setLength(int length) { this.length = length; }
    public void setHeight(int height) { this.height = height; }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        int w = scanner.nextInt();

        System.out.print("Enter length: ");
        int l = scanner.nextInt();

        System.out.print("Enter height: ");
        int h = scanner.nextInt();

        DebugBox box = new DebugBox(w, l, h);
        box.showData();
        System.out.println("Volume: " + box.getVolume());
    }
}
