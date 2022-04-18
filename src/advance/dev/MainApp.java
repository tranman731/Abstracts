package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hinh h = new HinhChuNhat(10, 5, 6);
		System.out.println(h.chuVi());
		System.out.println(h.dienTich());
		Hinh h2 = new HinhTron(5);
		h2.chuVi();
		h2.dienTich();
		System.out.println(h2.chuVi());
		System.out.println(h2.dienTich());
		Hinh h3 = new TamGiac(10, 5, 6, 5);
		h3.chuVi();
		h3.dienTich();
		System.out.println(h3.chuVi()/2);
		System.out.println(h3.chuVi());
		System.out.println(h3.dienTich());
		
		
		
		
		
		
	}

}
