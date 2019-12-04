//public abstract class AbstractWriter {
//    public abstract void write(Object context);
//}
//
//public class ConcreteFileWriter extends AbstractWriter {
//    public void write (Object context) {
//        // method body
//    }
//}
//
//public class ConcreteXmlWriter extends AbstractWriter {
//    public void write (Object context) {
//        // method body
//    }
//}
//
//import java.io.File;
//import org.w3c.dom.Document;
//
//public class FactoryMethod {
//    public AbstractWriter getWriter(Object object) {
//        AbstractWriter writer = null;
//        if (object instanceof File) {
//            writer = new ConcreteFileWriter();
//        } else if (object instanceof Document) {
//            writer = new ConcreteXmlWriter();
//        }
//        return writer;
//    }
//}