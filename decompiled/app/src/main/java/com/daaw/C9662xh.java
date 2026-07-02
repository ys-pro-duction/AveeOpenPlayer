package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9662xh implements O7 {
    public final AbstractC8670u80 a;
    public final AP b;
    public final Map c;
    public final boolean d;
    public final O90 e;

    public C9662xh(AbstractC8670u80 abstractC8670u80, AP ap, Map map, boolean z) {
        G10.g(abstractC8670u80, "builtIns");
        G10.g(ap, "fqName");
        G10.g(map, "allValueArguments");
        this.a = abstractC8670u80;
        this.b = ap;
        this.c = map;
        this.d = z;
        this.e = AbstractC3192ab0.b(EnumC7395pb0.C, new C9383wh(this));
    }

    public static final YS0 b(C9662xh c9662xh) {
        G10.g(c9662xh, "this$0");
        return c9662xh.a.o(c9662xh.d()).s();
    }

    @Override // com.daaw.O7
    public AP d() {
        return this.b;
    }

    @Override // com.daaw.O7
    public I80 getType() {
        Object value = this.e.getValue();
        G10.f(value, "getValue(...)");
        return (I80) value;
    }

    @Override // com.daaw.O7
    public RU0 j() {
        RU0 ru0 = RU0.a;
        G10.f(ru0, "NO_SOURCE");
        return ru0;
    }

    @Override // com.daaw.O7
    public Map k() {
        return this.c;
    }

    public /* synthetic */ C9662xh(AbstractC8670u80 abstractC8670u80, AP ap, Map map, boolean z, int i, AbstractC2911Yw abstractC2911Yw) {
        this(abstractC8670u80, ap, map, (i & 8) != 0 ? false : z);
    }
}
