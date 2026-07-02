package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.d;
import com.daaw.AbstractC1772Od0;
import com.daaw.C1793Oi1;
import com.daaw.C7431pi1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final String e = AbstractC1772Od0.f("ConstraintsCmdHandler");
    public final Context a;
    public final int b;
    public final d c;
    public final C7431pi1 d;

    public b(Context context, int i, d dVar) {
        this.a = context;
        this.b = i;
        this.c = dVar;
        this.d = new C7431pi1(context, dVar.f(), null);
    }

    public void a() {
        List<C1793Oi1> listF = this.c.g().o().B().f();
        ConstraintProxy.a(this.a, listF);
        this.d.d(listF);
        ArrayList arrayList = new ArrayList(listF.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (C1793Oi1 c1793Oi1 : listF) {
            String str = c1793Oi1.a;
            if (jCurrentTimeMillis >= c1793Oi1.a() && (!c1793Oi1.b() || this.d.c(str))) {
                arrayList.add(c1793Oi1);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((C1793Oi1) it.next()).a;
            Intent intentB = a.b(this.a, str2);
            AbstractC1772Od0.c().a(e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            d dVar = this.c;
            dVar.k(new d.b(dVar, intentB, this.b));
        }
        this.d.e();
    }
}
