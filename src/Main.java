public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(1000);
        boss.setBossDamage(350);
        boss.setBossDefenceType("magical");
        System.out.println("Здоровье босса " + boss.getBossHealth() + "\nУрон босса " + boss.getBossDamage() + "\nТип защиты босса " + boss.getBossDefenceType());

    }
}