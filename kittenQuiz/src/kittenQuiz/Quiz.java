package kittenQuiz;

import java.util.InputMismatchException;
import java.util.Scanner;

import kittenQuiz.Cor.Cores;

public class Quiz extends Principal{

	private int chonky = 0;
	private int playfull = 0;
	private int sleepy = 0;
	int big = 0;
	int mago = 0;
	String cor;

	public int getChonky() {
		return chonky;
	}

	public void setChonky(int chonky) {
		this.chonky = chonky;
	}

	public int getPlayfull() {
		return playfull;
	}

	public void setPlayfull(int playfull) {
		this.playfull = playfull;
	}

	public int getSleepy() {
		return sleepy;
	}

	public void setSleepy(int sleepy) {
		this.sleepy = sleepy;
	}
	

	public void QuizKitty() {
		
		int option;
		boolean loop = true;
		Scanner scanner = new Scanner(System.in);
		
		while(loop) {
			try {
			System.out.println("\n\nHow many fish do you give for your cat?\n"
					+ "1- 1 fish\n2- 3 fish\n3- 5 fish\n4- 🐟");
			option = scanner.nextInt();
			
			if(option ==1) {
				this.sleepy +=1;
				break;
			}
			else if(option ==2) {
				this.playfull +=1;
				break;
			}
			else if(option ==3) {
				this.chonky +=1;
				break;
			}
			else if(option ==4) {
				this.GatoEspecial("🐟");
				mago +=1;
				break;
			}
			else {
				System.out.println("Type 1,2,3 or 4 only:");
			}
			}catch (InputMismatchException a) {
	            System.out.println("Type 1,2,3 or 4 only:");
	            scanner.next();
			}
		}
		while(loop) {
			try {
			System.out.println("\n\nWhat do you use to play with your cat?\n"
					+ "1- fish rod\n2- fish plushie\n3- laser\n4- light globe");
			option = scanner.nextInt();
			
			if(option ==1) {
				this.sleepy +=1;
				break;
			}
			else if(option ==3) {
				this.playfull +=1;
				break;
			}
			else if(option ==2) {
				this.chonky +=1;
				break;
			}
			else if(option ==4) {
				this.GatoEspecial("🐟");
				mago +=1;
				break;
			}
			else {
				System.out.println("Type 1,2,3 or 4 only:");
			}
			}catch (InputMismatchException a) {
	            System.out.println("Type 1,2,3 or 4 only:");
	            scanner.next();
			}
		}
		while(loop) {
			try {
			System.out.println("\n\nWhere does your cat sleep?\n"
					+ "1- clouds\n2- confy pillow\n3- two-story cathouse\n4- in your bed");
			option = scanner.nextInt();
			
			if(option ==4) {
				this.sleepy +=1;
				break;
			}
			else if(option ==3) {
				this.playfull +=1;
				break;
			}
			else if(option ==2) {
				this.chonky +=1;
				break;
			}
			else if(option ==1) {
				this.GatoEspecial("🐟");
				mago +=1;
				break;
			}
			else {
				System.out.println("Type 1,2,3 or 4 only:");
			}
			}catch (InputMismatchException a) {
	            System.out.println("Type 1,2,3 or 4 only:");
	            scanner.next();
			}
		}
		while(loop) {
			try {
			System.out.println("\n\nWhere does your cat like to cat walking?\n"
					+ "1- park\n2- go shopping\n3- to the stars\n4- at house");
			option = scanner.nextInt();
			
			if(option ==4) {
				this.sleepy +=1;
				break;
			}
			else if(option ==1) {
				this.playfull +=1;
				break;
			}
			else if(option ==2) {
				this.chonky +=1;
				break;
			}
			else if(option ==3) {
				this.GatoEspecial("🐟");
				mago +=1;
				break;
			}
			else {
				System.out.println("Type 1,2,3 or 4 only:");
			}
			}catch (InputMismatchException a) {
	            System.out.println("Type 1,2,3 or 4 only:");
	            scanner.next();
			}
		}
		while(loop) {
			try {
			System.out.println("\n\nWhat does your cat like to do?\n"
					+ "1- sleep\n2- look into the void\n3- bite\n4- eat");
			option = scanner.nextInt();
			
			if(option ==1) {
				this.sleepy +=1;
				break;
			}
			else if(option ==3) {
				this.playfull +=1;
				break;
			}
			else if(option ==4) {
				this.chonky +=1;
				break;
			}
			else if(option ==2) {
				this.GatoEspecial("🐟");
				mago +=1;
				break;
			}
			else {
				System.out.println("Type 1,2,3 or 4 only:");
			}
			}catch (InputMismatchException a) {
	            System.out.println("Type 1,2,3 or 4 only:");
	            scanner.next();
			}
		}
		//color
		while(loop) {
			try {
			System.out.println("\n\nWhich color is your cat?\n"
					+ "1- red\n2- yellow\n3- cinza\n4- azul");
			option = scanner.nextInt();
			
			if(option ==1) {
				cor = Cores.red;
				break;
			}
			else if(option ==2) {
				cor = Cores.yellow;
				break;
			}
			else if(option ==3) {
				cor = Cores.blackbright;
				break;
			}
			else if(option ==4) {
				cor = Cores.cyan;
				break;
			}
			else {
				System.out.println("Type 1,2,3 or 4 only:");
			}
			}catch (InputMismatchException a) {
	            System.out.println("Type 1,2,3 or 4 only:");
	            scanner.next();
			}
		}
		
		System.out.println(cor+"★★★★★★★★★★★★★this is your cat★★★★★★★★★★★★★★★★★★");
		
		if(sleepy > big) {
			big = sleepy;
		}
		if(chonky > big) {
			big = chonky;
		}
		if(playfull > big) {
			big = playfull;
		}
		if(mago > big) {
			big = mago;
		}
		PegaGato pegaGato = new PegaGato();
		if(big == sleepy) {
			pegaGato.SleepyKitty();
			return;
		}
		if(big == chonky) {
		    pegaGato.ChonkyKitty();
		    return;
		}
		if(big == playfull) {
		    pegaGato.PlayfullKitty();
		    return;
		}
		
		if(big == mago) {
			System.out.println("\nCongratulations, here are your magic fishes, let's wait the magic!!!!!");
			mage.stream().forEach(elemento -> System.out.print(elemento + " "));
			System.out.println("\n");
			while (!mage.isEmpty()) {
	            String segundo = mage.pop();
	            System.out.println(segundo);

	            try {
	                Thread.sleep(1500);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
			}
			System.out.println("Mage kitty has "+mago+"000000 of power!!!");
			pegaGato.MagicianKitty();
			return;
		}
		scanner.close();
	}
	
	
}
