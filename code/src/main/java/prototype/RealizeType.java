package prototype;

public class RealizeType implements Cloneable{
    protected RealizeType clone() throws CloneNotSupportedException{
        return (RealizeType) super.clone();
    }
}
