public class Main {
public static void main(String[] args) {
    File file = null;
    Handler textHandler = new TextFileHandler("Text Handler");
    Handler imageHandler = new ImageFileHandler("Image Handler");
    Handler docHandler = new DocFileHandler("Document Handler");
    textHandler.setHandler(docHandler);
    docHandler.setHandler(imageHandler);

    //Pass a text file into a text file handler --> return the process text file
    file = new File("OOP.txt", "text", "C:/OOP");
    textHandler.process(file);

    //Pass a doc file into a text file handler --> not supported
    file = new File("bore_pen_young.doc", "document", "D:");
    textHandler.process(file);

    //Pass a doc file into an image file handler --> not supported
    file = new File("HelloWorld.jpg", "image", "C:");
    textHandler.process(file);

    //Pass a doc file into a doc handler --> should be supported
    file = new File("resignation_letter.doc", "document", "D:");
    docHandler.process(file);

    }
}