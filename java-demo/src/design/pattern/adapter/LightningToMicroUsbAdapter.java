package design.pattern.adapter;

public class LightningToMicroUsbAdapter implements MicroUsbPhone{
    private final LightningPhone lightningPhone;


    public LightningToMicroUsbAdapter(LightningPhone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }

    @Override
    public void recharge() {
        lightningPhone.recharge();
    }

    @Override
    public void useMicroUsb() {
        System.out.println("MicroUsb connected");
        lightningPhone.useLightning();
    }
}
