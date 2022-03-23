package models;

public class UserRoles {

    private Integer roleID;
    private String role;

    public UserRoles() {
    }

    public UserRoles(String role) {
        this.role = role;
    }

    public UserRoles(Integer roleID, String role) {
        this.roleID = roleID;
        this.role = role;
    }

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserRoles{" +
                "roleID=" + roleID +
                ", role='" + role + '\'' +
                '}';
    }
}
