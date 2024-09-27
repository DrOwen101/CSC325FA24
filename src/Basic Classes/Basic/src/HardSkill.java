class HardSkill extends Skill
{
    public HardSkill(String skillName, int skillLevel) 
    {
        super(skillName, "Hard", skillLevel);
    }
    
    @Override
    public String identifySkill()
    {
        return "Hard Skill of " + getSkillName() + " has a level of " + getSkillLevel();
    }
}
