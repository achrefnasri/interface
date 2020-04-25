/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui_taxico;

import com.codename1.components.ImageViewer;
import com.codename1.ui.Button;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;

/**
 *
 * @author achref
 */
public class signup extends Form{

    Resources theme;

    Form f;
    Label username;
    Label email;
    Label password;
    Label password2;

    TextField usernameTF;
    TextField emailTF;
    TextField passwordTF;
    TextField password2TF;

    Button signup;
    Button annuler;

    public signup() {
        theme = UIManager.initFirstTheme("/theme");
        f = new Form(BoxLayout.y());
        ImageViewer img = new ImageViewer();
        img.setImage(theme.getImage("sign up.png").scaled(650, 650));
        username = new Label("nom utilisateur");
        email = new Label("email");
        password = new Label("mot de passe");
        password2 = new Label("retaper mot de passe");

        usernameTF = new TextField("", "nom utilisateur");
        emailTF = new TextField("", "Email");
        passwordTF = new TextField("", "Mot de passe");
        password2TF = new TextField("", "Mot de passe pour confirmation");

        signup = new Button("s'inscrire");
        annuler = new Button("annuler");
        f.add(img);
        f.add(username);
        f.add(usernameTF);
        f.add(email);
        f.add(emailTF);
        f.add(password);
        f.add(passwordTF);
        f.add(password2);
        f.add(password2TF);
        f.add(signup);
        f.add(annuler);

    }

    public Form getS() {
        return f;
    }

    public void setS(Form f) {
        this.f = f;
    }
}
