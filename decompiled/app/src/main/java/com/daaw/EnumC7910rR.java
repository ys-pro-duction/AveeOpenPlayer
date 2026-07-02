package com.daaw;

import com.daaw.AbstractC9870yR;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.rR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC7910rR {
    public static final a B;
    public static final EnumC7910rR C = new EnumC7910rR("Function", 0);
    public static final EnumC7910rR D = new EnumC7910rR("SuspendFunction", 1);
    public static final EnumC7910rR E = new EnumC7910rR("KFunction", 2);
    public static final EnumC7910rR F = new EnumC7910rR("KSuspendFunction", 3);
    public static final EnumC7910rR G = new EnumC7910rR("UNKNOWN", 4);
    public static final /* synthetic */ EnumC7910rR[] H;
    public static final /* synthetic */ YG I;

    /* JADX INFO: renamed from: com.daaw.rR$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final EnumC7910rR a(AbstractC9870yR abstractC9870yR) {
            G10.g(abstractC9870yR, "functionTypeKind");
            return G10.c(abstractC9870yR, AbstractC9870yR.a.e) ? EnumC7910rR.C : G10.c(abstractC9870yR, AbstractC9870yR.d.e) ? EnumC7910rR.D : G10.c(abstractC9870yR, AbstractC9870yR.b.e) ? EnumC7910rR.E : G10.c(abstractC9870yR, AbstractC9870yR.c.e) ? EnumC7910rR.F : EnumC7910rR.G;
        }

        public a() {
        }
    }

    static {
        EnumC7910rR[] enumC7910rRArrA = a();
        H = enumC7910rRArrA;
        I = AbstractC3110aH.a(enumC7910rRArrA);
        B = new a(null);
    }

    public EnumC7910rR(String str, int i) {
    }

    public static final /* synthetic */ EnumC7910rR[] a() {
        return new EnumC7910rR[]{C, D, E, F, G};
    }

    public static EnumC7910rR valueOf(String str) {
        return (EnumC7910rR) Enum.valueOf(EnumC7910rR.class, str);
    }

    public static EnumC7910rR[] values() {
        return (EnumC7910rR[]) H.clone();
    }
}
