package model;

public class Country {

    Integer id;
    String name;
    Long population;

    public Country(int id, String name, long population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    @Override
    public int hashCode() {     // Horner-method!
        int hash = 17;  // two small prime number 17 - 31

        hash = 31 * hash + id.hashCode();
        hash = 31 * hash + name.hashCode();
        hash = 31 * hash + population.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {  // check references
            return true;
        }
        if (getClass() != obj.getClass()){
            return false;
        }

        Country otherCountry = (Country) obj;
        return this.hashCode() == otherCountry.hashCode();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
