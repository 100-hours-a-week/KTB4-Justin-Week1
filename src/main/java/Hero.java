public class Hero extends Warrior {
    @Override
    public String getJobName(){
        return "히어로";
    }
    @Override
    public void useSkill(){

        if(jobTier == 0) {
            huntPrint("달팽이 세마리!");
        }

        else if(jobTier == 1) {
            huntPrint("파워 스트라이크!");
        }

        else if(jobTier == 2) {
            huntPrint("분노!");
        }

        else if(jobTier == 3) {
            huntPrint("콤보 어택!");
        }

        else if(jobTier == 4) {
            huntPrint("브랜디쉬!");
        }
    }
}
