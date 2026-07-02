package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.daaw.TO;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class NO {
    public static final C9653xf0 a = new C9653xf0(16);
    public static final ExecutorService b = AbstractC7597qI0.a("fonts-androidx", 10, 10000);
    public static final Object c = new Object();
    public static final BS0 d = new BS0();

    public class a implements Callable {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ LO c;
        public final /* synthetic */ int d;

        public a(String str, Context context, LO lo, int i) {
            this.a = str;
            this.b = context;
            this.c = lo;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return NO.c(this.a, this.b, this.c, this.d);
        }
    }

    public class b implements InterfaceC8589tr {
        public final /* synthetic */ C1895Pi a;

        public b(C1895Pi c1895Pi) {
            this.a = c1895Pi;
        }

        @Override // com.daaw.InterfaceC8589tr
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.a.b(eVar);
        }
    }

    public class c implements Callable {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ LO c;
        public final /* synthetic */ int d;

        public c(String str, Context context, LO lo, int i) {
            this.a = str;
            this.b = context;
            this.c = lo;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return NO.c(this.a, this.b, this.c, this.d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    public class d implements InterfaceC8589tr {
        public final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        @Override // com.daaw.InterfaceC8589tr
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (NO.c) {
                try {
                    BS0 bs0 = NO.d;
                    ArrayList arrayList = (ArrayList) bs0.get(this.a);
                    if (arrayList == null) {
                        return;
                    }
                    bs0.remove(this.a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((InterfaceC8589tr) arrayList.get(i)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static String a(LO lo, int i) {
        return lo.d() + "-" + i;
    }

    public static int b(TO.a aVar) {
        int i = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        TO.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i = 0;
            for (TO.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i;
    }

    public static e c(String str, Context context, LO lo, int i) {
        C9653xf0 c9653xf0 = a;
        Typeface typeface = (Typeface) c9653xf0.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            TO.a aVarE = HO.e(context, lo, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = Q81.b(context, null, aVarE.b(), i);
            if (typefaceB == null) {
                return new e(-3);
            }
            c9653xf0.d(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    public static Typeface d(Context context, LO lo, int i, Executor executor, C1895Pi c1895Pi) {
        String strA = a(lo, i);
        Typeface typeface = (Typeface) a.c(strA);
        if (typeface != null) {
            c1895Pi.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(c1895Pi);
        synchronized (c) {
            try {
                BS0 bs0 = d;
                ArrayList arrayList = (ArrayList) bs0.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                bs0.put(strA, arrayList2);
                c cVar = new c(strA, context, lo, i);
                if (executor == null) {
                    executor = b;
                }
                AbstractC7597qI0.b(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface e(Context context, LO lo, C1895Pi c1895Pi, int i, int i2) {
        String strA = a(lo, i);
        Typeface typeface = (Typeface) a.c(strA);
        if (typeface != null) {
            c1895Pi.b(new e(typeface));
            return typeface;
        }
        if (i2 == -1) {
            e eVarC = c(strA, context, lo, i);
            c1895Pi.b(eVarC);
            return eVarC.a;
        }
        try {
            e eVar = (e) AbstractC7597qI0.c(b, new a(strA, context, lo, i), i2);
            c1895Pi.b(eVar);
            return eVar.a;
        } catch (InterruptedException unused) {
            c1895Pi.b(new e(-3));
            return null;
        }
    }

    public static final class e {
        public final Typeface a;
        public final int b;

        public e(int i) {
            this.a = null;
            this.b = i;
        }

        public boolean a() {
            return this.b == 0;
        }

        public e(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}
