abstract public class Player {

    private String name = "Default Name";

    public Player() {}

    public Player(String name) {
        setName(name);
    }

    abstract public int guess();

    public void setName(String name) {
        if(name != null && name.matches("^[a-zA-Z0-9~.]{3,}$")) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Incorrect name");
        }
    }

    public String getName() {
        return name;
    }

}