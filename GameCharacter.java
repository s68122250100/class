public enum GameCharacter {
    // 2.1:
    private String name;
    private String role;
    private PowerLevel PowerLevel;

    // 2.2:
    // ประกาศ static variable เพื่อนับจำนวนตัวละครทั้งหมด
    private static int count;

    // 2.3:
    //เขียน constructor รับค่า name, role, powerLevel
    //และเพิ่มค่าจำนวนตัวละคร
    public GameCharacter (String name, String role, PowerLevel powerLevel){
        this.name = name;
        this.role = role;
        this.powerLevel = powerLevel;
        ++count;
    }
    //  2.4:
    // wmgu static method getTotalCharacters ()
    //คืนค่าจำนวนตัวละครทั้งหมด
    public static int getTotalCharacters() {
        return count;
    }

    // 2.5:
    // เขียน method displayInfo()
    // แสดงข้อมูลตัวละคร : Name : Role: Power Level
    public void displayInfo() {
        System.out.println("name = " + this.name);
        System.out.println("Role = " + this.role);
        System.out.println("Power Level = " + this.powerLevel);
    }
}