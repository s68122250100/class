public class GameDemo {
    public static void main(String[] args) {
    / 3.1:
    // สร้างตัวละครอย่างน้อย 3 ตัว
    GameCharacter c1 = new GameCharacter(name: "Aragon", role: "Warrior", PowerLevel.HIGH);
    c1.displayInfo();
    GameCharacter c2 = new GameCharacter(name: "Elena", role: "Mage", PowerLevel.MEDIUM);
    c2.displayInfo();
    GameCharacter c3 = new GameCharacter(name: "Luna", role: "Archer", PowerLevel.LEGENDARY);
    c3.displayInfo();
    System.out.println("Total characters in game:"+GameCharacter.getTotalCharacters());
    }
}