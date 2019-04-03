package module_5_2.task_1;

/*
Напишите метод, читающий входной поток и вычисляющий контрольную сумму прочитанных данных.

Контрольная сумма данных вычисляется по следующему алгоритму:

Контрольная сумма представляет собой число типа int. Контрольная сумма пустого набора данных равна нулю.
Контрольная сумма непустого набора данных вычисляется по следующей рекуррентной формуле: 𝐶𝑛+1=rotateLeft(𝐶𝑛) xor 𝑏𝑛+1 , где 𝐶𝑛 — контрольная сумма первых n байт данных, rotateLeft — циклический сдвиг бит числа на один бит влево (чтобы не изобретать велосипед, используйте Integer.rotateLeft), 𝑏𝑛 — n-ный байт данных.
Поскольку метод не открывал данный InputStream, то и закрывать его он не должен. Выброшенное из методов InputStream исключение должно выбрасываться из метода.

Пример
На вход подан InputStream, последовательно возвращающий три байта: 0x33 0x45 0x01. В качестве контрольной суммы должно быть возвращено число 71.
*/

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static int checkSumOfStream(InputStream inputStream) throws IOException {

        int result = 0;
        int c = inputStream.read();

        while(c != -1) {
            result = Integer.rotateLeft(result, 1) ^ c;
            c = inputStream.read();
        }

        return result;
    }

}
