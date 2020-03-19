package cn.zhp.map;

public class Dog {
    private int age;
    private String name;
    private Dog(int age,String name){
        this.age=age;
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(this==obj){
            return true;
        }
        if(obj instanceof Dog){
            Dog dog=(Dog)obj;
            if(dog.age==this.age&&dog.name.equals(this.name)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Dog dog1=new Dog(12,"wangcai");
        Dog dog2=new Dog(12,"wangcai");
        Dog dog3=new Dog(16,"wangcai");
        System.out.println(dog1.equals(dog2));//true
        System.out.println(dog1.equals(dog3));//false
    }
}
