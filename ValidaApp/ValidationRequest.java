package ValidaApp;

public class ValidationRequest {
	private String ip;
	private AutenticUserPermissions autenticUser;
	private PermissionsUser permisosUser;
	private String estatusValidacion;
	
	public ValidationRequest(String ip) {
		super();
		this.ip = ip;
	}
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public AutenticUserPermissions getAutenticUser() {
		return autenticUser;
	}
	public void setAutenticUser(AutenticUserPermissions autenticUser) {
		this.autenticUser = autenticUser;
	}
	public PermissionsUser getPermisosUser() {
		return permisosUser;
	}
	public void setPermisosUser(PermissionsUser permisosUser) {
		this.permisosUser = permisosUser;
	}

	@Override
	public String toString() {
		return "ValidationRequest [ip=" + ip + ", autenticUser=" + autenticUser + ", permisosUser=" + permisosUser
				+ "]";
	}

	public String getEstatusValidacion() {
		return estatusValidacion;
	}

	public void setEstatusValidacion(String estatusValidacion) {
		this.estatusValidacion = estatusValidacion;
	} 
	

}
