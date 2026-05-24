public class AutoHunt implements Runnable {
    private final Player player;
    private volatile boolean running = true;

    public AutoHunt(Player player) {
        this.player = player;
    }

    @Override
    public void run() {
        while (running) {
            player.hunt();

            if (!running) {
                break;
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    public void stop() {
        running = false;
    }
}
