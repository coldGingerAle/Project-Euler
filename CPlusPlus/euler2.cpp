/*

Even Fibonacci Numbers
Problem 2

Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

*/

#include <iostream>
using namespace std;

int fibN(int n);

int main() {

	int sum = 0; //initialize accumulator

	for (int i = 1; fibN(i) <= 4000000; i++) {
		if (fibN(i) % 2 == 0) sum+= fibN(i); //increment sum by i-th Fibonacci number if it is even
	}

	cout << "The sum of the even-valued terms less than or equal to four million is: " << sum << " ." << endl; //print the answer

	return 0;
}

int fibN(int n) { //get the n-th Fibonacci number via recursion
	
	if (n == 1) {
		return 1;
	} else if (n == 2) {
		return 1;
	} else {
		return fibN(n - 1) + fibN(n - 2);
	}

}