package chapter03.ioDecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) {

        int c;

        try {

            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\head0\\OneDrive\\바탕 화면\\Ham\\헤드퍼스트 디자인패턴\\DesignPattern\\src\\chapter03\\text.txt")));
            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
