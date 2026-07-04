package com.daaw;

/* JADX INFO: renamed from: com.daaw.bt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3560bt {
    public static final InterfaceC3281at a = new a();

    /* JADX INFO: renamed from: com.daaw.bt$a */
    public static final class a implements InterfaceC3281at {
        @Override // com.daaw.InterfaceC3281at
        public float a(long j, InterfaceC4988gz interfaceC4988gz) {
            G10.g(interfaceC4988gz, "density");
            return 0.0f;
        }

        public String toString() {
            return "ZeroCornerSize";
        }
    }

    public static final InterfaceC3281at a(int i) {
        return new C1109Ht0(i);
    }

    public static final InterfaceC3281at b(float f) {
        return new C6739nD(f, null);
    }
}
