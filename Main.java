public class Main {
    public static void main(String[] args) {
   
        User staff = new User();
        staff.setUser_id(101);
        staff.setUser_name("Piyawat Meetee");
        staff.setUser_gender(Gender.M);
        staff.setUser_role(RoleUser.PublicRelation);

        Proposal p = new Proposal();
        p.setProposal_code("REQ-001");
        p.setProposal_title("Project Alpha");

        
        System.out.println("--- ข้อมูลในระบบ ---");
        System.out.println("ID: " + staff.getUser_id());
        System.out.println("Name: " + staff.getUser_name());
        System.out.println("Role: " + staff.getUser_role());
        System.out.println("Proposal: " + p.getProposal_title());
        System.out.println("Status: " + p.getProposal_status());
    }
}