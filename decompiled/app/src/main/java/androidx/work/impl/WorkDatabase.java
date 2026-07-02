package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.a;
import com.daaw.AbstractC8267si1;
import com.daaw.C9587xQ;
import com.daaw.InterfaceC0858Fi1;
import com.daaw.InterfaceC1170Ii1;
import com.daaw.InterfaceC1897Pi1;
import com.daaw.InterfaceC2233Si1;
import com.daaw.InterfaceC4142dz0;
import com.daaw.InterfaceC6951nz;
import com.daaw.InterfaceC7516q01;
import com.daaw.JZ0;
import com.daaw.KZ0;
import com.daaw.PJ0;
import com.daaw.QJ0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase extends QJ0 {
    public static final long l = TimeUnit.DAYS.toMillis(1);

    public class a implements KZ0.c {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.daaw.KZ0.c
        public KZ0 a(KZ0.b bVar) {
            KZ0.b.a aVarA = KZ0.b.a(this.a);
            aVarA.c(bVar.b).b(bVar.c).d(true);
            return new C9587xQ().a(aVarA.a());
        }
    }

    public class b extends QJ0.b {
        @Override // com.daaw.QJ0.b
        public void c(JZ0 jz0) {
            super.c(jz0);
            jz0.m();
            try {
                jz0.v(WorkDatabase.w());
                jz0.T();
            } finally {
                jz0.l0();
            }
        }
    }

    public static WorkDatabase s(Context context, Executor executor, boolean z) {
        QJ0.a aVarA;
        if (z) {
            aVarA = PJ0.c(context, WorkDatabase.class).c();
        } else {
            aVarA = PJ0.a(context, WorkDatabase.class, AbstractC8267si1.d());
            aVarA.f(new a(context));
        }
        return (WorkDatabase) aVarA.g(executor).a(u()).b(androidx.work.impl.a.a).b(new a.h(context, 2, 3)).b(androidx.work.impl.a.b).b(androidx.work.impl.a.c).b(new a.h(context, 5, 6)).b(androidx.work.impl.a.d).b(androidx.work.impl.a.e).b(androidx.work.impl.a.f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(androidx.work.impl.a.g).e().d();
    }

    public static QJ0.b u() {
        return new b();
    }

    public static long v() {
        return System.currentTimeMillis() - l;
    }

    public static String w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract InterfaceC1170Ii1 A();

    public abstract InterfaceC1897Pi1 B();

    public abstract InterfaceC2233Si1 C();

    public abstract InterfaceC6951nz t();

    public abstract InterfaceC4142dz0 x();

    public abstract InterfaceC7516q01 y();

    public abstract InterfaceC0858Fi1 z();
}
