public class Bowmaster extends Archer{
    @Override
    public String getJobName(){
        return "보우마스터";
    }
    @Override
    public void useSkill(){

        if(jobTier == 0) {
            System.out.println("달팽이 세마리!");
        }

        else if(jobTier == 1) {
            System.out.println("더블 샷!");
        }

        else if(jobTier == 2) {
            System.out.println("애로우 붐!");
        }

        else if(jobTier == 3) {
            System.out.println("스트레이프!");
        }

        else if(jobTier == 4) {
            System.out.println("허리케인!");
        }
    }
}
