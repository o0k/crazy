package cn.zhp.spdb.reflectTest;

import java.lang.reflect.Method;

public class MethodInvoke {
    public static void main(String[] args) throws Exception{
        Method animalEat = Animal.class.getDeclaredMethod("eat");
        Method catEat = Animal.class.getDeclaredMethod("catEat");

        Animal animal = new Animal();
        Cat cat = new Cat();



    }

}

class Animal {

    public void eat() {
        System.out.println("Animal eat food.");
    }
}
class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat eat fishes.");
    }
}
