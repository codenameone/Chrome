package com.codename1.demo.chrome.gui;

import com.codename1.ui.Display;
import com.codename1.ui.Form;

/**
 * A functioning calculator UI created with the GUI builder
 */
public class Calculator extends com.codename1.ui.Form {
    private double calcValue = 0;
    private static final int DIVIDE = 1;
    private static final int MULTIPLY = 2;
    private static final int SUBTRACT = 3;
    private static final int ADD = 4;
    private int pendingOp;
    private Form previous;

    public Calculator() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public Calculator(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_Container4 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui_Container2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.LayeredLayout());
    private com.codename1.ui.TextField gui_calculatorField = new com.codename1.ui.TextField();
    private com.codename1.ui.Container gui_Container3 = new com.codename1.ui.Container();
    private com.codename1.ui.Button gui_BackButton = new com.codename1.ui.Button();
    private com.codename1.ui.Container gui_Container = new com.codename1.ui.Container(new com.codename1.ui.layouts.GridLayout(5, 4));
    private com.codename1.ui.Button gui_m = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_bracketL = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_brecketR = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Button3 = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Seven = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Eight = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Nine = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Divide = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Four = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Five = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Six = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Multiply = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_One = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Two = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Three = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Minus = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Zero = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_DecimalPoint = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_PlusMinus = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Plus = new com.codename1.ui.Button();
    private com.codename1.ui.Container gui_Container1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.GridLayout(1, 2));
    private com.codename1.ui.Button gui_Clear = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Equals = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_BackButton.addActionListener(callback);
        gui_Seven.addActionListener(callback);
        gui_Eight.addActionListener(callback);
        gui_Nine.addActionListener(callback);
        gui_Divide.addActionListener(callback);
        gui_Four.addActionListener(callback);
        gui_Five.addActionListener(callback);
        gui_Six.addActionListener(callback);
        gui_Multiply.addActionListener(callback);
        gui_One.addActionListener(callback);
        gui_Two.addActionListener(callback);
        gui_Three.addActionListener(callback);
        gui_Minus.addActionListener(callback);
        gui_Zero.addActionListener(callback);
        gui_DecimalPoint.addActionListener(callback);
        gui_PlusMinus.addActionListener(callback);
        gui_Plus.addActionListener(callback);
        gui_Clear.addActionListener(callback);
        gui_Equals.addActionListener(callback);
    }

    class EventCallbackClass implements com.codename1.ui.events.ActionListener, com.codename1.ui.events.DataChangedListener {
        private com.codename1.ui.Component cmp;
        public EventCallbackClass(com.codename1.ui.Component cmp) {
            this.cmp = cmp;
        }

        public EventCallbackClass() {
        }

        public void actionPerformed(com.codename1.ui.events.ActionEvent ev) {
            com.codename1.ui.Component sourceComponent = ev.getComponent();
            if(sourceComponent.getParent().getLeadParent() != null) {
                sourceComponent = sourceComponent.getParent().getLeadParent();
            }

            if(sourceComponent == gui_BackButton) {
                onBackButtonActionEvent(ev);
            }
            if(sourceComponent == gui_Seven) {
                onSevenActionEvent(ev);
            }
            if(sourceComponent == gui_Eight) {
                onEightActionEvent(ev);
            }
            if(sourceComponent == gui_Nine) {
                onNineActionEvent(ev);
            }
            if(sourceComponent == gui_Divide) {
                onDivideActionEvent(ev);
            }
            if(sourceComponent == gui_Four) {
                onFourActionEvent(ev);
            }
            if(sourceComponent == gui_Five) {
                onFiveActionEvent(ev);
            }
            if(sourceComponent == gui_Six) {
                onSixActionEvent(ev);
            }
            if(sourceComponent == gui_Multiply) {
                onMultiplyActionEvent(ev);
            }
            if(sourceComponent == gui_One) {
                onOneActionEvent(ev);
            }
            if(sourceComponent == gui_Two) {
                onTwoActionEvent(ev);
            }
            if(sourceComponent == gui_Three) {
                onThreeActionEvent(ev);
            }
            if(sourceComponent == gui_Minus) {
                onMinusActionEvent(ev);
            }
            if(sourceComponent == gui_Zero) {
                onZeroActionEvent(ev);
            }
            if(sourceComponent == gui_DecimalPoint) {
                onDecimalPointActionEvent(ev);
            }
            if(sourceComponent == gui_PlusMinus) {
                onPlusMinusActionEvent(ev);
            }
            if(sourceComponent == gui_Plus) {
                onPlusActionEvent(ev);
            }
            if(sourceComponent == gui_Clear) {
                onClearActionEvent(ev);
            }
            if(sourceComponent == gui_Equals) {
                onEqualsActionEvent(ev);
            }
        }

        public void dataChanged(int type, int index) {
        }
    }
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        guiBuilderBindComponentListeners();
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setName("Calculator");
        addComponent(gui_Container4);
        gui_Container4.setUIID("PaddedContainer");
        gui_Container4.setName("Container4");
        gui_Container4.addComponent(gui_Container2);
        gui_Container2.setName("Container2");
        gui_Container2.addComponent(gui_calculatorField);
        gui_Container2.addComponent(gui_Container3);
        gui_Container3.setName("Container3");
        gui_Container3.addComponent(gui_BackButton);
        gui_BackButton.setText("");
        gui_BackButton.setUIID("Label");
        gui_BackButton.setName("BackButton");
        gui_BackButton.setIcon(resourceObjectInstance.getImage("calendar_arrow_left@2x.png"));
        gui_calculatorField.setEditable(false);
        gui_calculatorField.setText("0");
        gui_calculatorField.setUIID("CalculatorInput");
        gui_calculatorField.setName("calculatorField");
        gui_Container3.setName("Container3");
        gui_Container4.addComponent(gui_Container);
        gui_Container.setName("Container");
        gui_Container.addComponent(gui_m);
        gui_Container.addComponent(gui_bracketL);
        gui_Container.addComponent(gui_brecketR);
        gui_Container.addComponent(gui_Button3);
        gui_Container.addComponent(gui_Seven);
        gui_Container.addComponent(gui_Eight);
        gui_Container.addComponent(gui_Nine);
        gui_Container.addComponent(gui_Divide);
        gui_Container.addComponent(gui_Four);
        gui_Container.addComponent(gui_Five);
        gui_Container.addComponent(gui_Six);
        gui_Container.addComponent(gui_Multiply);
        gui_Container.addComponent(gui_One);
        gui_Container.addComponent(gui_Two);
        gui_Container.addComponent(gui_Three);
        gui_Container.addComponent(gui_Minus);
        gui_Container.addComponent(gui_Zero);
        gui_Container.addComponent(gui_DecimalPoint);
        gui_Container.addComponent(gui_PlusMinus);
        gui_Container.addComponent(gui_Plus);
        gui_m.setText("m");
        gui_m.setUIID("CalcButton");
        gui_m.setName("m");
        gui_bracketL.setText("[");
        gui_bracketL.setUIID("CalcButton");
        gui_bracketL.setName("bracketL");
        gui_brecketR.setText("]");
        gui_brecketR.setUIID("CalcButton");
        gui_brecketR.setName("brecketR");
        gui_Button3.setText("EE");
        gui_Button3.setUIID("CalcButton");
        gui_Button3.setName("Button3");
        gui_Seven.setText("7");
        gui_Seven.setUIID("CalcButton");
        gui_Seven.setName("Seven");
        gui_Eight.setText("8");
        gui_Eight.setUIID("CalcButton");
        gui_Eight.setName("Eight");
        gui_Nine.setText("9");
        gui_Nine.setUIID("CalcButton");
        gui_Nine.setName("Nine");
        gui_Divide.setText("/");
        gui_Divide.setUIID("CalcButton");
        gui_Divide.setName("Divide");
        gui_Four.setText("4");
        gui_Four.setUIID("CalcButton");
        gui_Four.setName("Four");
        gui_Five.setText("5");
        gui_Five.setUIID("CalcButton");
        gui_Five.setName("Five");
        gui_Six.setText("6");
        gui_Six.setUIID("CalcButton");
        gui_Six.setName("Six");
        gui_Multiply.setText("*");
        gui_Multiply.setUIID("CalcButton");
        gui_Multiply.setName("Multiply");
        gui_One.setText("1");
        gui_One.setUIID("CalcButton");
        gui_One.setName("One");
        gui_Two.setText("2");
        gui_Two.setUIID("CalcButton");
        gui_Two.setName("Two");
        gui_Three.setText("3");
        gui_Three.setUIID("CalcButton");
        gui_Three.setName("Three");
        gui_Minus.setText("-");
        gui_Minus.setUIID("CalcButton");
        gui_Minus.setName("Minus");
        gui_Zero.setText("0");
        gui_Zero.setUIID("CalcButton");
        gui_Zero.setName("Zero");
        gui_DecimalPoint.setText(".");
        gui_DecimalPoint.setUIID("CalcButton");
        gui_DecimalPoint.setName("DecimalPoint");
        gui_PlusMinus.setText("+/-");
        gui_PlusMinus.setUIID("CalcButton");
        gui_PlusMinus.setName("PlusMinus");
        gui_Plus.setText("+");
        gui_Plus.setUIID("CalcButton");
        gui_Plus.setName("Plus");
        gui_Container4.addComponent(gui_Container1);
        gui_Container1.setName("Container1");
        gui_Container1.addComponent(gui_Clear);
        gui_Container1.addComponent(gui_Equals);
        gui_Clear.setText("C");
        gui_Clear.setUIID("ClearButton");
        gui_Clear.setName("Clear");
        gui_Equals.setText("=");
        gui_Equals.setUIID("CalcButton");
        gui_Equals.setName("Equals");
        gui_Container2.setName("Container2");
        gui_Container.setName("Container");
        gui_Container1.setName("Container1");
        gui_Container4.setUIID("PaddedContainer");
        gui_Container4.setName("Container4");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!

    public void onBackButtonActionEvent(com.codename1.ui.events.ActionEvent ev) {
        previous.showBack();
    }



    public void onSevenActionEvent(com.codename1.ui.events.ActionEvent ev) {
        append(7);
    }


    public void onEightActionEvent(com.codename1.ui.events.ActionEvent ev) {
        append(8);
    }


    public void onNineActionEvent(com.codename1.ui.events.ActionEvent ev) {
        append(9);
    }


    public void onDivideActionEvent(com.codename1.ui.events.ActionEvent ev) {
        performOp(DIVIDE, true);
    }


    public void onFourActionEvent(com.codename1.ui.events.ActionEvent ev) {
        append(4);
    }


    public void onFiveActionEvent(com.codename1.ui.events.ActionEvent ev) {
        append(5);
    }


    public void onSixActionEvent(com.codename1.ui.events.ActionEvent ev) {
        append(6);
    }


    public void onMultiplyActionEvent(com.codename1.ui.events.ActionEvent ev) {
        performOp(MULTIPLY, true);
    }


    public void onOneActionEvent(com.codename1.ui.events.ActionEvent ev) {
        append(1);
    }


    public void onTwoActionEvent(com.codename1.ui.events.ActionEvent ev) {
        append(2);
    }


    public void onThreeActionEvent(com.codename1.ui.events.ActionEvent ev) {
        append(3);
    }


    public void onMinusActionEvent(com.codename1.ui.events.ActionEvent ev) {
        performOp(SUBTRACT, true);
    }


    public void onZeroActionEvent(com.codename1.ui.events.ActionEvent ev) {
        append(0);
    }


    public void onDecimalPointActionEvent(com.codename1.ui.events.ActionEvent ev) {
        if(gui_calculatorField.getText().indexOf('.') < 0) {
            gui_calculatorField.setText(gui_calculatorField.getText() + '.');
        }
    }


    public void onPlusMinusActionEvent(com.codename1.ui.events.ActionEvent ev) {
        double d = Double.parseDouble(gui_calculatorField.getText()) * -1;
        gui_calculatorField.setText("" + calcValueAsString(d));
    }


    public void onPlusActionEvent(com.codename1.ui.events.ActionEvent ev) {
        performOp(ADD, true);
    }


    public void onClearActionEvent(com.codename1.ui.events.ActionEvent ev) {
        gui_calculatorField.setText("");
        calcValue = 0;
        pendingOp = 0;
    }


    public void onEqualsActionEvent(com.codename1.ui.events.ActionEvent ev) {
        performOp(0, false);
        gui_calculatorField.setText("" + calcValueAsString(calcValue));
    }


    public void show() {
        previous = Display.getInstance().getCurrent();
        gui_calculatorField.setText("" + calcValueAsString(calcValue));
        super.show();
    }
    
    private double getCurrentCalcValue() {
        return Double.parseDouble(gui_calculatorField.getText());
    }
    
    
    private void append(int v) {
        gui_calculatorField.setText(gui_calculatorField.getText() + v);
    }
    
    
    private String calcValueAsString(double d) {
        long v = (long)d;
        if(((double)v) == d) {
            return "" + v;
        }
        return "" + d;
    }

    private void performOp(int upcoming, boolean reset) {
        double val = getCurrentCalcValue();
        switch(pendingOp) {
            case DIVIDE:
                calcValue /= val;
                break;
            case MULTIPLY:
                calcValue *= val;
                break;
            case ADD:
                calcValue += val;
                break;
            case SUBTRACT:
                calcValue -= val;
                break;
            default:
                calcValue = val;
                break;
        }
        pendingOp = upcoming;
        if(reset) {
            gui_calculatorField.setText("");
        }
    }
}
