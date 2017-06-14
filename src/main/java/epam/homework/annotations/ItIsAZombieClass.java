package epam.homework.annotations;

import java.lang.annotation.Inherited;

/**
*
* Marker annotation for all zombie classes.
* @Target(ElementType.CLASS)
* @Retention(RetentionPolicy.RUNTIME)
* 
*/
@Inherited
public @interface ItIsAZombieClass {
String note = "It is a zombie character class";
String author = "Created by Danila";
}
