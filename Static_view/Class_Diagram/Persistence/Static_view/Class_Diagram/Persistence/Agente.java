package Static_view.Class_Diagram.Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;


public class Agente {

    protected static Agente mInstancia=null;
    protected static Connection mBD;
    private static String url="jdbc:mysql://localhost:3307/practicabd?user=alumno&password=alumno";
    private static String driver="com.mysql.jdbc.Driver";
    
    //Constructor
    private Agente()throws Exception {
    	conectar();
    		
    }
    

     public static Agente getAgente() throws Exception{
          if (mInstancia==null){
          mInstancia=new Agente();
        }
        return mInstancia;
     }
 
    private void conectar() throws Exception {
         Class.forName(driver);
         mBD=DriverManager.getConnection(url);
    }

    
    public void desconectar() throws Exception{
    	mBD.close();
    }

    public boolean insert(String SQL) throws SQLException, Exception{ 
     	conectar();
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	boolean ret = false;
    	
    	if(res > 0){
    		
    		ret = true;
    	}
    	
    	return ret;
    }
    
    public boolean delete(String SQL) throws SQLException,Exception{
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	
    	boolean ret = false;
    	
    	if(res > 0){
    		
    		ret = true;
    	}
    	
    	return ret;
    }
    
    public boolean update(String SQL) throws SQLException,Exception{
    	conectar();
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	boolean ret = false;
    	
    	if(res > 0){
    		
    		ret = true;
    	}
    	
    	return ret;
    }
    
    
	/*public Vector<Object> select(String SQL) throws SQLException,Exception{

		
		
		
	}*/


}