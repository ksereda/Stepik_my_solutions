package module_3_5.task_3;

// Класс конструируется от массива строк с ключевыми словами. Объект этого класса должен сохранять в своем состоянии этот массив строк в приватном поле keywords.
class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    // Сохраняет массив ключевых строк с ключевыми словами в приватном поле keywords
    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    // Возвращаем спам
    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

}