package ComponentPackage;

import com.spring_practice1.springPrac1.scope.JDBCConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

    @Autowired
    private JDBC2Connection jdbc2Connection;

    public JDBC2Connection getJdbc2Connection() {
        return jdbc2Connection;
    }

    public void setJdbc2Connection(JDBC2Connection jdbc2Connection) {
        this.jdbc2Connection = jdbc2Connection;
    }



}
