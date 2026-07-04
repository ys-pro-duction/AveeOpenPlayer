package com.daaw;

import androidx.work.impl.WorkDatabase;
import com.daaw.InterfaceC2054Qq0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* JADX INFO: renamed from: com.daaw.Zi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC2959Zi implements Runnable {
    public final C2158Rq0 B = new C2158Rq0();

    /* JADX INFO: renamed from: com.daaw.Zi$a */
    public class a extends AbstractRunnableC2959Zi {
        public final /* synthetic */ C0537Ci1 C;
        public final /* synthetic */ UUID D;

        public a(C0537Ci1 c0537Ci1, UUID uuid) {
            this.C = c0537Ci1;
            this.D = uuid;
        }

        @Override // com.daaw.AbstractRunnableC2959Zi
        public void h() {
            WorkDatabase workDatabaseO = this.C.o();
            workDatabaseO.c();
            try {
                a(this.C, this.D.toString());
                workDatabaseO.r();
                workDatabaseO.g();
                g(this.C);
            } catch (Throwable th) {
                workDatabaseO.g();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zi$b */
    public class b extends AbstractRunnableC2959Zi {
        public final /* synthetic */ C0537Ci1 C;
        public final /* synthetic */ String D;

        public b(C0537Ci1 c0537Ci1, String str) {
            this.C = c0537Ci1;
            this.D = str;
        }

        @Override // com.daaw.AbstractRunnableC2959Zi
        public void h() {
            WorkDatabase workDatabaseO = this.C.o();
            workDatabaseO.c();
            try {
                Iterator it = workDatabaseO.B().o(this.D).iterator();
                while (it.hasNext()) {
                    a(this.C, (String) it.next());
                }
                workDatabaseO.r();
                workDatabaseO.g();
                g(this.C);
            } catch (Throwable th) {
                workDatabaseO.g();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zi$c */
    public class c extends AbstractRunnableC2959Zi {
        public final /* synthetic */ C0537Ci1 C;
        public final /* synthetic */ String D;
        public final /* synthetic */ boolean E;

        public c(C0537Ci1 c0537Ci1, String str, boolean z) {
            this.C = c0537Ci1;
            this.D = str;
            this.E = z;
        }

        @Override // com.daaw.AbstractRunnableC2959Zi
        public void h() {
            WorkDatabase workDatabaseO = this.C.o();
            workDatabaseO.c();
            try {
                Iterator it = workDatabaseO.B().j(this.D).iterator();
                while (it.hasNext()) {
                    a(this.C, (String) it.next());
                }
                workDatabaseO.r();
                workDatabaseO.g();
                if (this.E) {
                    g(this.C);
                }
            } catch (Throwable th) {
                workDatabaseO.g();
                throw th;
            }
        }
    }

    public static AbstractRunnableC2959Zi b(UUID uuid, C0537Ci1 c0537Ci1) {
        return new a(c0537Ci1, uuid);
    }

    public static AbstractRunnableC2959Zi c(String str, C0537Ci1 c0537Ci1, boolean z) {
        return new c(c0537Ci1, str, z);
    }

    public static AbstractRunnableC2959Zi d(String str, C0537Ci1 c0537Ci1) {
        return new b(c0537Ci1, str);
    }

    public void a(C0537Ci1 c0537Ci1, String str) {
        f(c0537Ci1.o(), str);
        c0537Ci1.m().l(str);
        Iterator it = c0537Ci1.n().iterator();
        while (it.hasNext()) {
            ((InterfaceC8732uN0) it.next()).d(str);
        }
    }

    public InterfaceC2054Qq0 e() {
        return this.B;
    }

    public final void f(WorkDatabase workDatabase, String str) {
        InterfaceC1897Pi1 interfaceC1897Pi1B = workDatabase.B();
        InterfaceC6951nz interfaceC6951nzT = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            EnumC9111vi1 enumC9111vi1L = interfaceC1897Pi1B.l(str2);
            if (enumC9111vi1L != EnumC9111vi1.SUCCEEDED && enumC9111vi1L != EnumC9111vi1.FAILED) {
                interfaceC1897Pi1B.k(EnumC9111vi1.CANCELLED, str2);
            }
            linkedList.addAll(interfaceC6951nzT.a(str2));
        }
    }

    public void g(C0537Ci1 c0537Ci1) {
        AbstractC9855yN0.b(c0537Ci1.i(), c0537Ci1.o(), c0537Ci1.n());
    }

    public abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.B.a(InterfaceC2054Qq0.a);
        } catch (Throwable th) {
            this.B.a(new InterfaceC2054Qq0.b.a(th));
        }
    }
}
