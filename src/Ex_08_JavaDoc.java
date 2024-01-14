/*
Javadoc is a tool that generates Java code documentation in the HTML format from Java source code. The documentation is formed from Javadoc comments that are usually placed above classes, methods, or fields.
https://www.jetbrains.com/help/idea/working-with-code-documentation.html
*/


/**
 * Ex_08_JavaDoc
 */
public class Ex_08_JavaDoc {
    /**
     * main
     * @param args
     */
    public static void main(String[] args) {


    }

    private String message;

    /**
     * GetMessage
     * @return
     */
    public String GetMessage() {
        return message;
    }

    /**
     * SetMessage
     * @param _message
     */
    public void SetMessage(String _message) {
        this.message = _message;
    }
}
