#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int T;
    cin >> T; // test case

    for (int t = 1; t <= T; t++) {
        int N;
        cin >> N; // number of people throwing stones

        vector<int> location(N);
        for (int i = 0; i < N; i++) {
            cin >> location[i];
        }

        int min = abs(0 - location[0]);
        for (int i = 0; i < N; i++) {
            int dist = abs(0 - location[i]);
            if (dist < min) {
                min = dist;
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (abs(0 - location[i]) == min) {
                count++;
            }
        }

        cout << "#" << t << " " << min << " " << count << endl;
    }

    return 0;
}