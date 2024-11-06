package seiderer.fotobox.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class ImageUtil {

    public static void saveBase64Image(String base64String, String filePath) throws IOException {
        // Dekodieren des Base64-Strings
        byte[] imageBytes = Base64.getDecoder().decode(base64String);

        // Speichern des Bildes
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(imageBytes);
        }
    }
}