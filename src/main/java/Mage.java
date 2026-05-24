public class Mage extends Player{
    @Override
    public synchronized void weaponPurchase(int weaponChoice) {

        int price = 50;
        if (weaponChoice == 3 || weaponChoice == 4){
            if (mesos >= price){
                mesos -= price;
                if (weaponChoice == 3){
                    weapon = "완드";
                }
                else{
                    weapon = "스태프";
                }
                System.out.println(weapon + "을(를) 구매하였습니다!");
            }
            else{
                System.out.println("메소가 부족합니다.");
            }
        }
        else{
            System.out.println("마법사 무기만 구매 가능합니다.");
        }
    }

}
