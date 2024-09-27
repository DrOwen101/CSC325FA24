public class Main 
{
    public static void main(String[] args) 
    {
        // Create instances of each skill type
        Skill hardSkill = new HardSkill("Programming", 8);
        Skill softSkill = new SoftSkill("Communication", 7);
        Skill virtueSkill = new VirtueSkill("Mercy", 9);
        Skill talentSkill = new TalentSkill("Organization", 6);

        // Call the identifySkill() method for each skill and print the result
        System.out.println(hardSkill.identifySkill());
        System.out.println(softSkill.identifySkill());
        System.out.println(virtueSkill.identifySkill());
        System.out.println(talentSkill.identifySkill());
    }
}