package com.hiooih.asciipic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author duwenlei
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        final String base = "abcdefghijklmnupqrstuvwxyz.,/";// 字符串由复杂到简单
        String imgPath = "C:\\Users\\duwenlei\\Pictures\\4.png";
        String txtPath = "C:\\Users\\duwenlei\\Pictures\\1.txt";
        FileWriter fileWriter = new FileWriter(txtPath);
        BufferedImage bufferedImage = ImageIO.read(new FileInputStream(imgPath));
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        for (int y = 0; y < height; y += 2) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x += 2) {
                int rgb = bufferedImage.getRGB(x, y);
                final int r = (rgb & 0xff0000) >> 16, g = (rgb & 0xff00) >> 8, b = rgb & 0xff;
                final float gray = 0.299f * r + 0.578f * g + 0.114f * b;
                final int index = Math.round(gray * (base.length() + 1) / 255);
                String s = index >= base.length() ? " " : String.valueOf(base.charAt(index));
                sb.append(s);
            }
            System.out.println(sb.toString());
            fileWriter.write(sb.toString());
            fileWriter.write("/r/n");
        }
        fileWriter.close();
    }
}
