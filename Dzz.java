package ��;

public class Dzz {

	public static void main(String[] args) {
	int q = 31;
	System.out.println("������ �����: ");
    
	if (q % 2 == 0)
		System.out.println("����� �����");
	else
		System.out.println("����� �� �����");
	System.out.println();
	
	double a,b,c,d;
	a=2;
	b=1;
	c = -5;
	
	d = b* b - 4 * a * c;
	System.out.println("D=" + d);
	if (d > 0){
		double x1;
		double x2;
		x1 = (-b - Math.sqrt(d)) / (2 * a);
		x2 = (-b - Math.sqrt(d)) / (2 * a);
		System.out.println("����� �������: x1 = " + x1 + ", x2 = " + x2);
	} else if (d == 0) {
		double x;
		x = -b / (2 * a);
		System.out.println("���� �����: x = " + x);
	}else {
		System.out.println("³����� �����");
	}
	}

}
