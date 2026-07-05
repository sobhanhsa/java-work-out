import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Robot[] robots = new Robot[n];

        for (int i = 0; i < n; i++) {
            char type = sc.next().charAt(0);
            String name = sc.next();
            int power = sc.nextInt();

            if (type == 'S') {
                robots[i] = new SoldierRobot(name, power);
            } else {
                robots[i] = new CommanderRobot(name, power);
            }
        }
        
        sc.close();
        
        for (Robot robot : robots) {
            System.out.println("Robot: " + robot.getName() + " | Damage: " + robot.calcDamage());

            if (robot instanceof CommanderRobot) {
                CommanderRobot commander = (CommanderRobot) robot;
                commander.issueCommand();
            }
        }

    }
}