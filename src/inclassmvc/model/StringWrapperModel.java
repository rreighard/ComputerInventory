package inclassmvc.model;

public class StringWrapperModel {
    private String wrappedString;

    public StringWrapperModel(String str){
        wrappedString = str.isEmpty() ? "This is the default value" : str;
    }

    public String getText() { return wrappedString; };
    public void setText(String str) { wrappedString = str; }
    public String reverseText() { return new StringBuilder(wrappedString).reverse().toString(); }
}
