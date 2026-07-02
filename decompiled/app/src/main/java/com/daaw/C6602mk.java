package com.daaw;

import com.daaw.AbstractC6323lk;
import com.daaw.C4999h10;
import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: renamed from: com.daaw.mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6602mk extends AbstractC6323lk {
    public final C7996rk a;
    public final G31 b;

    /* JADX INFO: renamed from: com.daaw.mk$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AbstractC6323lk.a.values().length];
            a = iArr;
            try {
                iArr[AbstractC6323lk.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AbstractC6323lk.a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AbstractC6323lk.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C6602mk(C7996rk c7996rk, G31 g31) {
        this.a = (C7996rk) AbstractC7785qy0.o(c7996rk, "tracer");
        this.b = (G31) AbstractC7785qy0.o(g31, "time");
    }

    public static void d(C6404m10 c6404m10, AbstractC6323lk.a aVar, String str) {
        Level levelF = f(aVar);
        if (C7996rk.f.isLoggable(levelF)) {
            C7996rk.d(c6404m10, levelF, str);
        }
    }

    public static void e(C6404m10 c6404m10, AbstractC6323lk.a aVar, String str, Object... objArr) {
        Level levelF = f(aVar);
        if (C7996rk.f.isLoggable(levelF)) {
            C7996rk.d(c6404m10, levelF, MessageFormat.format(str, objArr));
        }
    }

    public static Level f(AbstractC6323lk.a aVar) {
        int i = a.a[aVar.ordinal()];
        return (i == 1 || i == 2) ? Level.FINE : i != 3 ? Level.FINEST : Level.FINER;
    }

    public static C4999h10.b g(AbstractC6323lk.a aVar) {
        int i = a.a[aVar.ordinal()];
        return i != 1 ? i != 2 ? C4999h10.b.CT_INFO : C4999h10.b.CT_WARNING : C4999h10.b.CT_ERROR;
    }

    @Override // com.daaw.AbstractC6323lk
    public void a(AbstractC6323lk.a aVar, String str) {
        d(this.a.b(), aVar, str);
        if (c(aVar)) {
            h(aVar, str);
        }
    }

    @Override // com.daaw.AbstractC6323lk
    public void b(AbstractC6323lk.a aVar, String str, Object... objArr) {
        a(aVar, (c(aVar) || C7996rk.f.isLoggable(f(aVar))) ? MessageFormat.format(str, objArr) : null);
    }

    public final boolean c(AbstractC6323lk.a aVar) {
        return aVar != AbstractC6323lk.a.DEBUG && this.a.c();
    }

    public final void h(AbstractC6323lk.a aVar, String str) {
        if (aVar == AbstractC6323lk.a.DEBUG) {
            return;
        }
        this.a.f(new C4999h10.a().b(str).c(g(aVar)).e(this.b.a()).a());
    }
}
