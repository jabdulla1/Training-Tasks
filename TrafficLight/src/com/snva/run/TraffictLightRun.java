package com.snva.run;

import com.snva.module.ChangeStateColor;
import com.snva.module.TrafficLight;

public class TraffictLightRun {
	public static void run() {
		ChangeStateColor changeStateColor = new TrafficLight();
		
		int count = 600;
		while(count>=0) {
			System.out.println(changeStateColor.changeColor());
			count --;
		}
	}
}
