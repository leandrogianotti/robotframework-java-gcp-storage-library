
import org.robotframework.javalib.library.AnnotationLibrary;

public class GCPStorageLibrary extends AnnotationLibrary {

    public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

    private static final String KEYWORD_PATTERN = "com/github/leandrogianotti/gcpstoragelibrary/keywords/**";

    public GCPStorageLibrary() {
        super(KEYWORD_PATTERN);
    }

}