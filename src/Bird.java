class Bird extends Animal implements Movable, Feedable {
    @Override
    public void animalSound(){
        System.out.print("Bird sound");
    }

    @Override
    public void move(){
        System.out.print("Bird moves");
    }

    @Override
    public void feed(){
        System.out.print("Bird feed");
    }

    @Override
    public void describe() {
        Movable.super.describe();
        Feedable.super.describe();
    }
}
