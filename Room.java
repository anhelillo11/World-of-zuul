
/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael KÃ¶lling and David J. Barnes
 * @version 2011.07.31
 */
public class Room 
{
    private String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;
    private Room southeastExit;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west, Room southeast) 
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
        if(southeast != null)
            southeastExit= southeast;
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
    * Devuelve la sala vecina a la actual que esta ubicada en la direccion indicada como parametro.
    *
    * @param salida Un String indicando la direccion por la que saldriamos de la sala actual
    * @return La sala ubicada en la direccion especificada o null si no hay ninguna salida en esa direccion
              */
    public Room getExit(String salida) {
        Room roomToReturn = null;
        
        if (salida.equals("north")) {
            roomToReturn = northExit;
        }
        if (salida.equals("east")) {
            roomToReturn = eastExit;
        }
        if (salida.equals("south")) {
            roomToReturn = southExit;
        }
        if (salida.equals("west")) {
            roomToReturn = westExit;
        }
        if (salida.equals("southeast")) {
            roomToReturn = southeastExit;
        }
        
        
        
        return roomToReturn;
    }
    
    /**
    * Devuelve la información de las salidas existentes
    * Por ejemplo: "Exits: north east west" o "Exits: south" 
    * o "Exits: " si no hay salidas disponibles
    *
    * @return Una descripción de las salidas existentes.
    */
    public String getExitString() {
        String exitsDescription = "Exits:";
        if (northExit != null) {
            exitsDescription += "north ";
        }
        if (southExit != null) {
            exitsDescription += "south ";
        }
        if (eastExit != null) {
            exitsDescription += "east ";
        }
        if (southExit != null) {
            exitsDescription += "west ";
        }
        if (southeastExit != null) {
            exitsDescription += "southeast";
        }
        
        return exitsDescription;
    }
    
    /**
    * Define una salida para esta sala
    * 
    * @param direccion La direccion de la salida (por ejemplo "north" o "southEast")
    * @param sala La sala que se encuentra en la direccion indicada
    */
    public void setExit(String direccion, Room sala) {
    
        
    }
}