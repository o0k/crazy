package cn.zhp.TuYa;

public class TuYa {
    public static void main(String[] args) {
        int row = 10;
        for (; row > 0; ) {
            int col = row;
            // 1.如果是>呢？
            // 2.如果是row呢？
            while (col >= 0) {
                System.out.print(col + " ");
                col -= 2;
            }
            row = row / col;

            // System.out.println("row:" + row);
        }
    }
}
