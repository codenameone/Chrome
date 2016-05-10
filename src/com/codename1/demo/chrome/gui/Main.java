package com.codename1.demo.chrome.gui;

import com.codename1.ui.FontImage;
import com.codename1.ui.list.DefaultListModel;
import com.codename1.ui.plaf.Style;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Main UI of the demo as a GUI builder class.  This class doesn't really do much as this demo mostly shows 
 * a few UI elements and a calculator
 */
public class Main extends com.codename1.ui.Form {
    Calculator calc;
    public Main() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public Main(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
        
        Style s = getUIManager().getComponentStyle("TitleCommand");
        FontImage icon = FontImage.createMaterial(FontImage.MATERIAL_KEYBOARD, s, 4);
        getToolbar().setTitleCentered(true);
        getToolbar().addCommandToRightBar("", icon, e -> {
            if(calc == null) {
                calc = new Calculator();
            }
            calc.show();
        });

        Style tabStyle = getUIManager().getComponentStyle("Tab");
        Style tabSelectedStyle = getUIManager().getComponentSelectedStyle("Tab");
        FontImage firstTabIcon = FontImage.createMaterial(FontImage.MATERIAL_DATE_RANGE, tabStyle, 3);
        FontImage secondTabIcon = FontImage.createMaterial(FontImage.MATERIAL_VIEW_COMPACT, tabStyle, 3);
        FontImage thirdTabIcon = FontImage.createMaterial(FontImage.MATERIAL_COMPARE, tabStyle, 3);
        FontImage forthTabIcon = FontImage.createMaterial(FontImage.MATERIAL_CONTACTS, tabStyle, 3);
        FontImage firstTabIconSel = FontImage.createMaterial(FontImage.MATERIAL_DATE_RANGE, tabSelectedStyle, 3);
        FontImage secondTabIconSel = FontImage.createMaterial(FontImage.MATERIAL_VIEW_COMPACT, tabSelectedStyle, 3);
        FontImage thirdTabIconSel = FontImage.createMaterial(FontImage.MATERIAL_COMPARE, tabSelectedStyle, 3);
        FontImage forthTabIconSel = FontImage.createMaterial(FontImage.MATERIAL_CONTACTS, tabSelectedStyle, 3);
        
        gui_Tabs.setTabTitle("Comps", firstTabIcon, 0);
        gui_Tabs.setTabTitle("Elements", secondTabIcon, 1);
        gui_Tabs.setTabTitle("Button", thirdTabIcon, 2);
        gui_Tabs.setTabTitle("Item", forthTabIcon, 3);
        gui_Tabs.setTabSelectedIcon(0, firstTabIconSel);
        gui_Tabs.setTabSelectedIcon(1, secondTabIconSel);
        gui_Tabs.setTabSelectedIcon(2, thirdTabIconSel);
        gui_Tabs.setTabSelectedIcon(3, forthTabIconSel);
        
        HashMap<String, Object> e1 = new HashMap<>();
        e1.put("Line1", "Lance Maeyer");
        e1.put("Line2", "Lorem ipsum");
        e1.put("Line3", "Consectetur");
        e1.put("icon", resourceObjectInstance.getImage("avatar1@2x.png"));
        
        HashMap<String, Object> e2 = new HashMap<>();
        e2.put("Line1", "Entry 2");
        e2.put("Line2", "more...");
        e2.put("emblem", resourceObjectInstance.getImage("list-item-arrow@2x.png"));
        e2.put("icon", resourceObjectInstance.getImage("avatar1@2x.png"));

        HashMap<String, Object> e3 = new HashMap<>();
        e3.put("Line1", "Entry 3");
        e3.put("Line2", "more...");
        e3.put("emblem", resourceObjectInstance.getImage("list-item-arrow@2x.png"));
        e3.put("icon", resourceObjectInstance.getImage("avatar1@2x.png"));

        ArrayList<Map<String, Object>> elements = new ArrayList<>();
        elements.add(e1);
        elements.add(e2);
        elements.add(e3);
        gui_MultiList.setModel(new DefaultListModel(elements));
    }


    
    
//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Tabs gui_Tabs = new com.codename1.ui.Tabs();
    private com.codename1.ui.Container gui_Container3 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Container gui_Container5 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Calendar gui_Calendar = new com.codename1.ui.Calendar();
    private com.codename1.ui.Container gui_Container2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Slider gui_Slider = new com.codename1.ui.Slider();
    private com.codename1.ui.TextField gui_TextField = new com.codename1.ui.TextField();
    private com.codename1.ui.Container gui_Container4 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_Container6 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Button gui_Button5 = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Button4 = new com.codename1.ui.Button();
    private com.codename1.ui.Container gui_Container1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.list.MultiList gui_MultiList = new com.codename1.ui.list.MultiList();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BorderLayout());
        setScrollableY(false);
        setTitle("Chrome");
        setName("Main");
        addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Tabs);
        gui_Tabs.setName("Tabs");
        gui_Tabs.setPropertyValue("titles", new String[]{"Components", "Elements", "Button", "Item"});
        gui_Tabs.setPropertyValue("icons", new com.codename1.ui.Image[]{resourceObjectInstance.getImage("tab-icon1@2x.png"), resourceObjectInstance.getImage("tab-icon2@2x.png"), resourceObjectInstance.getImage("tab-icon3@2x.png"), resourceObjectInstance.getImage("tab-icon4@2x.png")});
        gui_Tabs.setPropertyValue("selectedIcons", new com.codename1.ui.Image[]{resourceObjectInstance.getImage("tab-icon1@2x.png"), resourceObjectInstance.getImage("tab-icon2@2x.png"), resourceObjectInstance.getImage("tab-icon3@2x.png"), resourceObjectInstance.getImage("tab-icon4@2x.png")});
        gui_Tabs.addTab("Components" ,gui_Container3);
        gui_Container3.setName("Container3");
        gui_Container3.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Container5);
        gui_Container5.setUIID("CalendarFrame");
        gui_Container5.setName("Container5");
        gui_Container5.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Calendar);
        gui_Calendar.setName("Calendar");
        gui_Container5.setUIID("CalendarFrame");
        gui_Container5.setName("Container5");
        gui_Tabs.addTab("Elements" ,gui_Container2);
        gui_Container2.setName("Container2");
        gui_Container2.addComponent(gui_Slider);
        gui_Container2.addComponent(gui_TextField);
        gui_Slider.setEditable(true);
        gui_Slider.setText("");
        gui_Slider.setName("Slider");
        gui_TextField.setText("TextField");
        gui_TextField.setName("TextField");
        gui_Tabs.addTab("Button" ,gui_Container4);
        gui_Container4.setName("Container4");
        ((com.codename1.ui.layouts.FlowLayout)gui_Container4.getLayout()).setAlign(com.codename1.ui.Component.CENTER);
        gui_Container4.addComponent(gui_Container6);
        gui_Container6.setName("Container6");
        gui_Container6.addComponent(gui_Button5);
        gui_Container6.addComponent(gui_Button4);
        gui_Button5.setText("Button");
        gui_Button5.setName("Button5");
        gui_Button4.setText("Button");
        gui_Button4.setUIID("MetalButton");
        gui_Button4.setName("Button4");
        gui_Container6.setName("Container6");
        gui_Tabs.addTab("Item" ,gui_Container1);
        gui_Container1.setName("Container1");
        gui_Container1.addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_MultiList);
        gui_MultiList.setName("MultiList");
        gui_MultiList.setItemGap(0);
        gui_Container3.setName("Container3");
        gui_Container2.setName("Container2");
        gui_Container4.setName("Container4");
        ((com.codename1.ui.layouts.FlowLayout)gui_Container4.getLayout()).setAlign(com.codename1.ui.Component.CENTER);
        gui_Container1.setName("Container1");
        gui_Tabs.setName("Tabs");
        gui_Tabs.setPropertyValue("titles", new String[]{"Components", "Elements", "Button", "Item"});
        gui_Tabs.setPropertyValue("icons", new com.codename1.ui.Image[]{resourceObjectInstance.getImage("tab-icon1@2x.png"), resourceObjectInstance.getImage("tab-icon2@2x.png"), resourceObjectInstance.getImage("tab-icon3@2x.png"), resourceObjectInstance.getImage("tab-icon4@2x.png")});
        gui_Tabs.setPropertyValue("selectedIcons", new com.codename1.ui.Image[]{resourceObjectInstance.getImage("tab-icon1@2x.png"), resourceObjectInstance.getImage("tab-icon2@2x.png"), resourceObjectInstance.getImage("tab-icon3@2x.png"), resourceObjectInstance.getImage("tab-icon4@2x.png")});
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
