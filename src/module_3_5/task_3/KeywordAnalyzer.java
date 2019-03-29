package module_3_5.task_3;

// Основная логика
abstract class KeywordAnalyzer implements TextAnalyzer {

    // возвращает набор ключевых слов
    protected abstract String[] getKeywords();

    // метка, которой необходимо пометить положительные срабатывания
    protected abstract Label getLabel();

    public Label processText(String text) {
        String[] keywords = getKeywords();

        for (String keyword : keywords) {

            // Проверяем текст на наличие каких-либо ключевых слов
            if (text.contains(keyword)) {
                // делаем метку
                return getLabel();
            }

        }
        return Label.OK;
    }

}