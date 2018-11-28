public class Enemy {

    String name;
    int enemyAD = 20;
    int enemyHP = 60;

    public Enemy(String name, int enemyAD, int enemyHP) {
        this.name = name;
        this.enemyAD = enemyAD;
        this.enemyHP = enemyHP;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnemyAD() {
        return enemyAD;
    }

    public void setEnemyAD(int enemyAD) {
        this.enemyAD = enemyAD;
    }

    public int getEnemyHP() {
        return enemyHP;
    }

    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }
}
