/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 *  Team members: Kevin Bingham, Tyler Day
 */

package cityOfAaron.model;


/**
 *
 * @author kbingham
 */
public enum TeamMember {
    Member1("Tyler", "Team member of Group 5."),
    Member2("Kevin", "Team member of Group 5.");
    
    private String name;
    private String title;

    TeamMember(String name, String title) {
        this.name = name;
        this. title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", title=" + title + '}';
    }
    
    
}
