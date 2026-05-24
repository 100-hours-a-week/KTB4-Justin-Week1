public class ArchMage extends Archer{
    @Override
    public String getJobName(){
        return "아크메이지(불/독)";
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
            huntPrint("파이어 애로우!");
        }

        else if(jobTier == 3) {
            huntPrint("포이즌 미스트!");
        }

        else if(jobTier == 4) {
            huntPrint("메테오!");
        }
    }
}
