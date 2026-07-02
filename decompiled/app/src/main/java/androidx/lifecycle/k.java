package androidx.lifecycle;

import com.daaw.AbstractC0552Cm0;
import com.daaw.AbstractC10182zZ0;
import com.daaw.AbstractC1349Kb0;
import com.daaw.C7850rC;
import com.daaw.G10;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final AbstractC1349Kb0 a(g gVar) {
        h hVar;
        G10.g(gVar, "<this>");
        do {
            h hVar2 = (h) gVar.c().get();
            if (hVar2 != null) {
                return hVar2;
            }
            hVar = new h(gVar, AbstractC10182zZ0.b(null, 1, null).U(C7850rC.c().k1()));
        } while (!AbstractC0552Cm0.a(gVar.c(), null, hVar));
        hVar.b();
        return hVar;
    }
}
