package advance.dev;

public class TamGiac extends Hinh {
	private double canhA;
	private double canhB;
	private double canhC;
	private double chieuCao;

	public TamGiac(double canhA, double canhB, double canhC , double chieuCao) {
		super();
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
		this.chieuCao = chieuCao ;
	}
	
	
	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return canhA * canhB * canhC;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return (canhA* 1/2* chieuCao) / 2;
	}

}
