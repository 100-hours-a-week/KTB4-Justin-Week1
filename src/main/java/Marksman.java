public class Marksman extends Archer{
    @Override
    public String getJobName(){
        return "신궁";
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
            System.out.println("아이언 애로우!");
        }

        else if(jobTier == 3) {
            System.out.println("파이어 샷!");
        }

        else if(jobTier == 4) {
            System.out.println("피어싱!");
        }
    }
}
