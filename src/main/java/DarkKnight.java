public class DarkKnight extends Warrior {
    @Override
    public String getJobName(){
        return "다크나이트";
    }
    @Override
    public void useSkill(){

        if(jobTier == 0) {
            huntPrint("달팽이 세마리!");
        }

        else if(jobTier == 1) {
            huntPrint("슬래시 블러스트!");
        }

        else if(jobTier == 2) {
            huntPrint("아이언 월!");
        }

        else if(jobTier == 3) {
            huntPrint("새크리파이스!");
        }

        else if(jobTier == 4) {
            huntPrint("버서크!");
        }
    }
}
