public class Bishop extends Archer{
    @Override
    public String getJobName(){
        return "비숍";
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
            System.out.println("힐!");
        }

        else if(jobTier == 3) {
            System.out.println("홀리 심볼!");
        }

        else if(jobTier == 4) {
            System.out.println("제네시스!");
        }
    }
}
