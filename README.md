* maven install
  mvn install

* add to pom
~~~
  <build>
     <plugins>
        <plugin>
           <groupId>org.blockfreie.carnelian</groupId>
            <artifactId>gremlin-maven-plugin</artifactId>
            <version>1.0-SNAPSHOT</version>
        </plugin>
    </plugins>
 </build>
~~~

* maven gremlin plugin
~~~
 mvn org.blockfreie.carnelian:gremlin-maven-plugin:gremlin
~~~