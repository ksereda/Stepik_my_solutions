package module_3_3;

/*
На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y. Ось X смотрит слева направо, ось Y — снизу вверх.
(Помните, как рисовали графики функций в школе?)

В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз, направо или налево.
Ваша задача — привести робота в заданную точку игрового поля.

Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):

public class Robot {

    public Direction getDirection() {
        // текущее направление взгляда
    }

    public int getX() {
        // текущая координата X
    }

    public int getY() {
        // текущая координата Y
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}
Direction, направление взгляда робота,  — это перечисление:

public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

Пример

В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP

Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:

robot.turnRight();
robot.stepForward();
robot.stepForward();
robot.stepForward();


P.S. Если вам понравилось это задание, то вам может прийтись по душе игра Robocode, в которой надо написать алгоритм управления танком.
Алгоритмы, написанные разными людьми, соревнуются между собой.

 */

public class Main {

    public static void moveRobot(Robot robot, int toX, int toY) {
        Direction dirX = robot.getDirection();
        Direction dirY = robot.getDirection();

        // отнимаем от переданной в метод координаты текущю координату по оси Х и определаем направление взгляда робота
        dirX = toX - robot.getX() > 0 ? Direction.RIGHT : Direction.LEFT;
        dirY = toY - robot.getY() > 0 ? Direction.UP : Direction.DOWN;

        // пока текущее направление взгляда не равно dirX (в нашем случае dirX = Direction.RIGHT)
        while (robot.getDirection() != dirX) {
            robot.turnRight();
        }

        // пока переданная в метод координата минус текущая координата робота по оси Х не равна 0, то делаем шаг.
        // Когда робот дойдет до 3-ей позиции по оси Х, то он остановится и не сделает больше шаг.
        while (toX - robot.getX() != 0) {
            robot.stepForward();
        }

        // По оси Y у нас аналогичные проверки (но в условии координата по оси У = 0)
        while (robot.getDirection() != dirY) {
            robot.turnRight();
        }

        while (toY - robot.getY() != 0) {
            robot.stepForward();
        }
    }

}
