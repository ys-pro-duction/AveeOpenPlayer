package com.daaw;

/* JADX INFO: renamed from: com.daaw.ur0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8869ur0 {

    /* JADX INFO: renamed from: com.daaw.ur0$a */
    public static final class a extends AbstractC8869ur0 {
        public final C3103aF0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3103aF0 c3103aF0) {
            super(null);
            G10.g(c3103aF0, "rect");
            this.a = c3103aF0;
        }

        public final C3103aF0 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && G10.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.daaw.ur0$b */
    public static final class b extends AbstractC8869ur0 {
        public final C3680cK0 a;
        public final InterfaceC6090kt0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3680cK0 c3680cK0) {
            super(0 == true ? 1 : 0);
            G10.g(c3680cK0, "roundRect");
            InterfaceC6090kt0 interfaceC6090kt0A = null;
            this.a = c3680cK0;
            if (!AbstractC9155vr0.f(c3680cK0)) {
                interfaceC6090kt0A = AbstractC6428m6.a();
                interfaceC6090kt0A.l(c3680cK0);
            }
            this.b = interfaceC6090kt0A;
        }

        public final C3680cK0 a() {
            return this.a;
        }

        public final InterfaceC6090kt0 b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && G10.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public /* synthetic */ AbstractC8869ur0(AbstractC2911Yw abstractC2911Yw) {
        this();
    }

    public AbstractC8869ur0() {
    }
}
