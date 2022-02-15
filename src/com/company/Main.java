package com.company;

import java.util.Arrays;

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

        Animal[] animals ={shark,eagle,turtle};

        Shark[] fish = new Shark[1];
        Eagle[] bird = new Eagle[4];
        Turtle[] reptile = new Turtle[3];
        int d = 0;
                for (Animal animal : animals) {
                    if (animal instanceof Shark) {
                      ((Shark) animal).attack();
                      fish[d] = (Shark) animal;
                      d++;
                    }
                    if (animal.getClass().getName().equals("tapshyrma17.Shark")) {
                       ((Shark) animal).attack();
                    }
                    if (animal instanceof Eagle) {
                        ((Eagle) animal).fly();
                        bird[d] = (Eagle) animal;
                        d++;
                    }
                    if (animal.getClass().getName().equals("tapshyrma17.Eagle")) {
                        ((Eagle) animal).fly();

                    }
                    if (animal instanceof Turtle) {
                        ((Turtle) animal).swim();
                        reptile[d] = (Turtle) animal;
                        d++;
                    }
                    if (animal.getClass().getName().equals("tapshyrma17.Turtle")) {
                        ((Turtle) animal).swim();
                    }
                }







        }
}
