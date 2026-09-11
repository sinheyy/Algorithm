#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
#include <cmath>

using namespace std;

int solution(int n) {
    int answer = 0;
    vector<int> digits;
    
    while (true) {
        if (n == 0){
            break;
        }
        
        digits.push_back(n % 3);
        
        n = n / 3;
    }
    
    int j = 0;
    for (int i = digits.size() - 1;i >= 0 ;i--) {
        answer += digits[j] * pow(3, i);
        j++;
    }
    
    return answer;
}