package com.ready.rain.entity.mib;

import java.awt.image.BufferedImage;

public class Gun {

		public BufferedImage gun;
		public BufferedImage gun2;
		public BufferedImage bullet;
		public String type;
		
		public Gun (
				BufferedImage gun,
				BufferedImage gun2,
				BufferedImage bullet,
				String type
				) {

			this.gun = gun;
			this.gun2 = gun2;
			this.bullet = bullet;
			this.type = type;
			}
}
