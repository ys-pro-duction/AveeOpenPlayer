package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.aI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC3115aI0 {
    public static final EnumC3115aI0 B = new EnumC3115aI0("PLAIN", 0) { // from class: com.daaw.aI0.b
        {
            AbstractC2911Yw abstractC2911Yw = null;
        }

        @Override // com.daaw.EnumC3115aI0
        public String c(String str) {
            G10.g(str, "string");
            return str;
        }
    };
    public static final EnumC3115aI0 C = new EnumC3115aI0("HTML", 1) { // from class: com.daaw.aI0.a
        {
            AbstractC2911Yw abstractC2911Yw = null;
        }

        @Override // com.daaw.EnumC3115aI0
        public String c(String str) {
            G10.g(str, "string");
            return AY0.s(AY0.s(str, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };
    public static final /* synthetic */ EnumC3115aI0[] D;
    public static final /* synthetic */ YG E;

    static {
        EnumC3115aI0[] enumC3115aI0ArrA = a();
        D = enumC3115aI0ArrA;
        E = AbstractC3110aH.a(enumC3115aI0ArrA);
    }

    public /* synthetic */ EnumC3115aI0(String str, int i, AbstractC2911Yw abstractC2911Yw) {
        this(str, i);
    }

    public static final /* synthetic */ EnumC3115aI0[] a() {
        return new EnumC3115aI0[]{B, C};
    }

    public static EnumC3115aI0 valueOf(String str) {
        return (EnumC3115aI0) Enum.valueOf(EnumC3115aI0.class, str);
    }

    public static EnumC3115aI0[] values() {
        return (EnumC3115aI0[]) D.clone();
    }

    public abstract String c(String str);

    public EnumC3115aI0(String str, int i) {
    }
}
