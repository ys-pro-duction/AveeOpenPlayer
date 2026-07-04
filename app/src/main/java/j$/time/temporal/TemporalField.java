package j$.time.temporal;

import j$.time.format.w;
import j$.time.format.x;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public interface TemporalField {
    TemporalUnit getBaseUnit();

    long k(l lVar);

    l n(HashMap map, w wVar, x xVar);

    boolean q(l lVar);

    k r(k kVar, long j);

    ValueRange range();

    ValueRange u(l lVar);

    boolean y();
}
