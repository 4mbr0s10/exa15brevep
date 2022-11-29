package exa15brevep;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        FileInputStream fi = new FileInputStream("platoss");
        ObjectInputStream ois = new ObjectInputStream(fi);
//        Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:3600/home/dam2a/Descargas/taboasexameb.sql/");
//        Statement st=cn.createStatement();
//        String query="select graxa from componentes where codc='c1''";
//        ResultSet rs = st.executeQuery(query);

        Platos p1 = new Platos("","");
        Platos p2 = new Platos("","");
        try {
            p1=(Platos)ois.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            p2=(Platos)ois.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        ois.close();
        System.out.println(p1.getCodigop()+" "+p1.getNomep());
        System.out.println(p2.getCodigop()+" "+p2.getNomep());
    }
}