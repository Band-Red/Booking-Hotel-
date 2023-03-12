public class Booking{
    public static void main(String[] args){
        Hotel[]arr=new Hotel[8];
        Hotel h1=new Hotel("Ahmed Naser","Saturday, 5 February","Saturday, 7 February",134,4.3);
        Hotel h2=new Hotel("Eiad Ali","Monday, 28 January","Thursday, 31 January",114,4.0);
        Hotel h3=new Hotel("Hassan Ahmed","Tuesday,1 February","Wednesday, 2 February",138,5.0);
        Hotel h4=new Hotel("Ali Eiad","Sunday, 3 February","Monday, 6 February",110,3.9);
        Hotel h5=new Hotel("Ahmed Muhammad","Saturday, 14 February","Saturday, 15 February",34,3.5);
        Hotel h6=new Hotel("Muhammad Ali","Monday, 25 January","Thursday, 26 January",104,3.0);
        Hotel h7=new Hotel("Hamad Moses","Tuesday,9 February","Wednesday, 10 February",18,4.8);
        Hotel h8=new Hotel("mohsen Eiad","Sunday, 17 February","Monday, 18 February",21,4.7);
        System.out.println("    Name"+"\t\t"+"   Arrival_Date"+"\t\t\t"+"    Departure_Date"+"\t"+"    Room_Number"+"\t"+"     assessment");
        System.out.println(arr[0]=h1);
        System.out.println(arr[1]=h2);
        System.out.println(arr[2]=h3);
        System.out.println(arr[3]=h4);
        System.out.println(arr[4]=h5);
        System.out.println(arr[5]=h6);
        System.out.println(arr[6]=h7);
        System.out.println(arr[7]=h8); 
    }
}