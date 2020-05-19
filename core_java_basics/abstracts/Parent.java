package core_java_basics.abstracts;

public abstract class Parent {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public abstract void start();

	public abstract void stop();

	public void run() {
		start();
		stop();
	}

}
