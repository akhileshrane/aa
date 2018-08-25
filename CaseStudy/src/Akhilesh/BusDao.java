package Akhilesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;


public class BusDao {
	String driverName = "com.mysql.jdbc.Driver";
	String url= "jdbc:mysql://localhost/Bus";
	String userName="root";
	String password="root";
	
	public List<Bus> getBus() throws SQLException, ClassNotFoundException {
		List<Bus> busList = new ArrayList<Bus>();
		//Loading the driver		
		Class.forName(driverName);
		Connection con= DriverManager.getConnection(url,userName,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Bus;");
		while(rs.next()) {
			String busName = rs.getString("busName");
			Time arrivalTime =rs.getTime("arrivalTime");
			int waitStatus = rs.getInt("waitStatus");				
			Bus bus=new Bus();
			bus.setBusName(busName);
			bus.setArrivalTime(arrivalTime);
			bus.setWaitStatus(waitStatus);
			
			busList.add(bus);
		}
		con.close();
		st.close();
		rs.close();
		
		return busList;

	}
	public int addBus(Bus bus) throws ClassNotFoundException, SQLException{
		int numberOfBusesAdded = 0;
		Class.forName(driverName);
		Connection con= DriverManager.getConnection(url,userName,password);
		PreparedStatement st;
		st=con.prepareStatement("insert into  values(?,?,?);");
		st.setString(1, bus.getBusName());
		st.setTime(2, bus.getArrivalTime());
		st.setInt(3, bus.getWaitStatus());
		
		numberOfBusesAdded=st.executeUpdate();
		System.out.println("Records added: "+numberOfBusesAdded);
		return numberOfBusesAdded;	
	}
}
