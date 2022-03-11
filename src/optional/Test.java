package optional;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<Point> list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(new Point(scan.nextInt(), scan.nextInt()));
        }

        Collections.sort(list);
        list.forEach(System.out::println);
    }
}

class Point implements Comparable<Point> {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Point point) {
        if (this.y == point.getY()) {
            return this.x - point.getX();
        } else {
            return this.y - point.getY();
        }
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }
}
