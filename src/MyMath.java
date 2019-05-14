
public class MyMath {
	public MyMath() {}
	
	public long fibonacciNumber(long target) {
		if(target <= 2) {
			return 1;
		}
		else {
			return fibonacciNumber(target - 1) + fibonacciNumber(target - 2);
		}
	}
	
	public long areaFibonacciIterative(long target) {
		long answer = 0;
		while(target > 0) {
			answer += Math.pow(this.fibonacciNumber(target), 2);
			target--;
		}
		return answer;
	}
	
	public long perimeterFibonacci(long target) {
		if(target == 1) {
			return 4;
		}
		long smallSide = this.fibonacciNumber(target);
		long bigSide = (smallSide + this.fibonacciNumber(target - 1)) * 2;
		return (smallSide * 2) + bigSide;
	}
}
