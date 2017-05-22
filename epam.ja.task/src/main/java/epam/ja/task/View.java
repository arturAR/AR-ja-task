package epam.ja.task;

import java.util.InputMismatchException;

public class View {
	
	private int arenaSize;
	private int whoStart;
	private Controller controller;

	private int xTemp;
	private  int yTemp;
	
	public View(Controller controller) {
		this.controller = controller;
	}
	
	
	public void showGameMenu() {
		System.out.println();
		System.out.println("Prosz� poda� X: ");
		xTemp = readIntByScanner();
		System.out.println("Prosz� poda� Y: ");
		yTemp = readIntByScanner();
	}
	
	public void showWhoStart() {
		System.out.println();
		System.out.println("Kto rozpoczyna gr�? Wybierz 1 dla 'X' lub 2 dla 'O'");
		whoStart = readIntByScanner();
		if(whoStart == 1) {
			System.out.println("Rozpoczyna gracz: 'X'");
		}
		if(whoStart == 2) {
			System.out.println("Rozpoczyna gracz: 'O'");
		}
	}
	
	public void showStartMenu() {
		System.out.println();
		System.out.println("START!");
		System.out.println("Podaj rozmiar planszy(liczba naturalna) i zatwierdz ENTER: ");
		arenaSize = readIntByScanner();
		System.out.println("Rozmiar planszy: " + arenaSize);
	}
	
	
	public int readIntByScanner() {
		int number = 0;
		try{
			number = controller.getReturnInt();
		} catch(InputMismatchException e) {
			System.out.println("Podano niepawid�owe dane, prosz� spr�bowa� ponownie.");
			return number;
		}
		return number;
	}


	public int getArenaSize() {
		return arenaSize;
	}


	public void setArenaSize(int arenaSize) {
		this.arenaSize = arenaSize;
	}


	public int getWhoStart() {
		return whoStart;
	}


	public void setWhoStart(int whoStart) {
		this.whoStart = whoStart;
	}


	public Controller getController() {
		return controller;
	}


	public void setController(Controller controller) {
		this.controller = controller;
	}


	public int getxTemp() {
		return xTemp;
	}


	public void setxTemp(int xTemp) {
		this.xTemp = xTemp;
	}


	public int getyTemp() {
		return yTemp;
	}


	public void setyTemp(int yTemp) {
		this.yTemp = yTemp;
	}


	public void showWhoPlay(int moveId) {
		System.out.println();
		if(moveId % 2 == 0) {
			System.out.println("Gra k�ko");
		} else {
			System.out.println("Gra krzy�yk");
		}
	}


	public void showResult(int moveId) {
		System.out.println();
		if(moveId % 2 == 0) {
			System.out.println("Gratulacje, wygra� gracz O");
		} else {
			System.out.println("Gratulacje, wygra� gracz X");
		}
	}
}
