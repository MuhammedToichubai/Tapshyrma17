package com.company;

public class Main {

    public static void main(String[] args) {
//        Animal деген класс тузунуз жана бир метод кошунуз.
//        Анын 3 наследнигин тузунуз.
//
//        Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
//        Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин
//        кошунуз.
//                instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
//        чыгарыныз.
//                Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды
//        болуп оз озунун массивине салыныз

                Animal shark = new Shark(777.7,"Blue",true);
                Animal eagle = new Eagle(10.2,"Brown",180);
                Animal turtle = new Turtle(25.12,"Green",150);

                Animal[] animals = {turtle, eagle, shark};

                for (Animal s : animals) {
                    if (s instanceof Shark) {
                        ((Shark) s).attack();
                    }
                    if (s.getClass().getName().equals("tapshyrma17.Shark")) {
                        ((Shark) s).attack();
                    }

                    if (s instanceof Turtle) {
                        ((Turtle) s).swim();
                    }
                    if (s.getClass().getName().equals("tapshyrma17.Turtle")) {
                        ((Turtle) s).swim();
                    }
                    if (s instanceof Eagle) {
                        ((Eagle) s).fly();
                    }
                    if (s.getClass().getName().equals("tapshyrma17.Eagle")) {
                        ((Eagle) s).fly();
                    }
                    System.out.println();
                }
                Animal[] reptile = {turtle};
                Animal[] fish = {shark};
                Animal[] bird = {eagle};

        }
}
