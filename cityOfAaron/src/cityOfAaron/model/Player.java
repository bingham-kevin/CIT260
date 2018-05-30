/*
 * The Player class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 *  Team members: Kevin Bingham, Tyler Day
 */

package cityOfAaron.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author kbingham
 */
public class Player implements Serializable{
    
    private String name;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }

    
}
