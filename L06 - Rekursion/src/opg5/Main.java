package opg5;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        scanDir("D:\\Discord");
    }

    public static void scanDir(String path) {
        scanDir(path, 1);
    }

    private static void scanDir(String path, int l) {
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.printf("%-4d %s\n", l, file.getName());
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                scanDir(files[i].getPath(), l + 1);
            }
        }
    }
}
