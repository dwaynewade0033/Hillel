package Streams;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.*;
import java.time.Duration;

public class Stream {
    public static void main(String[] args) throws IOException {
        copyFile("C:\\Users\\Denis\\Desktop\\Hillel\\src\\Streams\\1.txt", "C:\\Users\\Denis\\Desktop\\Hillel\\src\\Streams\\2.txt");
    }



    private static void compressImage(String src, String dest) throws IOException {
        BufferedImage image = ImageIO.read(new FileInputStream("1.jpg"));
        OutputStream os = new FileOutputStream("2.jpg");

        ImageWriter writer = ImageIO.getImageWritersByFormatName("jpg").next();
        ImageOutputStream ios = ImageIO.createImageOutputStream(os);
        writer.setOutput(ios);

        ImageWriteParam param = writer.getDefaultWriteParam();
        param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        param.setCompressionQuality(1f);
        writer.write(null, new IIOImage(image,null,null), param);
    }
    private static void copyFile(String src, String dest) throws IOException {
        try (InputStream is = new FileInputStream(src);
             OutputStream os = new FileOutputStream(dest, true)) {


            int data = 0;
            String sampleText = "easy text";
            while ((data = is.read()) != -1) {
                os.write(data);
            }
            os.write("\n".getBytes());
            os.write(sampleText.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void copyBigFile(String src, String dest) throws IOException {
        try (InputStream is = new BufferedInputStream(new FileInputStream(src));
             OutputStream os =new BufferedOutputStream( new FileOutputStream(dest, true))) {


            int data = 0;
            long start = System.currentTimeMillis();
            byte[] buffer = new byte[4096];
            while ((data = is.read(buffer)) != -1) {
                os.write(buffer, 0 ,data);
            }
            System.out.println(Duration.ofMillis(System.currentTimeMillis() - start));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
