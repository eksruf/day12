package day12;

public class TestClass04 {
	private int kor,eng,math,sum;
	private double avg;
	
	
	public void setKor(int kor) {
		//System.out.println("setkor����"); Ȯ�ι��� �ۼ�
		this.kor=kor;
		}
	
	public int getKor() { return kor; }
	
	public void setEng(int eng) { this.eng=eng; }
	public int getEng() { return eng; }
	
	public void setMath(int math) { this.math=math;  }
	public int getMath() { return math; }
		
	public int getSum() {
		return sum;
	}
	
	public void setSum() {//���ο��� set�� ��  sum���� �־��־�� �Ѵ�. �ݵ��..����..
		this.sum= kor+eng+math;
		
	}
	

	
	public double Avg() {
		avg=sum/3.0;
		return avg;
	}
//	public double getAvg() {
//		return avg;
//	}

	
}
