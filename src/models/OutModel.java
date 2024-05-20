package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.cj.xdevapi.Statement;

public class OutModel {

	public OutModel() {
		// TODO Auto-generated constructor stub
	}
	
	public void login(String user , String password) {
		
		String dbUser = ("");
		String dbPassword = ("");
		
		/*try {
			Class.forName("com.mysql.jdbc.Driver");
			
			try {
				Connection con = DriverManager.getConnection
						("jdbc:mysql://sql.freedb.tech:3306/freedb_Tester","freedb_Christian Fiol","*AvUA4XR9NNmz?F");
				java.sql.Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from users");
				
				while(rs.next()) 
					
					System.out.println(rs.getString(1) + " " + rs.getString(2));
					
				
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
		
		 try {
	            Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_Tester", "freedb_Christian Fiol", "*AvUA4XR9NNmz?F");
	            String query = "SELECT Usuario, Contraseña FROM users WHERE Usuario = ? AND Contraseña = ?";
	            PreparedStatement pstmt = con.prepareStatement(query);
	            pstmt.setString(1, "Administrador");
	            pstmt.setString(2, "Pruebacontraseña");
	            ResultSet rs = pstmt.executeQuery();

	            if (rs.next()) {
	                dbUser = rs.getString("Usuario");
	                dbPassword = rs.getString("Contraseña");
	            }

	            con.close();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        // Verificación de los datos de inicio de sesión con los datos de administrador
	        if (user.equals(dbUser) && password.equals(dbPassword)) {
	            JOptionPane.showMessageDialog(null, "Bienvenido");
	        } else {
	            JOptionPane.showMessageDialog(null, "Verificar Datos");
	        }
		
	}

}
