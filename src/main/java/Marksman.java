public class Marksman extends Archer{
    @Override
    public String getJobName(){
        return "신궁";
    }
    @Override
    public void useSkill(){

        if(jobTier == 0) {
            huntPrint("달팽이 세마리!");
        }

        else if(jobTier == 1) {
            huntPrint("더블 샷!");
        }

        else if(jobTier == 2) {
            huntPrint("아이언 애로우!");
        }

        else if(jobTier == 3) {
            huntPrint("파이어 샷!");
        }

        else if(jobTier == 4) {
            huntPrint("피어싱!");
        }
    }
}
