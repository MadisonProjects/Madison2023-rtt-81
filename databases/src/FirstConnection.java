public static void main(String[] args) throws SQLException {
        String dburl = "jdbc:mysql://192.168.2.100:3306/classic_models";
        String user = "dev";
        String password = "ultra30dev";
        Connection connection = null;
        try {
        Class.forName("com.mysql.cj.jdbc.Driver"); // optional
        connection = DriverManager.getConnection(dburl, user, password);
        String sql = "Select * FROM employees where id = 1002;";
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
        Integer id = result.getInt("id");
        String name = result.getString("firstname");
        String email = result.getString("email");
        System.out.println(id + " | " + name + " | " + email);
        }
        result.close();
        } catch (Exception e) {
        e.printStackTrace();
        } finally {
        if (connection != null) {
        connection.close();
        }
        }
        }







