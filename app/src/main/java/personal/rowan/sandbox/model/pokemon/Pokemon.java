
package personal.rowan.sandbox.model.pokemon;

import java.util.List;

import personal.rowan.sandbox.util.PokemonUtil;

public class Pokemon {

    private List<Form> forms = null;
    private List<Ability> abilities = null;
    private List<Stat> stats = null;
    private String name;
    private Double weight;
    private Sprites sprites;
    private Double height;
    private Species species;
    private Integer id;
    private Integer order;
    private Integer base_experience;
    private List<Type> types = null;

    /**
     * 
     * @return
     *     The forms
     */
    public List<Form> getForms() {
        return forms;
    }

    /**
     * 
     * @param forms
     *     The forms
     */
    public void setForms(List<Form> forms) {
        this.forms = forms;
    }

    /**
     * 
     * @return
     *     The abilities
     */
    public List<Ability> getAbilities() {
        return abilities;
    }

    /**
     * 
     * @param abilities
     *     The abilities
     */
    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    /**
     * 
     * @return
     *     The stats
     */
    public List<Stat> getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The sprites
     */
    public Sprites getSprites() {
        return sprites;
    }

    /**
     * 
     * @param sprites
     *     The sprites
     */
    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The species
     */
    public Species getSpecies() {
        return species;
    }

    /**
     * 
     * @param species
     *     The species
     */
    public void setSpecies(Species species) {
        this.species = species;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The order
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * 
     * @param order
     *     The order
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * 
     * @return
     *     The base_experience
     */
    public Integer getBaseExperience() {
        return base_experience;
    }

    /**
     * 
     * @param baseExperience
     *     The base_experience
     */
    public void setBaseExperience(Integer baseExperience) {
        this.base_experience = baseExperience;
    }

    /**
     * 
     * @return
     *     The types
     */
    public List<Type> getTypes() {
        return types;
    }

    /**
     * 
     * @param types
     *     The types
     */
    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public String getFormattedType() {
        if(types == null || types.isEmpty()) {
            return "";
        }
        String type1 = types.get(0).getType().getName();
        if(types.size() <= 1) {
            return PokemonUtil.capitalizeWord(type1);
        } else {
            return PokemonUtil.capitalizeWord(types.get(1).getType().getName()) + "/" + PokemonUtil.capitalizeWord(type1);
        }
    }

    public String getWeightString() {
        return String.valueOf(weight / 10) + " kg";
    }

    public String getHeightString() {
        return String.valueOf(height / 10) + " m";
    }

    public String getAbilitiesString() {
        if(abilities == null || abilities.isEmpty()) {
            return "";
        }
        Ability ability1 = abilities.get(0);
        if(abilities.size() == 1) {
            return PokemonUtil.formatAbilityName(ability1);
        } else {
            StringBuilder b = new StringBuilder();
            for(int i = abilities.size() - 1; i >= 0; i--) {
                b.append(PokemonUtil.formatAbilityName(abilities.get(i)));
                if(i > 0) {
                    b.append("\n");
                }
            }
            return b.toString();
        }
    }

    public Stat getSPD() {
        return stats.get(0);
    }

    public Stat getSPDEF() {
        return stats.get(1);
    }

    public Stat getSPATK() {
        return stats.get(2);
    }

    public Stat getDEF() {
        return stats.get(3);
    }

    public Stat getATK() {
        return stats.get(4);
    }

    public Stat getHP() {
        return stats.get(5);
    }

}
