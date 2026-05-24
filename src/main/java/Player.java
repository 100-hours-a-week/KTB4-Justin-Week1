public class Player {
    int level = 1;
    int exp = 0;
    int mesos = 0;
    int maxExp = 100;
    int maxMesos = 99999;
    int maxLevel = 50;
    int jobTier = 0;
    String weapon = "맨손";
    double expRate = 1.0;
    double mesosRate = 1.0;

    private AutoHunt autoHunt;
    private Thread autoHuntThread;

    private final StringBuilder huntLog = new StringBuilder();
    private boolean loggingHunt = false;

    protected void huntPrint(String message) {
        if (loggingHunt) {
            huntLog.append(message).append(System.lineSeparator());
        } else {
            System.out.println(message);
        }
    }

    private void flushHuntLog() {
        if (!huntLog.isEmpty()) {
            System.out.print(huntLog);
            huntLog.setLength(0);
        }
    }

    public String getJobName() {
        return "초보자";
    }

    public void levelUp() {
        if (level < maxLevel) {
            level++;
            maxExp += 50;
            huntPrint("레벨 업!");
            huntPrint("현재 레벨은 " + level + "입니다.");
        } else {
            huntPrint("최고 레벨에 도달하였습니다!");
        }
    }

    public void useSkill() {
        huntPrint("기본 공격!");
    }

    public Monster getMonster() {
        if (level < 10) {
            return new Monster("주황버섯", 200, 200);
        } else if (level < 20) {
            return new Monster("와일드보어", 500, 500);
        } else if (level < 30) {
            return new Monster("화이트팽", 800, 800);
        } else if (level < 40) {
            return new Monster("레드 드레이크", 1100, 1100);
        } else {
            return new Monster("검은 마법사", 1400, 1400);
        }
    }

    public synchronized void hunt() {
        if (autoHuntThread != null && autoHuntThread.isAlive()
                && Thread.currentThread() != autoHuntThread) {
            System.out.println("자동 사냥 중에는 직접 사냥할 수 없습니다.");
            return;
        }

        boolean autoHuntTurn = Thread.currentThread() == autoHuntThread;

        loggingHunt = true;
        if (!autoHuntTurn) {
            huntLog.setLength(0);
        }

        try {
            Monster monster = getMonster();

            useSkill();

            int finalExp = (int) (monster.exp * expRate);
            int finalMesos = (int) (monster.mesos * mesosRate);

            huntPrint(monster.name + "을(를) 처치하였습니다.");
            huntPrint("획득 경험치: " + finalExp);
            huntPrint("획득 메소: " + finalMesos);

            exp += finalExp;
            mesos += finalMesos;

            while (exp >= maxExp && level < maxLevel) {
                exp -= maxExp;
                levelUp();
            }
        } finally {
            loggingHunt = false;
            if (!autoHuntTurn) {
                flushHuntLog();
            }
        }
    }

    public synchronized void startAutoHunt() {
        if (autoHuntThread != null && autoHuntThread.isAlive()) {
            System.out.println("이미 사냥이 진행중입니다!");
            return;
        }

        huntLog.setLength(0);
        autoHunt = new AutoHunt(this);
        autoHuntThread = new Thread(autoHunt, "AutoHunt");
        autoHuntThread.start();
    }

    public void stopAutoHunt() {
        Thread threadToJoin;
        synchronized (this) {
            if (autoHunt == null && (autoHuntThread == null || !autoHuntThread.isAlive())) {
                System.out.println("진행 중인 자동 사냥이 없습니다.");
                return;
            }
            if (autoHunt != null) {
                autoHunt.stop();
            }
            threadToJoin = autoHuntThread;
        }

        if (threadToJoin != null) {
            try {
                threadToJoin.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        synchronized (this) {
            flushHuntLog();
            autoHuntThread = null;
            autoHunt = null;
            System.out.println("자동 사냥을 종료합니다.");
        }
    }

    public synchronized void advance() {
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
        } else {
            System.out.println("전직 가능한 레벨이 아닙니다.");
        }
    }

    public synchronized void weaponPurchase(int weaponChoice) {
    }

    public synchronized void showStatus() {
        System.out.println("직업은 " + getJobName() + "입니다.");
        System.out.println("현재 레벨은 " + level + "입니다.");
        System.out.println("현재 경험치는 " + exp + "/" + maxExp + "입니다.");
        System.out.println("현재 보유 메소는 " + mesos + "입니다.");
        System.out.println("현재 착용 무기는 " + weapon + "입니다.");
    }
}
