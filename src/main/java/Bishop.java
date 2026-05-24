public class Bishop extends Archer{
    @Override
    public String getJobName(){
        return "비숍";
    }
    @Override
    public void useSkill(){

        if(jobTier == 0) {
            huntPrint("에너지 볼트!");
        }

        else if(jobTier == 1) {
            huntPrint("매직 클로!");
        }

        else if(jobTier == 2) {
            huntPrint("힐!");
        }

        else if(jobTier == 3) {
            huntPrint("홀리 심볼!");
        }

        else if(jobTier == 4) {
            huntPrint("제네시스!");
        }
    }
}
