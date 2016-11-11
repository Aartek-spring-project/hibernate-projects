package org.alexsotob.querycache;

import java.sql.Types;

import org.hibernate.dialect.MySQL5InnoDBDialect;

public class EnhancedMySQL5HibernateDialect extends MySQL5InnoDBDialect {

    public EnhancedMySQL5HibernateDialect() {
        super();
        registerColumnType(Types.BIT, "tinyint(1)");
    }

    @Override
    protected void registerVarcharTypes() {
        registerColumnType(Types.VARCHAR, "longtext");
    }


}