/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 *  Team members: Kevin Bingham, Tyler Day
 */

package cityOfAaron.model;

import java.io.Serializable;


/**
 *
 * @author kbingham
 */
public enum TeamMember implements Serializable{
    
    Tyler("Tyler", "Team member of Group 5."),
    Kevin("Kevin", "Team member of Group 5.");
    
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
