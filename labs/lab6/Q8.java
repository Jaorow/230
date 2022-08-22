import java.awt.*;

interface Incrementer {
	public void increment();
}

class Rectangle {
	private Point topLeft = new Point(0,0);
	private int width=10, height=20;

	private Incrementer smallMove = this.new MyIncrementer(1,1);

	public void moving(){
		smallMove.increment();
	}
	private Incrementer bigJump = this.new MyIncrementer(10,10);

	public void jumping(){
		bigJump.increment();
	}

	public Rectangle() { this(0,0,10,20); }
	public Rectangle(int x, int y, int width, int height) {
		topLeft = new Point(x,y);
		this.width = width;
		this.height = height;
	}
	public String toString() { return String.format("The rectangle is at (%d, %d).", topLeft.x, topLeft.y); }
	class MyIncrementer implements Incrementer{
		private int deltaX;
		private int deltaY;
		public MyIncrementer(){
			this(1,1);
		}
		public MyIncrementer(int x,int y){
			deltaX = x;
			deltaY = y;
		}


		public void increment() {
			topLeft.x += deltaX;
			topLeft.y += deltaY;
		}
		
	}

}