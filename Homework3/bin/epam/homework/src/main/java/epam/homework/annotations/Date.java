package epam.homework.annotations;

/**
 * 
 * Annotation is used for date set up.
 * @Target(ElementType.ANNOTATION_TYPE)
 * @Retention(RetentionPolicy.RUNTIME)
 */
public @interface Date {
	int day();
    int month();
    int year();
}
