class RsiSolution {
    
    public static void main(String[] args) {
        
        RobotController rbt = new RobotController.getInstance();
        int A0, A1, A2, A3, A4, A5;
        //provide new values for A0 to A5
        
        RobotController rbt = new RobotController();
        rbt.manipulate(A0, A1, A2, A3, A4, A5);
        
        String[] values = rbt.getUpdatedValues();
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
            RET 
        }
        return s;
    }
    
}
