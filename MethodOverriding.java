

 class MethodOverriding {
    int a=40;
    void display(){
        System.out.println("no is:"+a);
    }

    class First extends MethodOverriding{
        int b=10;
        void display(){
            System.out.println("The no is: "+b);
        }
    }
    class Second extends First{
        int c=20;
        void display(){
            System.out.println("The new no is: "+c);
        }
    }
}
class Demo{
    public static void main(String[] args) {
        MethodOverriding obj1=new MethodOverriding();
        MethodOverriding obj2 = new First();
        MethodOverriding obj3=new Second();
        obj1.display();
        obj2.display();
        obj3.display();



    }
}