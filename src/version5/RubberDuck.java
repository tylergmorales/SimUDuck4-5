package version5;

public class RubberDuck extends Duck {
	
        public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
            this.setFlyBehavior(flyBehavior);
            this.setQuackBehavior(quackBehavior);
        }
	
	public void display() {
		System.out.println("I'm a Rubber Duck");
	}
	

}
