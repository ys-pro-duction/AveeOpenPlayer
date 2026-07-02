package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public interface S60 extends InterfaceC8941v50 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a B = new a("INSTANCE", 0);
        public static final a C = new a("EXTENSION_RECEIVER", 1);
        public static final a D = new a("VALUE", 2);
        public static final /* synthetic */ a[] E;
        public static final /* synthetic */ YG F;

        static {
            a[] aVarArrA = a();
            E = aVarArrA;
            F = AbstractC3110aH.a(aVarArrA);
        }

        public a(String str, int i) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{B, C, D};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) E.clone();
        }
    }

    boolean a();

    int getIndex();

    String getName();

    InterfaceC7550q70 getType();

    a i();

    boolean q();
}
