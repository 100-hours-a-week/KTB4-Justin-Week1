public class Corsair extends Archer{
    @Override
    public String getJobName(){
        return "캡틴";
    }
    @Override
    public void useSkill(){

        if(jobTier == 0) {
            System.out.println("달팽이 세마리!");
        }

        else if(jobTier == 1) {
            System.out.println("더블 파이어");
        }

        else if(jobTier == 2) {
            System.out.println("윙즈!");
        }

        else if(jobTier == 3) {
            System.out.println("옥토퍼스!");
        }

        else if(jobTier == 4) {
            System.out.println("래피드 파이어!");
        }
    }
}
