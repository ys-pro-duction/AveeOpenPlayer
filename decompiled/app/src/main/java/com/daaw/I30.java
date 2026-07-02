package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class I30 {
    public static final a e = new a(null);
    public static final I30 f = new I30(null, null, false, false, 8, null);
    public final EnumC3262ap0 a;
    public final EnumC3247am0 b;
    public final boolean c;
    public final boolean d;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final I30 a() {
            return I30.f;
        }

        public a() {
        }
    }

    public I30(EnumC3262ap0 enumC3262ap0, EnumC3247am0 enumC3247am0, boolean z, boolean z2) {
        this.a = enumC3262ap0;
        this.b = enumC3247am0;
        this.c = z;
        this.d = z2;
    }

    public final boolean b() {
        return this.c;
    }

    public final EnumC3247am0 c() {
        return this.b;
    }

    public final EnumC3262ap0 d() {
        return this.a;
    }

    public final boolean e() {
        return this.d;
    }

    public /* synthetic */ I30(EnumC3262ap0 enumC3262ap0, EnumC3247am0 enumC3247am0, boolean z, boolean z2, int i, AbstractC2911Yw abstractC2911Yw) {
        this(enumC3262ap0, enumC3247am0, z, (i & 8) != 0 ? false : z2);
    }
}
