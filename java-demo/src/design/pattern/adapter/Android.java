package design.pattern.adapter;

public class Android implements MicroUsbPhone{
    private boolean connector;

    @Override
    public void recharge() {
        connector = true;
        System.out.println("MicroUsb connected");
    }

    @Override
    public void useMicroUsb() {
        if (connector) {
            System.out.println("Recharge started");
            System.out.println("Recharge finished");
        } else {
            System.out.println("Connect MicroUsb first");
        }
    }
}
