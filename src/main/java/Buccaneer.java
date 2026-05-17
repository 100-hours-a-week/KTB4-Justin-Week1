public class Buccaneer extends Archer{
    @Override
    public String getJobName(){
        return "바이퍼";
    }
    @Override
    public void useSkill(){

        if(jobTier == 0) {
            System.out.println("달팽이 세마리!");
        }

        else if(jobTier == 1) {
            System.out.println("스트레이트!");
        }

        else if(jobTier == 2) {
            System.out.println("백 스핀 블로우!");
        }

        else if(jobTier == 3) {
            System.out.println("에너지 버스터!");
        }

        else if(jobTier == 4) {
            System.out.println("데몰리터!");
        }
    }
}
