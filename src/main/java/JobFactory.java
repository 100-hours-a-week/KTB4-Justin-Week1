public class JobFactory {

    public static Player createWarrior(int choice) {
        switch (choice) {
            case 1: return new Hero();
            case 2: return new DarkKnight();
            default:
                System.out.println("잘못된 선택입니다.");
                return null;
        }
    }

    public static Player createMage(int choice) {
        switch (choice) {
            case 1: return new ArchMage();
            case 2: return new Bishop();
            default:
                System.out.println("잘못된 선택입니다.");
                return null;
        }
    }

    public static Player createArcher(int choice) {
        switch (choice) {
            case 1: return new Bowmaster();
            case 2: return new Marksman();
            default:
                System.out.println("잘못된 선택입니다.");
                return null;
        }
    }

    public static Player createThief(int choice) {
        switch (choice) {
            case 1: return new NightLord();
            case 2: return new Shadower();
            default:
                System.out.println("잘못된 선택입니다.");
                return null;
        }
    }

    public static Player createPirate(int choice) {
        switch (choice) {
            case 1: return new Buccaneer();
            case 2: return new Corsair();
            default:
                System.out.println("잘못된 선택입니다.");
                return null;
        }
    }
}