package androidx.work;

import android.net.Network;
import com.daaw.AbstractC2649Wi1;
import com.daaw.InterfaceC2508Uz0;
import com.daaw.InterfaceC4545fP;
import com.daaw.InterfaceC8357t11;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {
    public UUID a;
    public b b;
    public Set c;
    public a d;
    public int e;
    public Executor f;
    public InterfaceC8357t11 g;
    public AbstractC2649Wi1 h;
    public InterfaceC2508Uz0 i;
    public InterfaceC4545fP j;

    public static class a {
        public List a;
        public List b;
        public Network c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.a = list;
            this.b = list;
        }
    }

    public WorkerParameters(UUID uuid, b bVar, Collection collection, a aVar, int i, Executor executor, InterfaceC8357t11 interfaceC8357t11, AbstractC2649Wi1 abstractC2649Wi1, InterfaceC2508Uz0 interfaceC2508Uz0, InterfaceC4545fP interfaceC4545fP) {
        this.a = uuid;
        this.b = bVar;
        this.c = new HashSet(collection);
        this.d = aVar;
        this.e = i;
        this.f = executor;
        this.g = interfaceC8357t11;
        this.h = abstractC2649Wi1;
        this.i = interfaceC2508Uz0;
        this.j = interfaceC4545fP;
    }

    public Executor a() {
        return this.f;
    }

    public InterfaceC4545fP b() {
        return this.j;
    }

    public UUID c() {
        return this.a;
    }

    public b d() {
        return this.b;
    }

    public Network e() {
        return this.d.c;
    }

    public InterfaceC2508Uz0 f() {
        return this.i;
    }

    public int g() {
        return this.e;
    }

    public Set h() {
        return this.c;
    }

    public InterfaceC8357t11 i() {
        return this.g;
    }

    public List j() {
        return this.d.a;
    }

    public List k() {
        return this.d.b;
    }

    public AbstractC2649Wi1 l() {
        return this.h;
    }
}
