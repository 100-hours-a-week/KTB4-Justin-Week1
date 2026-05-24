public class Warrior extends Player {
    @Override
    public synchronized void weaponPurchase(int weaponChoice) {

        int price = 50;
        if (weaponChoice == 1 || weaponChoice == 2){
            if (mesos >= price){
                mesos -= price;
                if (weaponChoice == 1){
                    weapon = "검";
                }
                else{
                    weapon = "창";
                }
                System.out.println(weapon + "을(를) 구매하였습니다!");
            }
            else{
                System.out.println("메소가 부족합니다.");
            }
        }
        else{
            System.out.println("전사 무기만 구매 가능합니다.");
        }
    }


}
