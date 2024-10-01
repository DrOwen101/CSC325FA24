public class TalentSkill extends Skill
{
    public TalentSkill(String skillName, int skillLevel) 
    {
        super(skillName, "Talent", skillLevel);
    }

    @Override
    public String identifySkill() 
    {
       return "Talent Skill of " + getSkillName() + " has a level of " + getSkillLevel();
    }
}
