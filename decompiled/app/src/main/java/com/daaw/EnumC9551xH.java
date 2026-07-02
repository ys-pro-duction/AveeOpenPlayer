package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.xH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC9551xH {
    public static final EnumC9551xH C = new EnumC9551xH("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");
    public static final EnumC9551xH D = new EnumC9551xH("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");
    public static final EnumC9551xH E = new EnumC9551xH("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");
    public static final EnumC9551xH F = new EnumC9551xH("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");
    public static final EnumC9551xH G = new EnumC9551xH("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");
    public static final EnumC9551xH H = new EnumC9551xH("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");
    public static final EnumC9551xH I = new EnumC9551xH("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");
    public static final EnumC9551xH J = new EnumC9551xH("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");
    public static final EnumC9551xH K = new EnumC9551xH("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");
    public static final EnumC9551xH L = new EnumC9551xH("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");
    public static final /* synthetic */ EnumC9551xH[] M;
    public static final /* synthetic */ YG N;
    public final String B;

    static {
        EnumC9551xH[] enumC9551xHArrA = a();
        M = enumC9551xHArrA;
        N = AbstractC3110aH.a(enumC9551xHArrA);
    }

    public EnumC9551xH(String str, int i, String str2) {
        this.B = str2;
    }

    public static final /* synthetic */ EnumC9551xH[] a() {
        return new EnumC9551xH[]{C, D, E, F, G, H, I, J, K, L};
    }

    public static EnumC9551xH valueOf(String str) {
        return (EnumC9551xH) Enum.valueOf(EnumC9551xH.class, str);
    }

    public static EnumC9551xH[] values() {
        return (EnumC9551xH[]) M.clone();
    }

    public final String c() {
        return this.B;
    }
}
