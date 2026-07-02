package com.daaw;

import java.util.ArrayList;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.gA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC4764gA {
    public static final a C;
    public static final Set D;
    public static final Set E;
    public static final EnumC4764gA F = new EnumC4764gA("VISIBILITY", 0, true);
    public static final EnumC4764gA G = new EnumC4764gA("MODALITY", 1, true);
    public static final EnumC4764gA H = new EnumC4764gA("OVERRIDE", 2, true);
    public static final EnumC4764gA I = new EnumC4764gA("ANNOTATIONS", 3, false);
    public static final EnumC4764gA J = new EnumC4764gA("INNER", 4, true);
    public static final EnumC4764gA K = new EnumC4764gA("MEMBER_KIND", 5, true);
    public static final EnumC4764gA L = new EnumC4764gA("DATA", 6, true);
    public static final EnumC4764gA M = new EnumC4764gA("INLINE", 7, true);
    public static final EnumC4764gA N = new EnumC4764gA("EXPECT", 8, true);
    public static final EnumC4764gA O = new EnumC4764gA("ACTUAL", 9, true);
    public static final EnumC4764gA P = new EnumC4764gA("CONST", 10, true);
    public static final EnumC4764gA Q = new EnumC4764gA("LATEINIT", 11, true);
    public static final EnumC4764gA R = new EnumC4764gA("FUN", 12, true);
    public static final EnumC4764gA S = new EnumC4764gA("VALUE", 13, true);
    public static final /* synthetic */ EnumC4764gA[] T;
    public static final /* synthetic */ YG U;
    public final boolean B;

    /* JADX INFO: renamed from: com.daaw.gA$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    static {
        EnumC4764gA[] enumC4764gAArrA = a();
        T = enumC4764gAArrA;
        U = AbstractC3110aH.a(enumC4764gAArrA);
        C = new a(null);
        EnumC4764gA[] enumC4764gAArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC4764gA enumC4764gA : enumC4764gAArrValues) {
            if (enumC4764gA.B) {
                arrayList.add(enumC4764gA);
            }
        }
        D = AbstractC2455Um.Q0(arrayList);
        E = AbstractC5431ib.t0(values());
    }

    public EnumC4764gA(String str, int i, boolean z) {
        this.B = z;
    }

    public static final /* synthetic */ EnumC4764gA[] a() {
        return new EnumC4764gA[]{F, G, H, I, J, K, L, M, N, O, P, Q, R, S};
    }

    public static EnumC4764gA valueOf(String str) {
        return (EnumC4764gA) Enum.valueOf(EnumC4764gA.class, str);
    }

    public static EnumC4764gA[] values() {
        return (EnumC4764gA[]) T.clone();
    }
}
