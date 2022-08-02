package interfaceTest;

public class InterfaceCall {
    public static void main(String[] args) {
        BeCall beCall = null;
        a(beCall);
    }
    public static void a(BeCall beCall){
        beCall.call();
    }
}
