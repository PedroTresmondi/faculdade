
package com.mycompany.projeto.banco;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author pedro.h.tresmondi
 */
public class TesteBanco {
    public static void main(String[] args) {
        Connection config = new Connection();
        JdbcTemplate template = new JdbcTemplate(config.getDataSource());
        List listaPokemon01 = template.queryForList("select * from test");
        System.out.println(listaPokemon01);
        
    }
}
