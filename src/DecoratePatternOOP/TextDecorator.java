package DecoratePatternOOP;

public abstract class TextDecorator  implements TextProcessor{
    protected TextProcessor textProcessor;

    public TextDecorator(TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
    }

    public void setTextProcessor(TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
    }

    @Override
    public String out() {
        return textProcessor.out();
    }
}
