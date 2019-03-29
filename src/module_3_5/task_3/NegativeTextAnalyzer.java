package module_3_5.task_3;

// Класс конструируется конструктором по-умолчанию
class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    // Негативное содержание
    private final String[] KEYWORDS = {":(", "=(", ":|"};

    @Override
    protected String[] getKeywords() {
        return KEYWORDS;
    }

    // Возвращаем негативный текст
    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

}