public class AutoHunt implements Runnable{
    private Player player;
    private volatile boolean running = true;

    public AutoHunt(Player player){
        this.player = player;
    }

    @Override
    public void run() {
        while(running){
            player.hunt();
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void stop(){
        System.out.println("사냥을 종료합니다.");
        running = false;
    }
}
