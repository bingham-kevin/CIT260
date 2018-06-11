/*
 * The ListItem class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 *  Team members: Kevin Bingham, Tyler Day
 */
package Model;

import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author Tyler
 */
public class ListItem implements Serializable {
    
    private String name;
    private int number; 
    
    public ListItem () {   
    }
    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name= name;
    }
    public int getNumber () {
        return number;
    }
    public void setNumber (int number) {
        this.number=number;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + this.number;
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
        final ListItem other = (ListItem) obj;
        if (this.number != other.number) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ListItem{" + "name=" + name + ", number=" + number + '}';
    }
    
            
}
