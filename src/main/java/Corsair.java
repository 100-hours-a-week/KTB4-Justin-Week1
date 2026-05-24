public class Corsair extends Archer{
    @Override
    public String getJobName(){
        return "캡틴";
    }
    @Override
    public void useSkill(){

        if(jobTier == 0) {
            huntPrint("달팽이 세마리!");
        }

        else if(jobTier == 1) {
            huntPrint("더블 파이어");
        }

        else if(jobTier == 2) {
            huntPrint("윙즈!");
        }

        else if(jobTier == 3) {
            huntPrint("옥토퍼스!");
        }

        else if(jobTier == 4) {
            huntPrint("래피드 파이어!");
        }
    }
}
