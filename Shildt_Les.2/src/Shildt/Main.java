package Shildt;

public class Main {

    public static void main(String[] args) {
	System.out.println("Эта прогррамма выводит таблицу эквивалетности галлонов и листров от 1 до 100");
	System.out.println();

	double gallons, litters;

	for(gallons=1; gallons<=100; gallons++) {
	    litters = gallons * 3.7854;
	    if (gallons%10 == 0) {
	        System.out.println();
        }
	    System.out.println(gallons + " галлонов соответсует "+ litters + " литрам");
    }

    }
}
