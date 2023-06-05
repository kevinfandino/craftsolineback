package proy.arq.springrestapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proy.arq.springrestapi.model.UserInfo;
import proy.arq.springrestapi.repository.UserInfoRepository;

@RestController
public class AuthController {
    private final UserInfoRepository userInfoRepository;

    public AuthController(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @PostMapping("/access")
    public ResponseEntity<String> login(@RequestBody UserInfo userinfo) {
        // Lógica para verificar las credenciales y autenticar al usuario
        String cuenta = userinfo.getCuenta();
        System.out.println(cuenta);
        String password = userinfo.getPassword();
        System.out.println(password);

        UserInfo user = userInfoRepository.findByCuenta(cuenta);

        // Ejemplo de verificación de credenciales
        if (user != null && password.equals(user.getPassword())) {
            // Las credenciales son correctas, devuelve una respuesta exitosa (código 200)
            return ResponseEntity.ok("Credenciales válidas");
        } else {
            // Las credenciales son incorrectas, devuelve una respuesta de error (código 401)
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }
}
