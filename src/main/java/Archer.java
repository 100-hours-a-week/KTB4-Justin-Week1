public class Archer extends Player{
    @Override
    public void weaponPurchase(int weaponChoice){

        int price = 50;
        if (weaponChoice == 5 || weaponChoice == 6){
            if (mesos >= price){
                mesos -= price;
                if (weaponChoice == 5){
                    weapon = "활";
                }
                else{
                    weapon = "석궁";
                }
                System.out.println(weapon + "을(를) 구매하였습니다!");
            }
            else{
                System.out.println("메소가 부족합니다.");
            }
        }
        else{
            System.out.println("궁수 무기만 구매 가능합니다.");
        }
    }
}
