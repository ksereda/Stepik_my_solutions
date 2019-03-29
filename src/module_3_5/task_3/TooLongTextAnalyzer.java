package module_3_5.task_3;

// Класс должен конструироваться от int'а с максимальной допустимой длиной комментария.
// Объект этого класса должен сохранять в своем состоянии это число в приватном поле maxLength.
class TooLongTextAnalyzer implements TextAnalyzer {

    // максимально допустимая длинна комментария
    private int maxLength;

    public TooLongTextAnalyzer(int threshold) {
        this.maxLength = threshold;
    }

    // Если длинна текста превышает заданныый диапазон, то возвращаем "слишком длинный"
    @Override
    public Label processText(String text) {
        if (text.length() > maxLength)
            return Label.TOO_LONG;
        else
            return Label.OK;
    }

}