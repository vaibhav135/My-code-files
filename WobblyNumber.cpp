#include <bits/stdc++.h>
using namespace std;

int main() {
  int tcs, length, divideA, a, b, term, breakCon;
  cin >> tcs;

  while (tcs != 0) {
    a = 1, b = 0, breakCon = 0;
    cin >> length >> term;

    int divide, result;
    result = term % 10;
    divide = term / 10;
    b = result + divide;
    if (b > 9)
      b -= 9;
    //  cout << result << " " << divide << endl;
    // Algorithm for a
    if (term > 9) {
      divideA = term / 9;
      if (term % 9 == 0)
        a = divideA;
      else
        a = divideA + a;
    }

    //  cout << "result: " << result << endl;

    // Algorithm for b

    if (a == b || b < a)
      b -= 1;
    if (a == 9 && b == 9 || a > 9)
      breakCon = -1;

    for (int i = 0; i < length; i++) {
      if (breakCon == -1) {
        cout << -1;
        break;
      }
      if (i % 2 == 0)
        cout << a;
      else
        cout << b;
    }
    cout << endl;
    tcs--;
  }

  return 0;
}
