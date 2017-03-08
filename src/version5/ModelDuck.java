package version5;

public class ModelDuck extends Duck {

        public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
            this.setFlyBehavior(flyBehavior);
            this.setQuackBehavior(quackBehavior);
        }
	public void display() {
		System.out.println("I'm a model duck");
	}
}
