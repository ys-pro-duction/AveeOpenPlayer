package com.daaw;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.te0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8525te0 extends InterfaceC9648xe0 {

    /* JADX INFO: renamed from: com.daaw.te0$a */
    public static final class a {
        public static /* synthetic */ Object a(InterfaceC8525te0 interfaceC8525te0, C0737Ee0 c0737Ee0, int i, int i2, float f, AbstractC0633De0 abstractC0633De0, float f2, boolean z, EnumC0520Ce0 enumC0520Ce0, boolean z2, InterfaceC1416Ks interfaceC1416Ks, int i3, Object obj) {
            AbstractC0633De0 abstractC0633De02;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
            }
            if ((i3 & 2) != 0) {
                i = interfaceC8525te0.h();
            }
            int i4 = i;
            int iB = (i3 & 4) != 0 ? interfaceC8525te0.b() : i2;
            float fC = (i3 & 8) != 0 ? interfaceC8525te0.c() : f;
            if ((i3 & 16) != 0) {
                interfaceC8525te0.l();
                abstractC0633De02 = null;
            } else {
                abstractC0633De02 = abstractC0633De0;
            }
            return interfaceC8525te0.d(c0737Ee0, i4, iB, fC, abstractC0633De02, (i3 & 32) != 0 ? AbstractC9090ve0.c(c0737Ee0, abstractC0633De02, fC) : f2, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? EnumC0520Ce0.Immediately : enumC0520Ce0, (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? false : z2, interfaceC1416Ks);
        }

        public static /* synthetic */ Object b(InterfaceC8525te0 interfaceC8525te0, C0737Ee0 c0737Ee0, float f, int i, boolean z, InterfaceC1416Ks interfaceC1416Ks, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
            }
            if ((i2 & 1) != 0) {
                c0737Ee0 = interfaceC8525te0.j();
            }
            if ((i2 & 2) != 0) {
                f = interfaceC8525te0.g();
            }
            if ((i2 & 4) != 0) {
                i = interfaceC8525te0.h();
            }
            if ((i2 & 8) != 0) {
                z = !(f == interfaceC8525te0.g());
            }
            return interfaceC8525te0.n(c0737Ee0, f, i, z, interfaceC1416Ks);
        }
    }

    Object d(C0737Ee0 c0737Ee0, int i, int i2, float f, AbstractC0633De0 abstractC0633De0, float f2, boolean z, EnumC0520Ce0 enumC0520Ce0, boolean z2, InterfaceC1416Ks interfaceC1416Ks);

    Object n(C0737Ee0 c0737Ee0, float f, int i, boolean z, InterfaceC1416Ks interfaceC1416Ks);
}
