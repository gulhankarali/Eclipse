package Repl;

abstract class Animal {
    private String name;

    Animal(String name) {
       this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String breed;
    
    Dog(String breed) {
    	super(breed);
        this.breed = breed;
    }

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    public static void main(String[] args) {
    short arr []= new short[2];
    arr[0] = 5;
    arr[1] = 10;
    System.out.println("[" + arr[0] + ", " + arr[1] + "]");
    }
}

