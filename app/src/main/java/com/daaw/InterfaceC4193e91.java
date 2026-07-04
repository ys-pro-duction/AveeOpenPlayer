package com.daaw;

/* JADX INFO: renamed from: com.daaw.e91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4193e91 extends InterfaceC6258lW0 {

    /* JADX INFO: renamed from: com.daaw.e91$a */
    public static final class a implements InterfaceC4193e91, InterfaceC6258lW0 {
        public final C8788ub B;

        public a(C8788ub c8788ub) {
            G10.g(c8788ub, "current");
            this.B = c8788ub;
        }

        @Override // com.daaw.InterfaceC4193e91
        public boolean a() {
            return this.B.m();
        }

        @Override // com.daaw.InterfaceC6258lW0
        public Object getValue() {
            return this.B.getValue();
        }
    }

    boolean a();

    /* JADX INFO: renamed from: com.daaw.e91$b */
    public static final class b implements InterfaceC4193e91 {
        public final Object B;
        public final boolean C;

        public b(Object obj, boolean z) {
            G10.g(obj, "value");
            this.B = obj;
            this.C = z;
        }

        @Override // com.daaw.InterfaceC4193e91
        public boolean a() {
            return this.C;
        }

        @Override // com.daaw.InterfaceC6258lW0
        public Object getValue() {
            return this.B;
        }

        public /* synthetic */ b(Object obj, boolean z, int i, AbstractC2911Yw abstractC2911Yw) {
            this(obj, (i & 2) != 0 ? true : z);
        }
    }
}
