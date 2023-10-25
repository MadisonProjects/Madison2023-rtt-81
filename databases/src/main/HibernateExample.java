
<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE hibernate-configuration SYSTEM "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
<session-factory>
<property name="hibernate.hbm2ddl.auto">validate</property>

<property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
<property name="connection.url">jdbc:mysql://192.168.2.100:3306/classic_models</property>
<property name="connection.username">dev</property>
<property name="connection.password">ultra30dev</property>
<property name="dialect">org.hibernate.dialect.MySQL5Dialect</property>

<property name="hibernate.show_sql">true</property>
<property name="hibernate.format_sql">true</property>


<mapping class="org.perscholas.database.entity.Customer" />
</session-factory>
</hibernate-configuration>