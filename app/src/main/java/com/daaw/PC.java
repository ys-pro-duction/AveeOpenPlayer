package com.daaw;

import com.daaw.AbstractC6977o40;
import com.daaw.OC;

/* JADX INFO: loaded from: classes.dex */
public class PC implements InterfaceC0409Bc1 {
    public static final PC a = new PC();
    public static final AbstractC6977o40.a b = AbstractC6977o40.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    @Override // com.daaw.InterfaceC0409Bc1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public OC a(AbstractC6977o40 abstractC6977o40, float f) {
        OC.a aVar = OC.a.CENTER;
        abstractC6977o40.d();
        OC.a aVar2 = aVar;
        String strR = null;
        String strR2 = null;
        float F = 0.0f;
        int I = 0;
        float F2 = 0.0f;
        float F3 = 0.0f;
        int iD = 0;
        int iD2 = 0;
        float F4 = 0.0f;
        boolean zS = true;
        while (abstractC6977o40.o()) {
            switch (abstractC6977o40.o0(b)) {
                case 0:
                    strR = abstractC6977o40.R();
                    break;
                case 1:
                    strR2 = abstractC6977o40.R();
                    break;
                case 2:
                    F = (float) abstractC6977o40.F();
                    break;
                case 3:
                    int I2 = abstractC6977o40.I();
                    aVar2 = OC.a.CENTER;
                    if (I2 <= aVar2.ordinal() && I2 >= 0) {
                        aVar2 = OC.a.values()[I2];
                    }
                    break;
                case 4:
                    I = abstractC6977o40.I();
                    break;
                case 5:
                    F2 = (float) abstractC6977o40.F();
                    break;
                case 6:
                    F3 = (float) abstractC6977o40.F();
                    break;
                case 7:
                    iD = AbstractC8936v40.d(abstractC6977o40);
                    break;
                case 8:
                    iD2 = AbstractC8936v40.d(abstractC6977o40);
                    break;
                case 9:
                    F4 = (float) abstractC6977o40.F();
                    break;
                case 10:
                    zS = abstractC6977o40.s();
                    break;
                default:
                    abstractC6977o40.p0();
                    abstractC6977o40.q0();
                    break;
            }
        }
        abstractC6977o40.l();
        return new OC(strR, strR2, F, aVar2, I, F2, F3, iD, iD2, F4, zS);
    }
}
