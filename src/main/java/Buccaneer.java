public class Buccaneer extends Archer{
    @Override
    public String getJobName(){
        return "바이퍼";
    }
    @Override
    public void useSkill(){

        if(jobTier == 0) {
            huntPrint("달팽이 세마리!");
        }

        else if(jobTier == 1) {
            huntPrint("스트레이트!");
        }

        else if(jobTier == 2) {
            huntPrint("백 스핀 블로우!");
        }

        else if(jobTier == 3) {
            huntPrint("에너지 버스터!");
        }

        else if(jobTier == 4) {
            huntPrint("데몰리터!");
        }
    }
}
