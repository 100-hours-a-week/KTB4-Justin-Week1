public class Thief extends Player{
    @Override
    public void weaponPurchase(int weaponChoice){

        int price = 50;
        if (weaponChoice == 7 || weaponChoice == 8){
            if (mesos >= price){
                mesos -= price;
                if (weaponChoice == 7){
                    weapon = "표창";
                }
                else{
                    weapon = "단검";
                }
                System.out.println(weapon + "을(를) 구매하였습니다!");
            }
            else{
                System.out.println("메소가 부족합니다.");
            }
        }
        else{
            System.out.println("도적 무기만 구매 가능합니다.");
        }
    }

}
