import java.util.ArrayList;

public class Room {
    private int roomID;
    private String north;
    private String south;
    private String east;
    private String west;
    private String northWest;
    private String northEast;
    private String southWest;
    private String southEast;
    private String up;
    private String down;
    private String roomDescription;
    private String roomName;
    private boolean hasBeenVisited;
    private boolean containsPlayer;
    ArrayList<Item> roomInventory = new ArrayList();
    ArrayList<Puzzle> puzzles = new ArrayList();
    ArrayList<Monster> monsters = new ArrayList();

    public Room(int roomID, String north, String south, String east, String west, String roomDescription, String roomName, boolean hasBeenVisited, boolean containsPlayer, ArrayList<Item> roomInventory, String northWest,String northEast,String southWest,String southEast, String up, String down) {
        this.roomID = roomID;
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
        this.roomDescription = roomDescription;
        this.roomName = roomName;
        this.hasBeenVisited = hasBeenVisited;
        this.containsPlayer = containsPlayer;
        this.roomInventory = roomInventory;
        this.northWest = northWest;
        this.northEast = northEast;
        this.southEast = southEast;
        this.southWest = southWest;
        this.up = up;
        this.down = down;
    }

    public Room() {
        this.roomID = roomID;
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
        this.roomDescription = roomDescription;
        this.roomName = roomName;
        this.hasBeenVisited = hasBeenVisited;
        this.containsPlayer = containsPlayer;
        this.roomInventory = roomInventory;
        this.northWest = northWest;
        this.northEast = northEast;
        this.southEast = southEast;
        this.southWest = southWest;
        this.up = up;
        this.down = down;
    }

    public String getNorthWest() {
        return northWest;
    }

    public void setNorthWest(String northWest) {
        this.northWest = northWest;
    }

    public String getNorthEast() {
        return northEast;
    }

    public void setNorthEast(String northEast) {
        this.northEast = northEast;
    }

    public String getSouthWest() {
        return southWest;
    }

    public void setSouthWest(String southWest) {
        this.southWest = southWest;
    }

    public String getSouthEast() {
        return southEast;
    }

    public void setSouthEast(String southEast) {
        this.southEast = southEast;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public String getDown() {
        return down;
    }

    public void setDown(String down) {
        this.down = down;
    }

    public ArrayList<Puzzle> getPuzzles() {
        return puzzles;
    }

    public void setPuzzles(ArrayList<Puzzle> puzzles) {
        this.puzzles = puzzles;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getNorth() {
        return north;
    }

    public void setNorth(String north) {
        this.north = north;
    }

    public String getSouth() {
        return south;
    }

    public void setSouth(String south) {
        this.south = south;
    }

    public String getEast() {
        return east;
    }

    public void setEast(String east) {
        this.east = east;
    }

    public String getWest() {
        return west;
    }

    public void setWest(String west) {
        this.west = west;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public boolean isHasBeenVisited() {
        return hasBeenVisited;
    }

    public void setHasBeenVisited(boolean hasBeenVisited) {
        this.hasBeenVisited = hasBeenVisited;
    }

    public boolean isContainsPlayer() {
        return containsPlayer;
    }

    public void setContainsPlayer(boolean containsPlayer) {
        this.containsPlayer = containsPlayer;
    }

    public ArrayList<Item> getRoomInventory() {
        return roomInventory;
    }

    public void setRoomInventory(ArrayList<Item> inventory) {
        this.roomInventory = inventory;
    }
}
