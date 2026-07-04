package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: j$.util.stream.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C10492s1 extends CountedCompleter {
    public final E0 a;
    public final int b;
    public final /* synthetic */ int c;
    public final Object d;

    public C10492s1(E0 e0, Object obj, int i) {
        this.c = i;
        this.a = e0;
        this.b = 0;
        this.d = obj;
    }

    public C10492s1(C10492s1 c10492s1, E0 e0, int i, byte b) {
        super(c10492s1);
        this.a = e0;
        this.b = i;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C10492s1 c10492s1A = this;
        while (c10492s1A.a.q() != 0) {
            c10492s1A.setPendingCount(c10492s1A.a.q() - 1);
            int i = 0;
            int iCount = 0;
            while (i < c10492s1A.a.q() - 1) {
                C10492s1 c10492s1A2 = c10492s1A.a(i, c10492s1A.b + iCount);
                iCount = (int) (c10492s1A2.a.count() + ((long) iCount));
                c10492s1A2.fork();
                i++;
            }
            c10492s1A = c10492s1A.a(i, c10492s1A.b + iCount);
        }
        switch (c10492s1A.c) {
            case 0:
                ((D0) c10492s1A.a).r(c10492s1A.b, c10492s1A.d);
                break;
            default:
                c10492s1A.a.i((Object[]) c10492s1A.d, c10492s1A.b);
                break;
        }
        c10492s1A.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10492s1(C10492s1 c10492s1, E0 e0, int i) {
        this(c10492s1, e0, i, (byte) 0);
        this.c = 1;
        this.d = (Object[]) c10492s1.d;
    }

    public final C10492s1 a(int i, int i2) {
        switch (this.c) {
            case 0:
                return new C10492s1(this, ((D0) this.a).b(i), i2);
            default:
                return new C10492s1(this, this.a.b(i), i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10492s1(C10492s1 c10492s1, D0 d0, int i) {
        this(c10492s1, d0, i, (byte) 0);
        this.c = 0;
        this.d = c10492s1.d;
    }
}
