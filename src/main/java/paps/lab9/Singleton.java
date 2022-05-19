package paps.lab9;

public class Singleton {
    public static void main(String [] args) {
        // Создаем два объекта класса Director и задаем им разные id
        Director director1 = Director.getDirectorInstance("12345");
        Director director2 = Director.getDirectorInstance("54321");

        // Проверяем, что на экран выводится один и тот же id, то есть был создан только один экземпляр класса Director (director1)
        director1.showInfo();
        director2.showInfo();
    }
}
