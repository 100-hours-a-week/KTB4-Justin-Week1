public class NightLord extends Archer{
    @Override
    public String getJobName(){
        return "나이트로드";
    }
    @Override
    public void useSkill(){

        if(jobTier == 0) {
            huntPrint("럭키 세븐!");
        }

        else if(jobTier == 1) {
            huntPrint("럭키 세븐!");
        }

        else if(jobTier == 2) {
            huntPrint("자벨린 부스터!");
        }

        else if(jobTier == 3) {
            huntPrint("쉐도우 파트너!");
        }

        else if(jobTier == 4) {
            huntPrint("트리플 스로궁!");
        }
    }
}
