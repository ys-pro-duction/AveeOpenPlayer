package com.daaw;

import com.daaw.AbstractC7818r50;

/* JADX INFO: renamed from: com.daaw.t50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8376t50 implements InterfaceC8097s50 {
    public static final C8376t50 a = new C8376t50();

    /* JADX INFO: renamed from: com.daaw.t50$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC8067rz0.values().length];
            try {
                iArr[EnumC8067rz0.H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8067rz0.I.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8067rz0.J.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC8067rz0.K.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC8067rz0.L.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC8067rz0.M.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC8067rz0.N.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC8067rz0.O.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    @Override // com.daaw.InterfaceC8097s50
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC7818r50 d(AbstractC7818r50 abstractC7818r50) {
        G10.g(abstractC7818r50, "possiblyPrimitiveType");
        if (!(abstractC7818r50 instanceof AbstractC7818r50.d)) {
            return abstractC7818r50;
        }
        AbstractC7818r50.d dVar = (AbstractC7818r50.d) abstractC7818r50;
        if (dVar.i() == null) {
            return abstractC7818r50;
        }
        String strF = Y40.c(dVar.i().n()).f();
        G10.f(strF, "getInternalName(...)");
        return c(strF);
    }

    @Override // com.daaw.InterfaceC8097s50
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC7818r50 b(String str) {
        EnumC6703n50 enumC6703n50;
        G10.g(str, "representation");
        str.length();
        char cCharAt = str.charAt(0);
        EnumC6703n50[] enumC6703n50ArrValues = EnumC6703n50.values();
        int length = enumC6703n50ArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                enumC6703n50 = null;
                break;
            }
            enumC6703n50 = enumC6703n50ArrValues[i];
            if (enumC6703n50.h().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (enumC6703n50 != null) {
            return new AbstractC7818r50.d(enumC6703n50);
        }
        if (cCharAt == 'V') {
            return new AbstractC7818r50.d(null);
        }
        if (cCharAt == '[') {
            String strSubstring = str.substring(1);
            G10.f(strSubstring, "substring(...)");
            return new AbstractC7818r50.a(b(strSubstring));
        }
        if (cCharAt == 'L') {
            BY0.C(str, ';', false, 2, null);
        }
        String strSubstring2 = str.substring(1, str.length() - 1);
        G10.f(strSubstring2, "substring(...)");
        return new AbstractC7818r50.c(strSubstring2);
    }

    @Override // com.daaw.InterfaceC8097s50
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC7818r50.c c(String str) {
        G10.g(str, "internalName");
        return new AbstractC7818r50.c(str);
    }

    @Override // com.daaw.InterfaceC8097s50
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC7818r50 f(EnumC8067rz0 enumC8067rz0) {
        G10.g(enumC8067rz0, "primitiveType");
        switch (a.a[enumC8067rz0.ordinal()]) {
            case 1:
                return AbstractC7818r50.a.a();
            case 2:
                return AbstractC7818r50.a.c();
            case 3:
                return AbstractC7818r50.a.b();
            case 4:
                return AbstractC7818r50.a.h();
            case 5:
                return AbstractC7818r50.a.f();
            case 6:
                return AbstractC7818r50.a.e();
            case 7:
                return AbstractC7818r50.a.g();
            case 8:
                return AbstractC7818r50.a.d();
            default:
                throw new C6902no0();
        }
    }

    @Override // com.daaw.InterfaceC8097s50
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC7818r50 e() {
        return c("java/lang/Class");
    }

    @Override // com.daaw.InterfaceC8097s50
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String a(AbstractC7818r50 abstractC7818r50) {
        String strH;
        G10.g(abstractC7818r50, "type");
        if (abstractC7818r50 instanceof AbstractC7818r50.a) {
            return '[' + a(((AbstractC7818r50.a) abstractC7818r50).i());
        }
        if (abstractC7818r50 instanceof AbstractC7818r50.d) {
            EnumC6703n50 enumC6703n50I = ((AbstractC7818r50.d) abstractC7818r50).i();
            return (enumC6703n50I == null || (strH = enumC6703n50I.h()) == null) ? "V" : strH;
        }
        if (!(abstractC7818r50 instanceof AbstractC7818r50.c)) {
            throw new C6902no0();
        }
        return 'L' + ((AbstractC7818r50.c) abstractC7818r50).i() + ';';
    }
}
