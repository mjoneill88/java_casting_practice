import java.util.* ;

class Machine {

  public void set(){
    System.out.println("Machine is Working!");
  }

}

class Camera extends Machine {

  public void set(){
    System.out.println("Camera is Working!");
  }

  public void extendedCamera(){
    System.out.println("The extended camera method is called!");
  }
}

public class Driver {
  public static void main(String[] args) {
    Machine mac = new Machine();
    Camera cam = new Camera();
    System.out.println("Normal:");
    mac.set();
    cam.set();
    cam.extendedCamera();
    System.out.println("Upcast: Should be simple");
    Machine camInMac = new Camera();
    camInMac.set();
    // camInMac.extendedCamera();
    System.out.println("Downcasting");
    Machine mac2 = new Camera();
    Camera cam2 = (Camera)mac2;
    mac2.set();
    cam2.set();
    cam2.extendedCamera();
  }
}
