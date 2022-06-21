public class Heroes {
    private int heroesHealth;
     private int heroesDamage;
     private String SuperHeroes;

    public Heroes(int heroesHealth, int heroesDamage) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
    }

    public Heroes(int heroesHealth, int heroesDamage, String superHeroes) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
        SuperHeroes = superHeroes;
    }

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public void setHeroesHealth(int heroesHealth) {
        this.heroesHealth = heroesHealth;

    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public void setHeroesDamage(int heroesDamage) {
        this.heroesDamage = heroesDamage;
    }

    public String getSuperHeroes() {
        return SuperHeroes;
    }

    public void setSuperHeroes(String superHeroes) {
        SuperHeroes = superHeroes;

    }
}
