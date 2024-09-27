public class VirtueSkill extends Skill 
{
    public VirtueSkill(String skillName, int skillLevel) 
    {
        super(skillName, "Virtue", skillLevel);
    }

    @Override
    public String identifySkill() 
    {
        return "Virtue Skill of " + getSkillName() + " has a level of " + getSkillLevel();
    }
}
