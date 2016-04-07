var ioc = {
    config: {
        type: "org.nutz.ioc.impl.PropertiesProxy",
        fields: {
            paths: [ "conf.properties" ]
        }
    },
    dataSource: {
    	type: "com.mchange.v2.c3p0.ComboPooledDataSource",
        fields: {
            driverClass: {
                java: "$config.get('db-driver')"
            },
            jdbcUrl: {
                java: "$config.get('db-url')"
            },
            user: {
                java: "$config.get('db-username')"
            },
            password: {
                java: "$config.get('db-password')"
            },
            maxPoolSize: {
                java: "$config.get('db-maxPoolSize')"
            },
            minPoolSize: {
                java: "$config.get('db-minPoolSize')"
            },
            maxIdleTime: {
                java: "$config.get('db-maxIdle')"
            },
            automaticTestTable: {
                java: "$config.get('db-automaticTestTable')"
            }
        }
    },
    filesql: {
        type: "org.nutz.dao.impl.FileSqlManager",
        args: "sqlmap"
    },
    dao: {
        type: "org.nutz.dao.impl.NutDao",
        args: [
            {
                refer: 'dataSource'
            },
            {
                refer: 'filesql'
            }
        ]
    }
};