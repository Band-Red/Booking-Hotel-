public class Hotel {
    private String Name;
    private String Arrival_Date;
    private String Departure_Date;
    private int Room_Number;
    private double assessment;
public Hotel(String Name, String Arrival_Date, String Departure_Date, int Room_Number, double assessment){
    this.Name = Name;
    this.Arrival_Date=Arrival_Date;
    this.Departure_Date=Departure_Date;
    this.Room_Number=Room_Number;
    this.assessment=assessment;
}
public String getN(){
    return this.Name;
}
public void setN(String Name){
    this.Name=Name;
}
public String getA_D(){
    return this.Arrival_Date;
}
public void setA_D(String Arrival_Date){
    this.Arrival_Date=Arrival_Date;
}
public String getDep_D(){
    return this.Departure_Date;
}
public void setDep_D(String Departure_Date){
    this.Departure_Date=Departure_Date;
}
public int getR_N(){
    return this.Room_Number;
}
public void setR_N(int Room_Number){
    this.Room_Number=Room_Number;
}
public double getAsses(){
    return this.assessment;
}
public void setAsses(double assessment){
    this.assessment=assessment;
}
@Override
public String toString(){     //to String 
    return this.Name+"\t\t"+this.Arrival_Date+"\t\t"+this.Departure_Date+"\t\t"+this.Room_Number+"\t\t"+this.assessment;
}
public String printInfo(){       // printInfo
    return this.Name+"\t\t"+this.Arrival_Date+"\t\t"+this.Departure_Date+"\t\t"+this.Room_Number+"\t\t"+this.assessment;
}
}