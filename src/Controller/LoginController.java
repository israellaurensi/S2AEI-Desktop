
package Controller;

import Model.Administrador;
import Model.Database.AdministradorDAO;

public class LoginController {
    
    public boolean checkUser(String userEmail, String userPass) {
        
        Administrador adm;
        AdministradorDAO admDAO = new AdministradorDAO();
        
        boolean check = admDAO.checkLogin(userEmail, userPass);
        return check;
    }
    
}
