package com.daaw;

/* JADX INFO: renamed from: com.daaw.tB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8404tB extends AbstractC2476Ur0 {
    public final InterfaceC10174zX0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8404tB(AP ap, InterfaceC10174zX0 interfaceC10174zX0, InterfaceC2968Zk0 interfaceC2968Zk0) {
        super(interfaceC2968Zk0, ap);
        G10.g(ap, "fqName");
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC2968Zk0, "module");
        this.H = interfaceC10174zX0;
    }

    public abstract InterfaceC4077dl F0();

    public boolean K0(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        InterfaceC4346ej0 interfaceC4346ej0Q = q();
        return (interfaceC4346ej0Q instanceof AbstractC3922dB) && ((AbstractC3922dB) interfaceC4346ej0Q).t().contains(c2352Tm0);
    }

    public abstract void L0(C9523xA c9523xA);
}
