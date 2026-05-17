public class Hero extends Warrior {
    @Override
    public String getJobName(){
        return "히어로";
    }
    @Override
    public void useSkill(){

        if(jobTier == 0) {
            System.out.println("달팽이 세마리!");
        }

        else if(jobTier == 1) {
            System.out.println("파워 스트라이크!");
        }

        else if(jobTier == 2) {
            System.out.println("분노!");
        }

        else if(jobTier == 3) {
            System.out.println("콤보 어택!");
        }

        else if(jobTier == 4) {
            System.out.println("브랜디쉬!");
        }
    }
}
