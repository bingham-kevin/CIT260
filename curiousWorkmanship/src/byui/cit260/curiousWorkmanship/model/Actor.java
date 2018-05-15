/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

import java.awt.Point;

/**
 *
 * @author kbingham
 */
public enum Actor {
    Father("Lehi", "He is the prophet and leader of the family.", new Point(1,1)),
    Mother("Sariah", "She is Lehi's wife and mother of the family.", new Point(0,1)),
    Nephi("Nephi", "Faithful son and later the prophet leader of the Nephites.", new Point(1,2)),
    Jacob("Jacob", "Nephi's faithful brother, prophet and successor to Nephi.", new Point(2,3)),
    Sam("Sam", "The yougest boy and faithful brother of Nephi.", new Point(1,2)),
    Laman("Laman", "The oldest rebellious brother and leader of the Lamanites.", new Point(1,1)),
    Lemuel("Lemuel", "The 2nd oldest rebellious brother who went with Laman.", new Point(3,4)),
    Zoram("Zoram", "Laban servant that became a faithful follower of Nephi.", new Point(5,2));
    
    private String name;
    private String description;
    private Point coordinates;

    Actor(String name, String description, Point coordinates) {
        this.name = name;
        this. description = description;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }
    
    
}
