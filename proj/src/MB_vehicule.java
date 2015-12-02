
public class MB_vehicule {
	VehiculeDAO v1= new VehiculeDAO();
Vehicule v=new Vehicule();
public Vehicule getV() {
	return v;
}
public void setV(Vehicule v) {
	this.v = v;
}
public String inserer(){
	v1.insert(v);
	return null;
}
private int code;

public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
}
