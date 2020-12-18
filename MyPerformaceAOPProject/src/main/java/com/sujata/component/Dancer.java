package com.sujata.component;

public class Dancer implements Performer {

	private String style;

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public void perform() {
		//Cross Cutting concern : Audience
//		Audience audience = new Audience();
//		try {
//			audience.takeSeats();
//			audience.switchOffPh();
//			//BussinessLogic
			System.out.println("Dancer is dancing in " + style + " Style");
//			audience.applaud();
//		} catch (Exception ex) {
//			audience.demandRefund();
//		} finally {
//			audience.leaveAudi();
//		}
	}

}
