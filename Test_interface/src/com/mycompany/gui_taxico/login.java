/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui_taxico;

import com.codename1.components.ImageViewer;
import com.codename1.ui.Button;
import static com.codename1.ui.CN.NORTH;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;

/**
 *
 * @author achref
 */
public class login extends Form {
    Resources theme;
    
   Form f;
    Label username;
    Label password;
    TextField loginTF;
    TextField passwordTF;
    Button login;
    Button signup;
    Style s;

    public login() {
        theme = UIManager.initFirstTheme("/theme");
        this.setUIID("login");
        
        
        
        f= new Form(BoxLayout.y());
        ImageViewer img = new ImageViewer();
        img.setImage(theme.getImage("logo3.png").scaled(650, 650));
        username = new Label("nom utilisateur");
        loginTF = new TextField("", "nom utilisateur", 10, 0);
        password = new Label("mot de passe");
        passwordTF = new TextField("", "mot de passe", 10, TextField.PASSWORD);
        login = new Button("se connecter");
        signup = new Button("Créer un compte");
        f.add(img);
        f.add(username);
        f.add(loginTF);
        f.add(password);
        f.add(passwordTF);
        f.add(login);

        f.add(signup);
         
            
        signup.addActionListener((evt) -> {
            signup su = new signup();
            su.getS();
   
        });
    
    }
        
    

    public Form getF() {
        return f;
    }

    public void setF(Form f) {
        this.f = f;
    }
    
    
    
}

