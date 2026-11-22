import java.util.Scanner;

abstract class Shape {
    abstract int getPerimeter();
}

class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    int getPerimeter() {
        return 2 * (length + width);
    }
}

class Square extends Shape {
    int length;

    Square(int length) {
        this.length = length;
    }

    @Override
    int getPerimeter() {
        return 4 * length;
    }
}

class Triangle extends Shape {
    int side1;
    int side2;
    int side3;

    Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    int getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class Shape_Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        input.nextLine(); // 清除換行符號
        Shape[] shapes = new Shape[total];

        for (int i = 0; i < total; i++) {
            char type = input.next().charAt(0);
            if (type == 'R') {
                int length = input.nextInt();
                int width = input.nextInt();
                shapes[i] = new Rectangle(length, width);
            } else if (type == 'S') {
                int length = input.nextInt();
                shapes[i] = new Square(length);
            } else if (type == 'T') {
                int side1 = input.nextInt();
                int side2 = input.nextInt();
                int side3 = input.nextInt();
                shapes[i] = new Triangle(side1, side2, side3);
            }
        }

        for (Shape shape : shapes) {
            System.out.println(shape.getPerimeter());
        }
        input.close();
    }
}
