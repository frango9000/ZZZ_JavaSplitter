package auxp.ch17.splitter;

import java.io.*;

public class FileSplitter {

    /**
     * Recursive Byte string formatter ex: 10000 = 10.000
     * @param bytes string containing digits to be formated
     * @return x.xxx.xxx.xxx  style string
     */
    private static String byteSizeFormatter(String bytes){
        StringBuilder sb = new StringBuilder();
        if(bytes.length()<4) {
            sb.insert(0, bytes);
        }
        else {
            sb.insert(0, "."+bytes.substring(bytes.length()-3));
            sb.insert(0, byteSizeFormatter(bytes.substring(0, bytes.length() - 3)));
        }
        return sb.toString();
    }

    static String byteSizeFormatter(long bytes){
        return byteSizeFormatter(bytes+"");
    }

    void splitByPieces(int pieces){

    }

    static void splitBySize(File file, int bytes){

        int count = 0;
        try(RandomAccessFile raf = new RandomAccessFile(file, "rw")
        ) {

            while(raf.getFilePointer() != raf.length()){
                byte[] split = new byte[(int)(raf.getFilePointer()+bytes <= raf.length() ? bytes : raf.length()-raf.getFilePointer())];
                raf.read(split);
                File piece = new File(file.getAbsolutePath()+"."+String.format("%03d", count++));

                try(FileOutputStream out = new FileOutputStream(piece)){
                    out.write(split);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void join(File file0, String newFileName){
        String fullName = file0.getName().substring(0, file0.getName().length()-4);

        File orig = new File(file0.getParent()+fullName);
        File jointFile;
        if(newFileName == null || newFileName.length() == 0 )
            jointFile = orig;
        else
        jointFile = new File(file0.getParent() + newFileName);
        try(BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(jointFile))) {
            int count = 0;
            File actual;
            while (true) {
                actual = new File(orig.getAbsolutePath() + "." + String.format("%03d", count++));
                System.out.println(actual.exists());
                if (!actual.exists())
                    break;
                try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(actual))){
                    System.out.println(in.available());
                    while(in.available() != 0){
                        out.write(in.read());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
