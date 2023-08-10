class Msword extends Thread
{
	Msword (String name) {
	super(name);
	}
	public void run(){
		if(getName().equals("typing")){
			typing();
		}
			else if(getName().equals("spellcheck")){

				spellcheck();
			}
			else {
				autosave();
			}
	}

	void typing(){
		for(int i=0;i<=5;i++){
			try{
				System.out.println("Typing...");
				Thread.sleep(2000);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			System.out.println(" ");

		}
	}

	void spellcheck(){
		for(int i=0;i<=5;i++){
			try{
				System.out.println("Spell Checking...");
				Thread.sleep(2000);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}

	void autosave(){
		for(int i=0;i<=5;i++){
			try{
				System.out.println("Auto Saving...");
				Thread.sleep(2000);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}

}



class MswordApp 
{
	public static void main(String[] args) 
	{
		Msword m1=new Msword("typing");
		Msword m2=new Msword("spellcheck");
		Msword m3=new Msword("autosave");

		m2.setDaemon(true);
		m3.setDaemon(true);

		m2.setPriority(8);
		m3.setPriority(8);


		m1.start();
		m2.start();
		m3.start();

	}
}
