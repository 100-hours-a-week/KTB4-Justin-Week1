public class Pirate extends Player{
    @Override
    public void weaponPurchase(int weaponChoice){

        int price = 50;
        if (weaponChoice == 9 || weaponChoice == 10){
            if (mesos >= price){
                mesos -= price;
                if (weaponChoice == 9){
                    weapon = "너클";
                }
                else{
                    weapon = "총";
                }
                System.out.println(weapon + "을(를) 구매하였습니다!");
            }
            else{
                System.out.println("메소가 부족합니다.");
            }
        }
        else{
            System.out.println("해적 무기만 구매 가능합니다.");
        }
    }

}
