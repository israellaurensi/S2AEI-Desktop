
package Controller;

import Model.Administrador;
import Model.Database.AdministradorDAO;

public class LoginController {
    
    public int checkUser(String userEmail, String userPass) {
        
        Administrador adm;
        AdministradorDAO admDAO = new AdministradorDAO();
        
        if (userEmail.equals("") || userPass.equals(""))
            return 1; // 1 = campos em branco
        
        boolean check = admDAO.checkLogin(userEmail, userPass);
        if (check) return 0; // tudo certo
        else return 2; // nao encontrou usuario
    }
    
}
