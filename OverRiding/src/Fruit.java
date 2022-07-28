class Fruit {  
       String name, taste, size;  
       void eat() {  
            System.out.println("Eating Fruits...");  
       }  
  }  
  class Apple extends Fruit {  
       Apple() {  
            name = "Apple";  
            taste = "sweet and caramelized";  
       }  
       @Override  
       void eat() {  
            System.out.println(name + " is "+ taste + " in taste.");  
       }  
  }  
  class Orange extends Fruit {  
       Orange() {  
            name = "Orange";  
            taste = "sweet-tert";  
       }  
       @Override  
       void eat() {  
            System.out.println(name + " is "+ taste + " in taste.");  
       }       
  }  
  