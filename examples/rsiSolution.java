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
    
    manipulate(String A0, String A1, String A2, String A3, String A4, String A5) {
        //native method call
        rbt.manipulate(A0, A1, A2, A3, A4, A5);
        //
    }
    
    public String[] getUpdatedValues() {
        String[] s = {
            rbt.getA0(),
            rbt.getA1(),
            rbt.getA2(),
            rbt.getA3(),
            rbt.getA4(),
            rbt.getA5(),
            rbt.getCurrA0(),
            rbt.getCurrA1(),
            rbt.getCurrA2(),
            rbt.getCurrA3(),
            rbt.getCurrA4(),
            rbt.getCurrA5()
        }
        return s;
    }
    
}