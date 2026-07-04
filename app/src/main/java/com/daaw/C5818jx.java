package com.daaw;

import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: com.daaw.jx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5818jx implements InterfaceC10117zJ {
    public static final Constructor g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e = 1;
    public int f;

    static {
        Constructor constructor = null;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(InterfaceC8715uJ.class).getConstructor(null);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        g = constructor;
    }

    @Override // com.daaw.InterfaceC10117zJ
    public synchronized InterfaceC8715uJ[] a() {
        InterfaceC8715uJ[] interfaceC8715uJArr;
        Constructor constructor = g;
        interfaceC8715uJArr = new InterfaceC8715uJ[constructor == null ? 12 : 13];
        interfaceC8715uJArr[0] = new C10221zh0(this.a);
        interfaceC8715uJArr[1] = new C6791nQ(this.c);
        interfaceC8715uJArr[2] = new C0973Gl0(this.b);
        interfaceC8715uJArr[3] = new C0765El0(this.d);
        interfaceC8715uJArr[4] = new C7529q3();
        interfaceC8715uJArr[5] = new C4151e1();
        interfaceC8715uJArr[6] = new C7824r61(this.e, this.f);
        interfaceC8715uJArr[7] = new DN();
        interfaceC8715uJArr[8] = new C0781Ep0();
        interfaceC8715uJArr[9] = new C8970vB0();
        interfaceC8715uJArr[10] = new C6584mg1();
        interfaceC8715uJArr[11] = new U3();
        if (constructor != null) {
            try {
                interfaceC8715uJArr[12] = (InterfaceC8715uJ) constructor.newInstance(null);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return interfaceC8715uJArr;
    }
}
