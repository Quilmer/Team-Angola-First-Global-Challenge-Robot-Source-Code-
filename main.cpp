#include <iostream>
using namespace std;

int main() {
    cout << "Team Angola FGC 2025 - Simulation Mode" << endl;
    cout << "Running HojeLB3 logic simulation..." << endl;

    // Simulated motors
    float MD0 = 0, ME1 = 0, Brac = 0, Sug = 0, Sug2 = 0;
    bool active = true;

    while (active) {
        cout << "\nEnter joystick Y value (forward = positive, backward = negative, 999 to exit): ";
        float y; cin >> y;
        if (y == 999) {
            active = false;
            break;
        }

        MD0 = y - 0;
        ME1 = y + 0;

        cout << "Motors running -> MD0: " << MD0 << " | ME1: " << ME1 << endl;
    }

    cout << "Simulation ended successfully!" << endl;
    return 0;
}

