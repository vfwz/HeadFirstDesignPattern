package chapterone;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		// 绿头鸭使用Quack类处理呱呱叫，所以当performQuack()被调用时，叫的职责被委托给Quack对象，而我们得到了真正的呱呱叫
		quackBehavior  = new Quack();
		// 使用FlyWithWings作为其FlyBehavior类型
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}
