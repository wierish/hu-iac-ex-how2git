package nl.rkuijt;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        App app = new App();
        try {
            app.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
