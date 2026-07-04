package com.daaw;

import com.daaw.S60;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.pG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7310pG0 {
    public static final C7310pG0 a = new C7310pG0();
    public static final AbstractC2923Yz b = AbstractC2923Yz.h;

    /* JADX INFO: renamed from: com.daaw.pG0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[S60.a.values().length];
            try {
                iArr[S60.a.C.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S60.a.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S60.a.D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final CharSequence g(InterfaceC9918yc1 interfaceC9918yc1) {
        C7310pG0 c7310pG0 = a;
        I80 type = interfaceC9918yc1.getType();
        G10.f(type, "getType(...)");
        return c7310pG0.l(type);
    }

    public static final CharSequence i(InterfaceC9918yc1 interfaceC9918yc1) {
        C7310pG0 c7310pG0 = a;
        I80 type = interfaceC9918yc1.getType();
        G10.f(type, "getType(...)");
        return c7310pG0.l(type);
    }

    public final void c(StringBuilder sb, RE0 re0) {
        if (re0 != null) {
            I80 type = re0.getType();
            G10.f(type, "getType(...)");
            sb.append(l(type));
            sb.append(".");
        }
    }

    public final void d(StringBuilder sb, InterfaceC1376Ki interfaceC1376Ki) {
        RE0 re0I = AbstractC8511tb1.i(interfaceC1376Ki);
        RE0 re0I0 = interfaceC1376Ki.i0();
        c(sb, re0I);
        boolean z = (re0I == null || re0I0 == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        c(sb, re0I0);
        if (z) {
            sb.append(")");
        }
    }

    public final String e(InterfaceC1376Ki interfaceC1376Ki) {
        if (interfaceC1376Ki instanceof InterfaceC4476fA0) {
            return k((InterfaceC4476fA0) interfaceC1376Ki);
        }
        if (interfaceC1376Ki instanceof InterfaceC8468tR) {
            return f((InterfaceC8468tR) interfaceC1376Ki);
        }
        throw new IllegalStateException(("Illegal callable: " + interfaceC1376Ki).toString());
    }

    public final String f(InterfaceC8468tR interfaceC8468tR) throws IOException {
        G10.g(interfaceC8468tR, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        C7310pG0 c7310pG0 = a;
        c7310pG0.d(sb, interfaceC8468tR);
        AbstractC2923Yz abstractC2923Yz = b;
        C2352Tm0 name = interfaceC8468tR.getName();
        G10.f(name, "getName(...)");
        sb.append(abstractC2923Yz.T(name, true));
        List listH = interfaceC8468tR.h();
        G10.f(listH, "getValueParameters(...)");
        AbstractC2455Um.k0(listH, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : C6752nG0.B);
        sb.append(": ");
        I80 returnType = interfaceC8468tR.getReturnType();
        G10.d(returnType);
        sb.append(c7310pG0.l(returnType));
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public final String h(InterfaceC8468tR interfaceC8468tR) throws IOException {
        G10.g(interfaceC8468tR, "invoke");
        StringBuilder sb = new StringBuilder();
        C7310pG0 c7310pG0 = a;
        c7310pG0.d(sb, interfaceC8468tR);
        List listH = interfaceC8468tR.h();
        G10.f(listH, "getValueParameters(...)");
        AbstractC2455Um.k0(listH, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : C7031oG0.B);
        sb.append(" -> ");
        I80 returnType = interfaceC8468tR.getReturnType();
        G10.d(returnType);
        sb.append(c7310pG0.l(returnType));
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public final String j(V60 v60) {
        G10.g(v60, MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        StringBuilder sb = new StringBuilder();
        int i = a.a[v60.i().ordinal()];
        if (i == 1) {
            sb.append("extension receiver parameter");
        } else if (i == 2) {
            sb.append("instance parameter");
        } else {
            if (i != 3) {
                throw new C6902no0();
            }
            sb.append("parameter #" + v60.getIndex() + ' ' + v60.getName());
        }
        sb.append(" of ");
        sb.append(a.e(v60.r().X()));
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public final String k(InterfaceC4476fA0 interfaceC4476fA0) {
        G10.g(interfaceC4476fA0, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC4476fA0.f0() ? "var " : "val ");
        C7310pG0 c7310pG0 = a;
        c7310pG0.d(sb, interfaceC4476fA0);
        AbstractC2923Yz abstractC2923Yz = b;
        C2352Tm0 name = interfaceC4476fA0.getName();
        G10.f(name, "getName(...)");
        sb.append(abstractC2923Yz.T(name, true));
        sb.append(": ");
        I80 type = interfaceC4476fA0.getType();
        G10.f(type, "getType(...)");
        sb.append(c7310pG0.l(type));
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public final String l(I80 i80) {
        G10.g(i80, "type");
        return b.U(i80);
    }
}
