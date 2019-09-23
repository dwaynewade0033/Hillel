package DecoratePatternOOP;

public class UpperCaseTextProcessor extends TextDecorator{
    public UpperCaseTextProcessor(TextProcessor textProcessor) {
        super(textProcessor);
    }

    @Override
    public String out() {
        return super.out().toUpperCase();
    }
}
