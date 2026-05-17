import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Player player = null;

        while (player == null) {

            System.out.println("안녕하세요.");
            System.out.println("메이플스토리 월드에 오신 것을 환영합니다.");
            System.out.println("직업군을 골라주세요.");
            System.out.println("1.전사 2.마법사 3.궁수 4.도적 5.해적 6.종료");

            int jobClassChoice = sc.nextInt();

            switch (jobClassChoice) {

                case 1: {
                    System.out.println("직업을 골라주세요.");
                    System.out.println("1. 히어로 2. 다크나이트");
                    int jobChoice = sc.nextInt();
                    player = JobFactory.createWarrior(jobChoice);
                    break;
                }

                case 2: {
                    System.out.println("직업을 골라주세요.");
                    System.out.println("1. 불독 2. 비숍");
                    int jobChoice = sc.nextInt();
                    player = JobFactory.createMage(jobChoice);
                    break;
                }

                case 3: {
                    System.out.println("직업을 골라주세요.");
                    System.out.println("1. 보우마스터 2. 신궁");
                    int jobChoice = sc.nextInt();
                    player = JobFactory.createArcher(jobChoice);
                    break;
                }

                case 4: {
                    System.out.println("직업을 골라주세요.");
                    System.out.println("1. 나이트로드 2. 섀도어");
                    int jobChoice = sc.nextInt();
                    player = JobFactory.createThief(jobChoice);
                    break;
                }

                case 5: {
                    System.out.println("직업을 골라주세요.");
                    System.out.println("1. 바이퍼 2. 캡틴");
                    int jobChoice = sc.nextInt();
                    player = JobFactory.createPirate(jobChoice);
                    break;
                }

                case 6:
                    System.out.println("종료합니다.");
                    System.exit(0);

                default:
                    System.out.println("올바른 번호를 선택해주세요!");
            }
        }

        while (true) {

            System.out.println("무엇을 하시겠습니까?");
            System.out.println("1.사냥하기 2.무기 구매하기 3.전직하기 4.정보 확인하기 5.종료하기");

            int menuChoice = sc.nextInt();

            switch (menuChoice) {

                case 1:
                    player.hunt();
                    break;

                case 2: {
                    System.out.println("구매하실 무기를 선택해주세요.");
                    System.out.println("1.검 2.창 3.완드 4.스태프 5.활 6.석궁 7.표창 8.단검 9.너클 10.총");
                    int weaponChoice = sc.nextInt();
                    player.weaponPurchase(weaponChoice);
                    break;
                }

                case 3:
                    player.advance();
                    break;

                case 4:
                    player.showStatus();
                    break;

                case 5: {
                    System.out.println("종료합니다.");
                    System.exit(0);
                    break;
                }

                default:
                    System.out.println("올바른 번호를 선택해주세요!");
                    break;
            }
        }
    }
}