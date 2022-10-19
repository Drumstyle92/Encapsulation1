/**
 * @author Drumstyle92
 * Class with house features.
 */
public class House {
    /**
     * Plans of the house.
     */
    private int floorsNumber;
    /**
     * The way to the house.
     */
    private String address;
    /**
     * The names of the residents of the house.
     */
    private String[] residentsNames;

    /**
     * Empty constructor method of the class.
     */
    public House() {
    }

    /**
     *
     * @return Returns to the variable indicating the number of floors.
     * method used for encapsulation.
     */
    public int getFloorsNumber(){
        return floorsNumber;
    }

    /**
     *
     * @return Returns to the variable indicating the address.
     * method used for encapsulation.
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @return Returns to the variable indicating the name of the residents.
     * method used for encapsulation.
     */
    public String[] getResidentsNames(){
        return residentsNames;
    }

    /**
     *
     * @param address Parameter with which you can give the address.
     * method used for encapsulation.
     */
    public void setAddress(String address){
        this.address = address;
    }

    /**
     *
     * @param floorsNumber Parameter with which you can indicate the number of floors.
     * method used for encapsulation.
     */
    public void setFloorsNumber(int floorsNumber){
        this.floorsNumber = floorsNumber;
    }

    /**
     *
     * @param residentsNames Parameter with which you can indicate the names of the residents.
     * method used for encapsulation.
     */
    public void setResidentsNames(String [] residentsNames){
        this.residentsNames = residentsNames;
    }
}
