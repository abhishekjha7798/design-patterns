package org.abhishekjha.structural.facade;

public class FacadeJdbcDemo {
    public static void main(String[] args) {
        // This won't work because we have not added the Derby JDBC driver to the classpath, but
        // this is how you would typically use the facade.
        // Notice how the client code does not need to know about the underlying database connection
        // or SQL statements. It simply calls methods on the facade.
        JdbcFacade jdbcFacade = new JdbcFacade();
        jdbcFacade.createTable();
        jdbcFacade.insertIntoTable();
        jdbcFacade.getAllAddresses().forEach(System.out::println);
    }
}
