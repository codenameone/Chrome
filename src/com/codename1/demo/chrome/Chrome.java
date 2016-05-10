package com.codename1.demo.chrome;


import com.codename1.demo.chrome.gui.Main;
import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Toolbar;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;

/**
 * <p>The chrome demo suffers from slightly antiquated design due to lack of update to its 
 * <a href="http://www.appdesignvault.com/shop/chrome/">source application</a>. The original demo
 * was based on an iOS native template designed during the iOS 4.x days and the template was never updated
 * to modern flat design heuristics. </p>
 * 
 * <p>
 * We still think this demo is of interest so we chose to keep it and modernize it, the original version was written 
 * on top of the old GUI builder. This version is adapted to the new GUI builder. We removed a lot of the textures
 * and old icons from the design and replaced some of the fonts with the new fonts + material design icons. 
 * </p>
 * 
 * @author Shai Almog
 */

public class Chrome {
    private Resources theme;
    
    private Form current;
    public void init(Object context) {
        theme = UIManager.initFirstTheme("/theme");
        
        //Enable Toolbar to all Forms by default
        Toolbar.setGlobalToolbar(true);
        
        // Pro only feature, uncomment if you have a pro subscription
        //Log.bindCrashProtection(true);    
    }

    public void start() {
        if(current != null) {
            current.show();
            return;
        }
        new Main().show();
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
    }
    
    public void destroy() {
    }
}
