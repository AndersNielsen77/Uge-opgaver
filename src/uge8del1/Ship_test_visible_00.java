package uge8del1;

public class Ship_test_visible_00{
  	private static int maxNoOfShips = 100;
	private static Ship[] register;
	private static int nextFree;

	public static void main(String[] args) {
		register = new Ship[maxNoOfShips];
		nextFree = 0;
		useRegister();
	}

	private static void useRegister() {
		Ship santaMaria = new Ship("Santa Maria", 35);
		ContainerShip emma = new ContainerShip("Emma Maersk", 399, 13500);
		CruiseLiner titanic = new CruiseLiner("Titanic", 270, 2400);
		CruiseLiner quantum = new CruiseLiner("Quantum of the Seas", 348, 4300);
		Tanker helles = new Tanker("Hellespont Alhambra", 380, 3200000);
		Tanker tina = new Tanker("Tina Onassis", 236, 319000);

		addToRegister(santaMaria);
		addToRegister(emma);
		addToRegister(quantum);
		addToRegister(helles);
		addToRegister(titanic);
		addToRegister(tina);

		listAllShips();
	}

	private static void listAllShips() {
		for (int i = 0; i < register.length; i++) {
			if (register[i] != null) {
				System.out.println(register[i].toString());
			}
		}

	}

	private static void addToRegister(Ship ship) {
		if (nextFree < maxNoOfShips) {
			register[nextFree] = ship;
			nextFree++;
		} else {
			System.out.println("Sorry the register is full.");
		}

	}


 }

