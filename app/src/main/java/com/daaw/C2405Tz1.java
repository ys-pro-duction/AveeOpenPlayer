package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Tz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2405Tz1 {
    public int b;
    public final Object a = new Object();
    public final List c = new LinkedList();

    public final C2301Sz1 a(boolean z) {
        synchronized (this.a) {
            try {
                C2301Sz1 c2301Sz1 = null;
                if (this.c.isEmpty()) {
                    AbstractC4274eT1.zze("Queue empty");
                    return null;
                }
                int i = 0;
                if (this.c.size() < 2) {
                    C2301Sz1 c2301Sz12 = (C2301Sz1) this.c.get(0);
                    if (z) {
                        this.c.remove(0);
                    } else {
                        c2301Sz12.i();
                    }
                    return c2301Sz12;
                }
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (C2301Sz1 c2301Sz13 : this.c) {
                    int iB = c2301Sz13.b();
                    if (iB > i2) {
                        i = i3;
                    }
                    int i4 = iB > i2 ? iB : i2;
                    if (iB > i2) {
                        c2301Sz1 = c2301Sz13;
                    }
                    i3++;
                    i2 = i4;
                }
                this.c.remove(i);
                return c2301Sz1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(C2301Sz1 c2301Sz1) {
        synchronized (this.a) {
            try {
                if (this.c.size() >= 10) {
                    AbstractC4274eT1.zze("Queue is full, current size = " + this.c.size());
                    this.c.remove(0);
                }
                int i = this.b;
                this.b = i + 1;
                c2301Sz1.j(i);
                c2301Sz1.n();
                this.c.add(c2301Sz1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(C2301Sz1 c2301Sz1) {
        synchronized (this.a) {
            try {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    C2301Sz1 c2301Sz12 = (C2301Sz1) it.next();
                    if (zzt.zzo().h().zzN()) {
                        if (!zzt.zzo().h().zzO() && !c2301Sz1.equals(c2301Sz12) && c2301Sz12.f().equals(c2301Sz1.f())) {
                            it.remove();
                            return true;
                        }
                    } else if (!c2301Sz1.equals(c2301Sz12) && c2301Sz12.d().equals(c2301Sz1.d())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(C2301Sz1 c2301Sz1) {
        synchronized (this.a) {
            try {
                return this.c.contains(c2301Sz1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
