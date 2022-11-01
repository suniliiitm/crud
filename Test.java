class Test{
		public static void main(String[] args){
			dateTime();	
		
		}
		public void doProcess(){
		//logic goes here
		}

		static void dateTime(){
			System.out.println("today date and time: \n"+java.time.LocalDateTime.now());
		}
		static int manAwastha(int age){
			if(age<13){
				System.out.println("u r child");
			}else if(age<19 && age>12){
				System.out.println("u r teenager");
			}else if(age<40 && age>19){
				System.out.println("u r younger");
			}else if(age<58 && age>40){
				System.out.println("u r old man");
			}else if(age<100 && age>58){
				System.out.println("u r deadman");
			}else if(age>100){
				System.out.println("congratulations u r BABA");
			}
		}



}