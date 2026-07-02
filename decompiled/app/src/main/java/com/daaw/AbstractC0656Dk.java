package com.daaw;

/* JADX INFO: renamed from: com.daaw.Dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0656Dk {
    public final boolean a;

    /* JADX INFO: renamed from: com.daaw.Dk$a */
    public static final class a extends AbstractC0656Dk {
        public static final a b = new a();

        public a() {
            super(false, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dk$b */
    public static final class b extends AbstractC0656Dk {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(false, null);
            G10.g(str, "error");
            this.b = str;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dk$c */
    public static final class c extends AbstractC0656Dk {
        public static final c b = new c();

        public c() {
            super(true, null);
        }
    }

    public /* synthetic */ AbstractC0656Dk(boolean z, AbstractC2911Yw abstractC2911Yw) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    public AbstractC0656Dk(boolean z) {
        this.a = z;
    }
}
