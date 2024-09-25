// class BankAccount<T extends Number>{
//   public void display(T[]t1){
//     for(T i:t1){
//       System.out.println(i+" ");
//     }
//   }
// }
// public class Geneics{
//   public static void main(String[]args){
//     BankAccount<Number>b1=new BankAccount<>();
//     Integer[]m1={100,200,300};
//     Double[]m2={20.45,12.34};
//     b1.display(m1);
//     b1.display(m2);
//   }
// }

import java.util.ArrayList;
import java.util.List;
class Animal{
  public void eat(){
    System.out.println("Animal is eating");
  }

}
class Dog extends Animal{
  @Override
  public void eat(){
    System.out.println("Dog is eating");
  }
}
class Rat{
  public void eat(){
    System.out.println("cat is eating");

  }
}
class Cat extends Animal{
  @Override
  public void eat(){
    System.out.println("cat is eating.");
  }
}
// public class Geneics{
//   public static void feedAnimals(List<? extends Animal>animals){
//     for(Animal animal:animals){
//       animal.eat();
//     }
//   }
//   public static void main(String[]args){
//     List<Dog>dogs=new ArrayList<>();
//     dogs.add(new Dog());
//     dogs.add(new Dog());
//     List<Cat> cats=new ArrayList<>();
//     cats.add(new Cat());
//     cats.add(new Cat());
//     List<Rat>rat=new ArrayList<>();
//     rat.add(new Rat());
//     feedAnimals(dogs);
//     feedAnimals(cats);
//   }
// }
public class Geneics{
  public static void feedAnimals(List<? super Dog>animals){
      for(Object animal:animals){
        ((Animal)animal).eat();
      }
  }
  public static void main(String[]args){
    List<Dog>dogs=new ArrayList<>();
    dogs.add(new Dog());
    dogs.add(new Dog());

    List<Cat>cats=new ArrayList<>();
    cats.add(new Cat());
    cats.add(new Cat());
    List<Animal>Ani=new ArrayList<>();
    Ani.add(new Animal());
    feedAnimals(dogs);
    feedAnimals(Ani);
  }
  }