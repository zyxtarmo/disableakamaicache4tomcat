# disableakamaicache4tomcat

Quick'n'dirty way to add X-Check-Cacheable: NO header to Apache Tomcat

1. Copy .jar in github target/ to lib/ of your Tomcat
2. and add to conf/web.xml:

<filter>
       <filter-name>DisableAkamaiCache</filter-name>
       <filter-class>net.suvaline.DisableAkamaiCache</filter-class>
</filter>

<filter-mapping>
       <filter-name>DisableAkamaiCache</filter-name>
       <url-pattern>/*</url-pattern>
</filter-mapping>

Use it at your own risk.

zyxtarmo @ Oct 2015 


