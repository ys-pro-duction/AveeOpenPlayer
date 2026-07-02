package com.daaw;

/* JADX INFO: renamed from: com.daaw.Wp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2676Wp0 extends AbstractC3958dK {
    public final M00 B;
    public final M00 C;
    public final C5407iV0 D;

    /* JADX INFO: renamed from: com.daaw.Wp0$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC5128hV0.values().length];
            a = iArr;
            try {
                iArr[EnumC5128hV0.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC5128hV0.HASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC5128hV0.W.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC5128hV0.L.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC5128hV0.QUESTION_MARK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C2676Wp0(M00 m00) {
        this(m00, new C5407iV0(EnumC5128hV0.NONE));
    }

    @Override // com.daaw.AbstractC3958dK
    public AbstractC3958dK a(InterfaceC4236eK interfaceC4236eK) {
        return interfaceC4236eK.c(this);
    }

    @Override // com.daaw.AbstractC3958dK
    public String c() {
        int i = a.a[this.D.a().ordinal()];
        if (i == 1) {
            return h().toString();
        }
        if (i == 2) {
            return String.format("%s#%s", h(), e());
        }
        if (i == 3) {
            return i(h()) ? "W" : String.format("%sW", h());
        }
        if (i != 4) {
            return i != 5 ? this.D.toString() : "?";
        }
        if (!i(h())) {
            return String.format("%sL", h());
        }
        return "L" + f();
    }

    public M00 e() {
        return this.C;
    }

    public final String f() {
        return i(e()) ? "" : String.format("-%s", e());
    }

    public C5407iV0 g() {
        return this.D;
    }

    public M00 h() {
        return this.B;
    }

    public final boolean i(M00 m00) {
        return m00.a().intValue() == -1;
    }

    public C2676Wp0(M00 m00, C5407iV0 c5407iV0) {
        this(m00, c5407iV0, new M00(-1));
        AbstractC6948ny0.a(!c5407iV0.a().equals(EnumC5128hV0.HASH), "value missing for a#b cron expression");
    }

    public C2676Wp0(M00 m00, C5407iV0 c5407iV0, M00 m002) {
        AbstractC6948ny0.c(m00, "time must not be null");
        AbstractC6948ny0.c(c5407iV0, "special char must not null");
        AbstractC6948ny0.c(m002, "nth value must not be null");
        this.B = m00;
        this.D = c5407iV0;
        this.C = m002;
    }
}
