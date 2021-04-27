package mx.com.proyecti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//nos permite configura nuestro servicioweb de tipo res de forma sencilla sin tener que incluir mayor configuracion
@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class EmployeeRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(EmployeeRest.class, args);
	}

}
