public class Shadower extends Archer{
    @Override
    public String getJobName(){
        return "섀도어";
    }
    @Override
    public void useSkill(){

        if(jobTier == 0) {
            System.out.println("달팽이 세마리!");
        }

        else if(jobTier == 1) {
            System.out.println("더블 스탭!");
        }

        else if(jobTier == 2) {
            System.out.println("새비지 블로우!");
        }

        else if(jobTier == 3) {
            System.out.println("메소 익스플로전!");
        }

        else if(jobTier == 4) {
            System.out.println("부메랑 스텝!");
        }
    }
}
