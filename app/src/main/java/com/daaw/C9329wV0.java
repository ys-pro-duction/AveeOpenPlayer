package com.daaw;

/* JADX INFO: renamed from: com.daaw.wV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9329wV0 {
    public final AbstractC8833uk a;
    public final boolean b;
    public final b c;
    public final int d;

    /* JADX INFO: renamed from: com.daaw.wV0$a */
    public class a implements b {
        public final /* synthetic */ AbstractC8833uk a;

        public a(AbstractC8833uk abstractC8833uk) {
            this.a = abstractC8833uk;
        }
    }

    /* JADX INFO: renamed from: com.daaw.wV0$b */
    public interface b {
    }

    public C9329wV0(b bVar) {
        this(bVar, false, AbstractC8833uk.c(), Integer.MAX_VALUE);
    }

    public static C9329wV0 a(char c) {
        return b(AbstractC8833uk.b(c));
    }

    public static C9329wV0 b(AbstractC8833uk abstractC8833uk) {
        AbstractC7785qy0.n(abstractC8833uk);
        return new C9329wV0(new a(abstractC8833uk));
    }

    public C9329wV0 c() {
        return d(AbstractC8833uk.e());
    }

    public C9329wV0 d(AbstractC8833uk abstractC8833uk) {
        AbstractC7785qy0.n(abstractC8833uk);
        return new C9329wV0(this.c, this.b, abstractC8833uk, this.d);
    }

    public C9329wV0(b bVar, boolean z, AbstractC8833uk abstractC8833uk, int i) {
        this.c = bVar;
        this.b = z;
        this.a = abstractC8833uk;
        this.d = i;
    }
}
