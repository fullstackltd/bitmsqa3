package pmis;

public class Progammer extends Employee {
  private int skillLevel;

  
  public Progammer(){}
  
  public Progammer(int skillLevel){
    this.skillLevel = skillLevel;
  }

  public int getSkillLevel() {
    return skillLevel;
  }

  public void setSkillLevel(int skillLevel) {
    this.skillLevel = skillLevel;
  }

  @Override
  public String toString() {
    return "Progammer [skillLevel=" + skillLevel + "]";
  }

  
}
