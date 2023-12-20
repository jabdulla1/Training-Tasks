package com.snva.module;

public class TrafficLight implements ChangeStateColor{

	int greentime;
	int yellowtime;
	int redtime;
	String color;
	
	
	
	
	 public TrafficLight() {
		super();
		
		this.greentime = 30;
		this.yellowtime = 21;
		this.redtime = 50;
		this.color = "green";
		
	}

	public TrafficLight(int greentime, int yellowtime, int redtime, String color) {
		super();
		this.greentime = greentime;
		this.yellowtime = yellowtime;
		this.redtime = redtime;
		this.color = color;
	}

	public String getColor(){
	  return this.color;
	 }

	 public  void setColor(String color){
	  this.color = color;
	 }

	 public  String stateOfColor(String color){
		this.color = color;
	return this.color;
	}
	
	
	  public String changeColor(){
		if(this.color.equals("green"))
		{
		  if(greentime == 1){
			  this.greentime= 30;
			  return stateOfColor("yellow");
		  }
		  else{
			  greentime--;
			  return stateOfColor("green");
		  }
		}else if(this.color.equals("yellow")){
			
			if(yellowtime == 1){
				this.yellowtime= 21;
				  return stateOfColor("red");
			  }
			  else{
				  yellowtime--;
				  return stateOfColor("yellow");
			  }
		}else if(this.color.equals("red")){
			
			if(redtime == 1){
					this.redtime= 50;
				  return stateOfColor("green");
			  }
			  else{
				  redtime--;
				  return stateOfColor("red");
			  }
		
		} 
		return "no time";
	 }
}
