class Engine {
    public static int activeCylinders = 0;
    public int rpm = 800;

    static {
        activeCylinders = 4;
    }

    public Engine() {
        this(1500);
        activeCylinders++;
    }

    public Engine(int rpm) {
        rpm = rpm; 
        activeCylinders += 2;
    }

    public void accelerate(int rpm) {
        this.rpm = rpm;
        int activeCylinders = 8; 
        System.out.print(activeCylinders + "#" + this.rpm + " ");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.print(Engine.activeCylinders + "->");
        Engine eng = new Engine();
        System.out.print(Engine.activeCylinders + "->");
        eng.accelerate(3000);
        System.out.print("FinalRPM:" + eng.rpm);
    }
}
// A:
// Write the complete final output of the program exactly as it appears on the console in a single line.
//  (Pay close attention to the ->, #, and whitespace formatting.)
// B:
// In the second constructor of the class, the statement rpm = rpm; is used. 
// Does this statement successfully assign the value 1500 to the object's field (rpm)?
//  If not, what is the value of the rpm field after the constructor has finished executing?
//  Explain the reason based on variable scope.
// In the accelerate method, a local variable named activeCylinders is declared and initialized.
//  What effect does this variable have on the class's static variable? Also, explain why the number 8 is printed.
// A:
// ->4
// ->5
// 8#3000 FinalRPM:3000
// B:
// NO
// we should use this.rpm = rpm; to assign the value to the object's field. The statement rpm = rpm; 
// 1500
// nothing 
// because the local variable activeCylinders in the accelerate method shadows the class's static variable activeCylinders.