package Algorithm;

public class TimeComplexity1 {
	//백준[10158] 개미문제
	public static void main(String[] args) {
		// W x H 격자 공간 (W, H) 
		int W = 6; 
		int H = 4;
		// 개미의 현재 위치
		int P = 4;
		int Q = 1;
		// 개미가 이동할 시간
		int T = 8;
		// 현재 개미의 위치
		int currentX = P;
		int currentY = Q;
		
		// X축 시간복잡도 : 0(2W)
		int deltaX = 1;
		int timeX = T % (2 * W);
		while(timeX-- > 0) {
			if(currentX == W) deltaX = -1;
			else if(currentX == 0) deltaX = 1; 
			currentX = currentX + deltaX;
		}
		
		// Y축 시간복잡도 : 0(2H)
		int deltaY = 1;
		int timeY = T % (2 * H);
		while(timeY-- > 0) {
			if(currentY == H) deltaY = -1;
			else if(currentY == 0) deltaY = 1; 
			currentY = currentX + deltaY;
		}
		
		System.out.println("현재 개미의 위치");
		System.out.println(currentX);
		System.out.println(currentY);
	}

}
