public class SoftSkill extends Skill 
{
    public SoftSkill(String skillName, int skillLevel) 
    {
        super(skillName, "Soft", skillLevel);
    }

    @Override
    public String identifySkill()
    {
        return "Soft Skill of " + getSkillName() + " has a level of " + getSkillLevel();
    }
}


