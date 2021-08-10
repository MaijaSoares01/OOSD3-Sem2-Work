package lecture06;

public class Assignment1Solution {

	public static void main(String[] args) {
		Repository repo = new Repository();
		Counter counter = new Counter(repo);
		Publisher publisher = new Publisher(repo);
		new Thread(counter).start();
		publisher.start();
	}
}

class Counter implements Runnable{
	Repository repo;
	public Counter(Repository repo) {
		this.repo = repo;
	}
	
	@Override
	public void run() {
		synchronized (repo) {
			for(int i = 0; i < 100; i++) {
				while(!repo.isPrinted()) {
					try {
						repo.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
					System.out.println("Counter Thread setting value: " + i);
					repo.setValue(i);
					repo.setPrinted(false);
					repo.notify();
				}
			}
		}
	}

class Publisher extends Thread{
	Repository repo;
	public Publisher(Repository repo) {
		this.repo = repo;
	}
	public void run() {
		synchronized (repo) {
			for(int i = 0; i < 100; i++) {
				while(repo.isPrinted()) {
					try {
						repo.wait();
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Publisher Thread reading value: " + repo.getValue());
				repo.setPrinted(true);
				repo.notify();
			}
		}
	}
}

class Repository{
	private boolean printed = true;
	private int value;
	public int getValue() {
		return this.value;
	}
	public void setPrinted(boolean printed) {
		this.printed = printed;
		
	}
	public void setValue(int value) {
		this.value = value;
	}
	public boolean isPrinted() {
		return printed;
	}
}
