public class Player {
    int level = 1;
    int exp = 0;
    int mesos = 0;
    int maxExp = 100;
    int maxMesos = 99999;
    int maxLevel = 50;
    int jobTier = 0; //전직 상태 1,2,3,4
    String weapon = "맨손";
    double expRate = 1.0;
    double mesosRate = 1.0;

    public String getJobName() {
        return "초보자";
    }
    public void levelUp(){

        if (level < maxLevel){

            level++;
            maxExp += 50;

            System.out.println("레벨 업!");
            System.out.println("현재 레벨은 " + level + "입니다.");
        }

        else{
            System.out.println("최고 레벨에 도달하였습니다!");
        }
    }
    public void useSkill(){
        System.out.println("기본 공격!");
    }
    public Monster getMonster() {

        if (level < 10) {
            return new Monster("주황버섯", 200, 200);
        }

        else if (level < 20) {
            return new Monster("와일드보어", 500, 500);
        }

        else if (level < 30) {
            return new Monster("화이트팽", 800, 800);
        }

        else if (level < 40) {
            return new Monster("레드 드레이크", 1100, 1100);
        }

        else {
            return new Monster("검은 마법사", 1400, 1400);
        }
    }
    public void hunt() {

        Monster monster = getMonster();

        useSkill();

        int finalExp = (int)(monster.exp * expRate);
        int finalMesos = (int)(monster.mesos * mesosRate);

        System.out.println(monster.name + "을(를) 처치하였습니다.");
        System.out.println("획득 경험치: " + finalExp);
        System.out.println("획득 메소: " + finalMesos);

        exp += finalExp;
        mesos += finalMesos;

        while (exp >= maxExp && level < maxLevel) {

            exp -= maxExp;
            levelUp();
        }
    }
    public void advance() {

        if (jobTier >= 4) {
            System.out.println("최종 전직 상태입니다.");
            return;
        }

        int[] jobLevels = {10, 20, 30, 40};

        if (level >= jobLevels[jobTier]) {

            jobTier++;

            expRate = jobTier + 1;
            mesosRate = jobTier + 1;

            System.out.println(jobTier + "차 전직 완료!");
        }

        else {
            System.out.println("전직 가능한 레벨이 아닙니다.");
        }
    }
    public void weaponPurchase(int weaponChoice){

    }
    public void showStatus(){
        System.out.println("직업은 " + getJobName() + "입니다.");
        System.out.println("현재 레벨은 " + level + "입니다.");
        System.out.println("현재 경험치는 " + exp + "/" + maxExp + "입니다.");
        System.out.println("현재 보유 메소는 " + mesos + "입니다.");
        System.out.println("현재 착용 무기는 " + weapon + "입니다.");
    }
}
