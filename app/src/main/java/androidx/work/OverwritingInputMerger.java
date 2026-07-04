package androidx.work;

import androidx.work.b;
import com.daaw.SZ;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends SZ {
    @Override // com.daaw.SZ
    public b b(List list) {
        b.a aVar = new b.a();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.putAll(((b) it.next()).h());
        }
        aVar.d(map);
        return aVar.a();
    }
}
