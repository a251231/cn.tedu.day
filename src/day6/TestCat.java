package day6;

public class TestCat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.color="bule";
        cat.kind="dog";
        cat.size=1000;
        Cat.ailild catailild=new Cat.ailild();
        catailild.jiao();
        catailild.sajiao();

    }
}
    class Cat{
        String color;
        double size;
        String kind;
        static class ailild{
            public void jiao(){
                System.out.println("喵喵");
            }
            public void sajiao(){
                System.out.println("打滚");
            }

        }

    }
