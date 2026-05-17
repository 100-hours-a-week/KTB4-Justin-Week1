public class ArchMage extends Archer{
    @Override
    public String getJobName(){
        return "아크메이지(불/독)";
    }
    @Override
    public void useSkill(){

        if(jobTier == 0) {
            System.out.println("에너지 볼트!");
        }

        else if(jobTier == 1) {
            System.out.println("매직 클로!");
        }

        else if(jobTier == 2) {
            System.out.println("파이어 애로우!");
        }

        else if(jobTier == 3) {
            System.out.println("포이즌 미스트!");
        }

        else if(jobTier == 4) {
            System.out.println("메테오!");
        }
    }
}
