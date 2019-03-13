public class Element{

  public Type type;
  public int intValue;
  public double doubleValue;
  public String stringValue;

  public Element(Type type, int intVal, double doubleVal, String stringVal){
    this.type = type;
    intValue = intVal;
    doubleValue = doubleVal;
    stringValue = stringVal;
  }

  public String toString(){
    if(type == Type.INT) return Integer.toString(intValue);
    else if(type == Type.DOUBLE) return Double.toString(doubleValue);
    else return stringValue;
  }
}
