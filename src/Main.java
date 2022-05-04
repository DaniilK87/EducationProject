public class Main {


    public static void main(String[] args) {
        short numberOne = 2580;
        int numberTwo = 2250;
        numberOne = (short) numberTwo;
        System.out.println(numberOne);
        numberTwo = 32801;
        numberOne = (short) numberTwo;
        System.out.println(numberOne);

        LessonOne lessonOne = new LessonOne();
        lessonOne.setNumberOne((short)2580);
        lessonOne.setNumberTwo(2250);
        short one = lessonOne.getNumberOne();
        int two = lessonOne.getNumberTwo();
        one = (short) two;
        System.out.println(one);
        lessonOne.setNumberTwo(32801);
        two = lessonOne.getNumberTwo();
        one = (short) two;
        System.out.println(one);
    }
}
