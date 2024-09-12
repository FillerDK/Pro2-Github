package opg5;

import java.io.File;

public class Main {
    public static void main(String[] args) {

    }

    public static void scanDir(String path, int l) {
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println(l + " " + file.getName());
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                scanDir(files[i].getPath(), l + 1);
            }
        }
    }
}
