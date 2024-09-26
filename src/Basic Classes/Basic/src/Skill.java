public abstract class Skill 
{
    //variable initalization
    String skillName;
    String skillType;
    int skillLevel;

    // Constructor to initialize attributes
    public Skill(String skillName, String skillType, int skillLevel) 
    {
        this.skillName = skillName;
        this.skillType = skillType;
        this.skillLevel = skillLevel;
    }

    // Empty constructor
    public Skill() {}


    public String getSkillName()
    {
        return skillName;
    }
    public void setSkillName(String skillName) 
    {
        this.skillName = skillName;
    }


    public String getSkillType() 
    {
        return skillType;
    }
    public void setSkillType(String skillType) 
    {
        if (skillType.equals("Hard") || skillType.equals("Soft") || 
            skillType.equals("Talent") || skillType.equals("Virtue")) 
        {
            this.skillType = skillType;
        }
    }

    
    public int getSkillLevel() 
    {
        return skillLevel;
    }
    public void setSkillLevel(int skillLevel) {
        if (skillLevel >= 1 && skillLevel <= 10) {
            this.skillLevel = skillLevel;
        }
    }

    // Abstract method to identify skill
    public abstract String identifySkill();
}

