public abstract class DebugBoat {
    
    String boatType = new String();
    int passengers;// semicolon (;) was missing
    String power = new String();

    // misspelled DebugBoat
    public DebugBoat(String bt) {
        boatType = bt;
    }

    // Data type of otherBoat is missing
    public boolean equals(DebugBoat otherBoat)  {
        boolean result;
        if ((passengers == otherBoat.passengers) && (power.equals(otherBoat.power)))
            result = true;
        else
            result = false;
        return result;// semicolon (;) is missing
    }

    public String toString() {
        // double quotes is missing
        return ("This " + boatType + "boat carries " + passengers + " and is powered by " + power);
    }

    public abstract void setPower();
    public abstract void setPassengers();
}
