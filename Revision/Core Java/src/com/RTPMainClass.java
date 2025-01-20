package com;

class RTPMainClass extends RTP{
		@Override
		public void student(){
			System.out.println("Student is here");
		}
		
		public static void main(String[] args) {
			RTPMainClass r=new RTPMainClass();
			r.student();
		}

}
