package com.sujata.demo;

abstract public class Fighter {

	KickBehaviour kickBehaviour;
	JumpBehaviour jumpBehaviour;
	public Fighter(KickBehaviour kickBehaviour, JumpBehaviour jumpBehaviour) {
		super();
		this.kickBehaviour = kickBehaviour;
		this.jumpBehaviour = jumpBehaviour;
	}
	public KickBehaviour getKickBehaviour() {
		return kickBehaviour;
	}
	public void setKickBehaviour(KickBehaviour kickBehaviour) {
		this.kickBehaviour = kickBehaviour;
	}
	public JumpBehaviour getJumpBehaviour() {
		return jumpBehaviour;
	}
	public void setJumpBehaviour(JumpBehaviour jumpBehaviour) {
		this.jumpBehaviour = jumpBehaviour;
	}
	
	public void kick(){
		kickBehaviour.kick();
	}
	public void jump(){
		jumpBehaviour.jump();
	}
	public void punch(){
		System.out.println("Default Punch");
	}
	public void roll(){
		System.out.println("Default Roll");
	}
	
	abstract public void display();
}
