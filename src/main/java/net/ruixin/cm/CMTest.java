package net.ruixin.cm;

import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;

import java.io.File;
import java.io.IOException;

/**
 * @author dingmx
 * @date 2019/8/2 20:00
 */
public class CMTest {

    public static void main(String[] args) throws JClassAlreadyExistsException, IOException {
        JCodeModel cm = new JCodeModel();
        cm._package("net.ruixin.service");
        JDefinedClass definedClass = cm._class("net.ruixin.service.UserService");
        definedClass.mods();
        cm.build(new File(System.getProperty("user.dir")));
    }
}
