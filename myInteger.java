package MyInteger;

public class myInteger {
private int value;

public myInteger(int value) {
	this.value=value;
}
public int getValue() {
	return value;
}
public static boolean isEven(int n) {
	return n%2==0;
}
public static boolean isOdd(int n) {
	return !isEven(n);
}
public boolean isEven() {
	return isEven(this.value);
}
public boolean isOdd() {
	return isOdd(this.value);
}
public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
public static boolean isEven(myInteger myInt) {
	return myInt != null && myInt.isEven();
}
public static boolean  isOdd(myInteger myInt) {
	return myInt !=null && myInt.isOdd();
}
public static boolean isPrime(myInteger  myInt) {
    return myInt != null && myInt.isPrime(myInt);
}

}
