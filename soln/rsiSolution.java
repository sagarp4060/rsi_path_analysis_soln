class RsiSolution {
    
    public static void main(String[] args) {
        
        RobotController rbt = new RobotController.getInstance();
        float A0, A1, A2, A3, A4, A5;
        //read values from 'importData.xml'
        
        RobotController rbt = new RobotController();
        rbt.manipulate(A0, A1, A2, A3, A4, A5);
        String[] newValues = rbt.getUpdatedValues();
        //write new values to 'exportData.xml'

        System.out.println(values);
    }
    
}

class RobotController {
    
    getInstance() {
        System.loadLibrary("kukaRbtController.dll");
        return new RobotController();
    }
    
    manipulate(String A1, String A2, String A3, String A4, String A5, String A6, String m) {
        //native method cal'
        if (m.equals("PTP")) {
            PTP A1;
            PTP A2;
            PTP A3;
            PTP A4;
            PTP A5;
            PTP A6;
        } else if (m.equals("LIN")) {
            LIN A1;
            LIN A2;
            LIN A3;
            LIN A4;
            LIN A5;
            LIN A6;
        } else if (m.equals("CIRC")) {
            CIRC A1;
            CIRC A2;
            CIRC A3;
            CIRC A4;
            CIRC A5;
            CIRC A6;
        } else {
            System.out.println("Please enter correct value");
        }
    }
    
    public String[] getUpdatedValues() {
        String[] s = {
            //translational Corrections for rotational and translational axis
            RET RKorrX;
            RET RKorrY;
            RET RKorrZ;
            RET RKorrA;
            RET RKorrB;
            RET RKorrC;
            
            //axis specific corrections
            RET RKorrA1;
            RET RKorrA2;
            RET RKorrA3;
            RET RKorrA4;
            RET RKorrA5;
            RET RKorrA6;
            
            //EXTERNAL axis specific corrections
            RET RKorrA7;
            RET RKorrA8;
            RET RKorrA9;
            RET RKorrA10;
            RET RKorrA11;
            RET RKorrA12;
            
        }
        return s;
    }
    
}
