package com.sujata.training;

import com.sujata.demo.Fighter;
import com.sujata.demo.Ken;
import com.sujata.demo.LongJump;
import com.sujata.demo.TarnadoKick;

public class StreetFighter {

	public static void main(String[] args) {
		Fighter ken=new Ken(new TarnadoKick(), new LongJump());
		ken.display();
		ken.kick();
		ken.jump();
		ken.roll();
		ken.punch();

	}

}
