package com.sujata.demo;

class Chat{
	
	private boolean quest=true;
	
	synchronized void question(String ques){
		if(quest==false){
			try {
				wait();  // method of Object class
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+ques);
		quest=false;
		notify();  //method of Object class
	}
	
	synchronized void answer(String ans){
		if(quest==true){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+ans);
		quest=true;
		notify();
	}
}

class QuestionJob implements Runnable{

	private Chat chat;
	String[] questions={"hello","How are you?","I am fine too!"};
	
	
	public QuestionJob(Chat chat) {
		super();
		this.chat = chat;
	}


	@Override
	public void run() {
		for(String question:questions){
			chat.question(question);
		}
		
	}
	
}

class AnswerJob implements Runnable{

	private Chat chat;
	String[] answers={"Hi","I am fine, Thanks ! How about you?","Gr8!"};
	
	public AnswerJob(Chat chat) {
		super();
		this.chat = chat;
	}

	@Override
	public void run() {
		for(String answer:answers){
			chat.answer(answer);
		}
		
	}
	
}


public class WaitAndNotifyDemo {

	public static void main(String[] args) {
		Chat chat=new Chat();
		
		Thread diksh=new Thread(new QuestionJob(chat), "Diksha");
		Thread pooja=new Thread(new AnswerJob(chat), "Pooja");
		
		
		diksh.start();
		pooja.start();

	}

}
